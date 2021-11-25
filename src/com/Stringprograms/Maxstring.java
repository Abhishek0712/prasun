package com.Stringprograms;

public class Maxstring {

	public static void main(String[] args) {
	String s[]= {"hii","hello","bye","p","tyss","mango"};
	String max=s[0];
	for(int i=1;i<s.length;i++) {
		if(s[i].length()>max.length()) {
			max=s[i];
		}
	}
	
	for(int i=0;i<s.length;i++) {
		if(max.length()==s[i].length()) {
			System.out.println(s[i]);
		}
	}
	}

}
