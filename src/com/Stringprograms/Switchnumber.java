package com.Stringprograms;

import java.util.Scanner;

public class Switchnumber {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int key=1;
		for(int i=0;i<key;i++) {
			
			int temp=a[0];
			for(int j=0;j<a.length-1;j++) {
				a[i]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		
	

	}

}
