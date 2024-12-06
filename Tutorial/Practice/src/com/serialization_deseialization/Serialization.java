package com.serialization_deseialization;

import java.io.*;

class A implements Serializable{
	
	int i;
	int j;
	
	A(int i, int j){
		this.i = i;
		this.j = j;
	}
	
}

public class Serialization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		A a1 = new A(10,20);
		String loc = "C:\\Users\\nsen4\\Downloads\\batch\\A.ser";
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(loc));
		os.writeObject(a1);
		os.flush();
		os.close();
		System.out.println("All process done");
	}

}
