package collections;

import java.util.*;

public class ListToMap {
    public static void main(String[] args) {
        List<Integer> sourceList = new ArrayList<>();
        sourceList.add(0);
        sourceList.add(1);
        sourceList.add(2);
        sourceList.add(3);
        sourceList.add(4);
        sourceList.add(5);
        sourceList.add(6);
        sourceList.add(0);
        sourceList.add(1);
        sourceList.add(2);
        sourceList.add(3);
        Map<Integer, Integer> targetSet = new HashMap<>();
        for (int x : sourceList){
            int newValue = targetSet.getOrDefault(x, 0) + 1;
            targetSet.put(x, newValue);
        }
        System.out.println(targetSet);
    }
}