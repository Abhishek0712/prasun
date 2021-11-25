package com.Stringprograms;

public class Swapfirstandlast {

	public static void main(String[] args) {
		String s="welcome to my world";
		String[] str = s.split(" ");//split the string based on space
		//String str[]={"welcome","to","my","world"};
		String temp=str[0];//store zeroth index value i.e.. welcome into temp variable 
		str[0]=str[str.length-1];//store last index value into zeroth index
		str[str.length-1]=temp;//store temp varibale value into last index 
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]+" ");// print the value
		}
		

	}

}
