
package com.stackroute.pe3;
import java.util.*;
public class CheckTheConsecutiveNumbers {
    public static void main(String args[]) {
        String s="";

        System.out.println("Enter the input numbers");
        Scanner scanner = new Scanner(System.in);

        s=scanner.next();

        String[] array=s.split(",");
        int[] arr=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i]=Integer.parseInt(array[i]);
        }
        boolean result = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) == 1||(arr[i + 1] - arr[i]) == -1) {
            } else {
                result = false;
                break;
            }
        }
        if(result)
            System.out.println(s + "are consecutive numbers");
        else
            System.out.println(s + "are non consecutive numbers");
    }
}
