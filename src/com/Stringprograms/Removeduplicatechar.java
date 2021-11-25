package com.Stringprograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Removeduplicatechar {

	public static void main(String[] args) {
		 String s="my name is is";
		   String str[]=s.split(" ");
		   LinkedHashSet<String> set=new LinkedHashSet<String>();
		   for(int i=0;i<str.length;i++) 
		   {
			   set.add(str[i]);
		   } 
		   for (String word : set) 
		   {
			  System.out.println(word+" ");
			   }

	}

}
