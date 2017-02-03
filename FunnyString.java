package com.sample;

import java.util.Scanner;

public class FunnyString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        int strCount = input.nextInt();
        
        String[] strArray = new String[strCount];
        
        for (int s=0; s<strCount; s++) {
            String str = input.next();
            strArray[s] = str;
        }
        
        for (int k=0; k<strArray.length; k++) {
            String obj = strArray[k];
            char[] charArray = obj.toCharArray();
            boolean match = false;
            for (int i=0; i<charArray.length; i++) {
                int m=1; int n=charArray.length-2;
                while (m<charArray.length && n>=0) {
                    if (Math.abs(charArray[m]-charArray[m-1]) == Math.abs(charArray[n]-charArray[n+1])) {
                        m++;
                        n--;
                        match = true;
                        continue;
                    } else {
                        match = false;
                        break;
                    }
                }
                
            }
            if (match) {
                System.out.println("Funny");
            } else {
                System.out.println("Not Funny");
            }
        }
    }
}