package com.Stringprograms;

public class Swapstring {

	public static void main(String[] args) {
		String s1="abhishek";
		String s2="meghana";
		s1=s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());//=0,8
		System.out.println("s2="+s2);
		s1=s1.substring(s2.length());//
		System.out.println("s1="+s1);
		

	}


	}


