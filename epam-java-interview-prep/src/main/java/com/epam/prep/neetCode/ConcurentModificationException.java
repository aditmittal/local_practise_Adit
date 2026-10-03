package com.epam.prep.neetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurentModificationException {
    public static void main(String[] args){
        Map<Integer, Integer> map = new HashMap<>();

        map.put(1,2);
        map.put(2,3);
        map.put(3,4);
        map.put(4,5);
        map.put(5,12);
        map.put(6,13);
        map.put(7,41);
        map.put(8,15);

        Iterator<Integer> iterator = map.keySet().iterator();

        while (iterator.hasNext()){
            Integer key = iterator.next();
            if(key==2){
                iterator.remove();
            }
        }
        map.keySet().removeIf(key -> key == 5);

        System.out.println(map);
    }
}
