package com.dxc.personal;

public class Constructor {
	
	Constructor(){
		System.out.println("Constructor block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c1=new Constructor();
		System.out.println("-------------------------------------");
		Constructor c2=new Constructor();
	}

}
