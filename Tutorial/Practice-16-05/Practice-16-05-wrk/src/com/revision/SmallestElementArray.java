package com.revision;

public class SmallestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {10,2,4,3,9,7};
		int min = a[0];
		for (int i =0; i<a.length; i++) {
			if (min>a[i]) {
				min=a[i];
			}
		}
		System.out.println(min);

	}

}
