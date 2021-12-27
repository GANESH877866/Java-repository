package sk.test;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ob=new Scanner(System.in);
		float a, b;
		 Boolean s;
		String name=null;
		System.out.println("Enter your name:");
		name=ob.next();
		System.out.println("please enter boolean value:");
		s=ob.nextBoolean();
		
		
		System.out.println(name);
		System.out.println(s);
		
		System.out.println("Enter the value of a:");
		a=ob.nextFloat();
		
		System.out.println("Enter the value of b:");
		b=ob.nextFloat();
		
		System.out.println("Addition="+(a+b));
		
		ob.close();

	}

}
