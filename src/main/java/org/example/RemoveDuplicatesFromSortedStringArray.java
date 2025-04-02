package org.example;


import java.util.*;

public class RemoveDuplicatesFromSortedStringArray {

    public static String[] removeDuplicatesFromSortedStringArray(String[] strArr){
        if(strArr == null) throw new IllegalArgumentException("input can not be null.");

        Map<String, Integer> map = new LinkedHashMap<>();

        for(String str: strArr) map.put(str, 0);

        return map.keySet().toArray(new String[0]);
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
}
