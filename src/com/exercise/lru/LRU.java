package com.exercise.lru;

import com.exercise.lru.ds.LinkedList;
import com.exercise.lru.ds.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * This will work only for integer as value.
 */
public class LRU<K, Integer> {
    final static int LIMIT = 10;
    final static double LOAD_FACTOR = 0.6;
    Map<String, Node> map = new HashMap<>();
    private LinkedList<String> list = new LinkedList<String>();

    public Node getItem(String key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            list.removeNodeAndAddToLast(node);
            System.out.println("Served from CACHE, Super Hero with power level : [" +
                    node.getObj() + "] and name : [" + key + "]");
            return node;
        }
        return getFromDB(key);
    }

    private Node getFromDB(String key) {
        //get data from DB
        Random random = new Random();
        int inte = random.nextInt(10);
        Node<String> node = new Node<String>();
        node.setObj("Power :: " + inte);
        list.addLast(node);
        map.put(key, node);
        System.out.println("Not In Cache Served from DB, Super Hero with power level : [" +
                node.getObj() + "] and name : [" + key + "]");
        removeItemFromCache();
        return node;
    }

    private void removeItemFromCache() {
        if (list.getSize() >= LOAD_FACTOR * LIMIT) {
            Node node1 = list.removeFirstNode();
            System.out.println("Removed Node :: Value => [" +
                    node1.getObj() + "]");
            map.remove(node1);
        }
    }

    public void invalidateCache() {
        list = new LinkedList<String>();
    }
}
