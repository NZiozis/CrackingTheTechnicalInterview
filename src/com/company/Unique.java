package com.company;

public class Unique {

    /* without being able to use an additional data structures */


    public boolean unique(String s){
        for (int i = 0; i < s.length(); i++){
            String current = s.substring(i, i);

            for (int j = i; j < s.length(); j++){
                String tester = s.substring(j, j);
                if (current.equals(tester)){
                    return true;
                }

            }
        }
        return false;
    }

}
