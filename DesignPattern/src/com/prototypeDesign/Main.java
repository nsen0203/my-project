package com.prototypeDesign;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Working on prototype design pattern");
		NetworkConnection netwrokConnection = new NetworkConnection();
		netwrokConnection.setIp("10.178.90.13");
		netwrokConnection.loadImportantData();
		
		System.out.println(netwrokConnection);
		
		//we want new object of network connection using cloneable
		try {
			NetworkConnection netwrokConnection2 = (NetworkConnection)netwrokConnection.clone();
			System.out.println(netwrokConnection2);
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
