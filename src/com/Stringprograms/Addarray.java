package com.Stringprograms;

public class Addarray {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5 };
		int b[] = { 2, 4, 6, 8 };
		int count = a.length;
		if (count < b.length) {//higher lenghth will be saved in count
			count = b.length;
		}
		for (int i = 0; i < count; i++) {
			try {
				System.out.println(a[i] + b[i]);//if not same parameter then array index ou of bond

			} catch (Exception e) {
				if (a.length > b.length) {
					System.out.println(a[i]);
				} else {
					System.out.println(b[i]);
				}
			}

		}

	}

}
