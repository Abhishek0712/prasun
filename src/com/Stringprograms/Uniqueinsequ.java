package com.Stringprograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Uniqueinsequ {

	public static void main(String[] args) {
		String s="abhishek";
		// create set collection and add all the char of given string into set
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
			
		}
		//compare each char of set with all the charof given string
		for(Character ch:set) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i))
					//if char is matching then count++
				{
					count++;
				}
				
			}
			//if count is greater then 1 then print only duplicate
			if(count==1) {
			
			//print both char and count
			System.out.println(ch+" "+count);
			}
		}
	}

}
