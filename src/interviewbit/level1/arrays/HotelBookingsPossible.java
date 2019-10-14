package interviewbit.level1.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class HotelBookingsPossible {
    public static void main(String[] args) {

        System.out.println("Result ::" + new HotelBookingsPossible().hotel(null,null,0));
    }
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);
        for(int i=0; i<arrive.size();i++){
            if(i+K < arrive.size() && arrive.get(i+K)<depart.get(i)){
                return false;
            }
        }
        return true;
    }
}
