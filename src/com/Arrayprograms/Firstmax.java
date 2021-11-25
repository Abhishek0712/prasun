package com.Arrayprograms;

public class Firstmax {

	public static void main(String[] args) {
		int a[]= {40,50,30,10,20};
		for(int i=0; i<=a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				
					
				}
			}
   
	}
		 System.out.println("first max num"+ a[0]);
	}
}
