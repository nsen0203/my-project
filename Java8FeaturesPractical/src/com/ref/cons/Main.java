package com.ref.cons;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Provider provider = () ->{
			return new Student();
		};
		
		Student student = provider.getStudent();
		student.display();
		
		System.out.println("-------------------------------------");
		
		//Using constructor reference
		Provider provider1 = Student::new;
		Student student1 = provider1.getStudent();
		student1.display();

	}

}
