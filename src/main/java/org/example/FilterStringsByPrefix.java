package org.example;
import java.util.ArrayList;

public class FilterStringsByPrefix {

    private static boolean ifPrefixFound(String str, String findingTarget){
        if(str == null || findingTarget == null || str.isEmpty() || str.length() < findingTarget.length()){
            return false;
        }
        for(int i = 0; i < findingTarget.length(); i++){
            if(findingTarget.charAt(i) != str.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static String[] filterStringsByPrefix(String[] strArr, String targetStr){
        if(strArr == null || targetStr == null) throw new IllegalArgumentException("input can not be null.");
        if(strArr.length == 0) return strArr;

        ArrayList<String> ret = new ArrayList<>();
        for(String str: strArr){
            if(ifPrefixFound(str, targetStr)){
                ret.add(str);
            }
        }
        return ret.toArray(new String[0]);
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
}
