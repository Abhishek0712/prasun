package com.Stringprograms;

public class Seperatespecialcharanumberalp {

	public static void main(String[] args) {
		String s="a1b$c2%";
		String alpha="";
		String number="";
		String special="";
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122))
			{
				alpha=alpha+s.charAt(i);
			}
			else if(s.charAt(i)>=48 && s.charAt(i)<=57)
{         number=number+s.charAt(i);
	}
			else {
				special=special+s.charAt(i);
			}
		}
		
		System.out.println("Alphabet"+alpha);
		System.out.println("Numeric"+number);
		System.out.println("Specialcharacter"+special);

		
	}

}
