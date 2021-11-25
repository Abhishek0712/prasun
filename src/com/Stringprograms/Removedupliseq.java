package com.Stringprograms;

import java.util.LinkedHashSet;

public class Removedupliseq {

	public static void main(String[] args) {
		String s="abhishek";
		// create set collection and add all the char of given string into set
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
			
		}
		for(Character ch:set) {
			System.out.println(ch);
			
		}
	}

}
