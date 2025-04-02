package org.example;

public class FindSecondLargest {

    public static int findSecondLargest(int[] intArr){
        if(intArr == null) throw new IllegalArgumentException("input can not be null.");
        if(intArr.length < 2) throw new IllegalArgumentException("input array at least have 2 items.");

        int maxInt = Math.max(intArr[0], intArr[1]);
        int secInt = Math.min(intArr[0], intArr[1]);

        for(int index = 2; index < intArr.length; index++){
            if(intArr[index] > maxInt){
                secInt = maxInt;
                maxInt = intArr[index];
            }else if(intArr[index] > secInt){
                secInt = intArr[index];
            }
        }

        if(maxInt == secInt) throw new IllegalArgumentException("first largest same as second largest.");

        return secInt;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }

}
