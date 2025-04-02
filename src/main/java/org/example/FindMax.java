package org.example;

public class FindMax {

    public static int findMax(int[] intArr){
        if(intArr.length == 0) throw new IllegalArgumentException("array is empty.");

        int max = Integer.MIN_VALUE;
        for(int num: intArr) max = Math.max(max, num);

        return max;
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
}
