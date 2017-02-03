package com.sample;

import java.util.HashMap;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        
        char[] chars = inputString.toLowerCase().toCharArray();

        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        
        for (int i=0; i<chars.length; i++) {
            if (chars[i] == ' ') {
                continue;
            }
            if (charMap.containsKey(chars[i])) {
                int count = charMap.get(chars[i]);
                count++;
                charMap.put(chars[i], count);
            } else {
                charMap.put(chars[i], 1);
            }
        }
        System.out.println(charMap.keySet().size());
        if (charMap.keySet().size() == 26) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
        
    }
	
}
