package com.exception;

class MyException extends Exception{
	
	public MyException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}


public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new MyException("Testing Exception");
		}
		catch(MyException ex) {
			System.out.println("Handling");
			System.out.println(ex.getMessage());
		}

	}

}
