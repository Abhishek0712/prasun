package com.Stringprograms;

import java.util.HashSet;

public class Printuniqueword {

	public static void main(String[] args) {
		 String s="my name is is";
		   String str[]=s.split(" ");
		   HashSet<String> set=new HashSet<String>();
		   for(int i=0;i<str.length;i++) 
		   {
			   set.add(str[i]);
		   } 
		   for (String word : set) 
		   {
			   int count=0;
			   for (int i=0;i<str.length;i++) 
			   {
				   if(word.equals(str[i]))
				   {
					   count++;
				   }
			   }
			   if(count==1) {
				System.out.println(word+" ");
			   }
			}

	}

}
