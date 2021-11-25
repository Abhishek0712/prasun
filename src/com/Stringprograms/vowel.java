package com.Stringprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class vowel {

	public static void main(String[] args) {
		String s="abhishek";
		Set<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='a'||s.charAt(i)!='e'||s.charAt(i)!='i'||s.charAt(i)!='o'||s.charAt(i)!='u')
			{
				set.add(s.charAt(i));
			}
		}
       for(Character ch:set)
       {
    	   int count=0;
    	   for(int i=0;i<s.length();i++)
    	   {
    		   if(ch==s.charAt(i))
    		   {
    			   count++;
    		   }
    	   }
    	   if(count>=1)
    	   {
    		   System.out.println(ch+"-"+count);
    	   }
       }
	}

}
