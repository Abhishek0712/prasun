package com.Stringprograms;

public class Revstrnolength {

	public static void main(String[] args) {
		String s="tyss";
		String rev="";
		int count = s.compareTo(rev);
		for(int i=count-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
	}

}
