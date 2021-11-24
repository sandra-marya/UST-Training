package com.ust.test;

public class SBA1_3_LabelledBreak {
    public static void main(String[] args) {  
        first:
        for( int i = 1; i < 6; i++) {
            second:
            for(int j = 1; j < 3; j ++ ) {
                System.out.println("i = " + i + "; j = " +j);
             
                if ( i == 2)
                    break second;
            }
        }
    }
}

