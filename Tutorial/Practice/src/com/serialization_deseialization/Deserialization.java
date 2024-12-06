package com.serialization_deseialization;

import java.io.*;

public class Deserialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String loc = "C:\\Users\\nsen4\\Downloads\\batch\\A.ser";
		ObjectInputStream os = new ObjectInputStream(new FileInputStream(loc));
		A a1 = (A)os.readObject();
		os.close();
		System.out.println(a1.i);
		System.out.println(a1.j);

	}

}
