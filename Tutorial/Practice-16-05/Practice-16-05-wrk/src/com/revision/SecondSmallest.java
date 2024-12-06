package com.revision;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,2,4,3,9,7};
		int min1 = a[0], min2 = a[1];
		for (int i=1; i<a.length; i++) {
			if(min1>a[i]) {
				min2=min1;
				min1=a[i];
			}
			else if(min2>a[i]) {
				min2=a[i];
			}
		}
		System.out.println(min2);

	}

}
