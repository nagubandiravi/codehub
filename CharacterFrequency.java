package com.sample;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String str = input.next();
		char[] chArray = str.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for (int i=0; i<chArray.length; i++) {
			if (charMap.containsKey(chArray[i])) {
				int count = charMap.get(chArray[i]);
				count++;
				charMap.put(chArray[i], count);
			} else {
				charMap.put(chArray[i], 1);
			}
		}
		
		@SuppressWarnings("unused")
		char[] output = new char[chArray.length];
		for (Integer value:charMap.values()) {
			System.out.println(value);
		}
	}
}
