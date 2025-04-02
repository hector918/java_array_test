package org.example;

public class FilterEvenNumbers {

    public static int[] filterEvenNumbersFunc(int[] numArr){
        if(numArr == null) throw new IllegalArgumentException("input can not be null.");
        int count = 0;
        for(int num: numArr) if(num % 2 == 0){
            count++;
        }
        int[] ret = new int[count];
        int index = 0;
        for(int num: numArr) if(num % 2 == 0){
            ret[index] = num;
            index++;

        }
        return ret;
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }

}



