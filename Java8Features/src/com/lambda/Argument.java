package com.lambda;

interface Operation{
	public int opt(int x, int y);
}

public class Argument {
	
	public static void result(int a, int b, Operation obj) {
		System.out.println(obj.opt(a, b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		result(5,9, (a,b) -> (a*b));
	}

}
