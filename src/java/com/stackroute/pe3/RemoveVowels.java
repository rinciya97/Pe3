/* Get the input form the user and remove the vowels
*/
package com.stackroute.pe3;
import java.util.*;

public class RemoveVowels {
    static String remVowel(String str)
    {
        Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};

        List<Character> al = Arrays.asList(vowels);//convert the array to list

        StringBuffer sb = new StringBuffer(str);

        for (int i = 0; i < sb.length(); i++) {

            if(al.contains(sb.charAt(i))){
                sb.replace(i, i+1, "") ;
                i--;
            }
        }


        return sb.toString();
    }

    public static void main(String[] args)
    {
        System.out.print("Enter the number of words you want:");
        Scanner sc = new Scanner(System.in);
        int vow = sc.nextInt();
        String[] vowellist = new String[vow];
        for(int j = 0; j < vowellist.length;j++)
        {

            System.out.print("enter the word "+(j+1)+": ");
            Scanner str = new Scanner(System.in);
            vowellist[j] = str.next();
            System.out.println("Place name without vowels :"+remVowel(vowellist[j]));
        }
    }
}
