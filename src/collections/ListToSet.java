package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
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
        System.out.println(sourceList);
        Set<Integer> targetSet = new HashSet<>(sourceList);
        System.out.println(targetSet);
    }
}