#Get credential
$file = "C:\PowerShell\updatedHostFile\hosts"
$etcHost = "C:\Windows\System32\drivers\etc\hosts"
$oldIPfile = "C:\PowerShell\oldip"
$alldomainsfile = "C:\PowerShell\domains"
$ips = [System.Net.Dns]::GetHostAddresses("roche-eu-64-prod-4-1134575907.eu-west-1.elb.amazonaws.com")
$ip = [regex]::Split($ips, " ")
$ip1 = $ip[0]
$ip2 = $ip[1]

function add-host([string]$filename, [string]$ip, [string]$hostname) {
    remove-host $filename $hostname
	$ip + "`t`t" + $hostname | Out-File -encoding ASCII -append $filename
}

function remove-host([string]$filename, [string]$hostname) {
	$c = Get-Content $filename
	$newLines = @()
	
	foreach ($line in $c) {
		$bits = [regex]::Split($line, "\t+")
		if ($bits.count -eq 2) {
			if ($bits[1] -ne $hostname) {
				$newLines += $line
			}
		} else {
			$newLines += $line
		}
	}
	
	# Write file
	Clear-Content $filename
	foreach ($line in $newLines) {
		$line | Out-File -encoding ASCII -append $filename
	}
}

function print-hosts([string]$filename) {
	$c = Get-Content $filename
	
	foreach ($line in $c) {
		$bits = [regex]::Split($line, " ")
		if ($bits.count -eq 2) {
			Write-Host $bits[0] `t`t $bits[1]
		}
	}
}

function add-hosts() {
	$c = Get-Content $alldomainsfile
	
	foreach ($line in $c) {
        add-host $file $ip1 $line
	}
    update-ip
}


function update-ip() {
	Clear-Content $oldIPfile
	$ip1 | Out-File -encoding ASCII -append $filename
    Copy-Item $file $etcHost
}

function verify-ip([string]$filename) {
	$c = Get-Content $filename

	if(-not [string]::IsNullOrEmpty($ip1)) {          
	    foreach ($line in $c) {    

		    if ($line -ne $ip1 -AND $line -ne $ip2) {
                add-hosts
                #Write-Host $ips
		    }
	    }
    }
}

verify-ip $oldIPfile