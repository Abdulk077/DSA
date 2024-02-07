package com.abdul;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;

public class ab {
    public static void main(String[] args) {
        System.out.println((float)Math.log10(22));
        //it shows the log base 10 value for any digit
        System.out.println((float)Math.log(22));
        //the ans of log base 10 and nothing in base is different,so you can use it as a math matical funcntion.
        //System.out.println((int)Math.random()); // it always return 0
        System.out.println((float)Math.sin(360));
        int [] a ;
         a = new int[]{1,2 ,3};
         for (int i = 0; i < 3; i++){
             a[i] += 5;
         }
        System.out.println(Arrays.toString(a));


    }
}
