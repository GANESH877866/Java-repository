package demo.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class temp {

	public static void main(String[] args) throws NumberFormatException, IOException   {
		// TODO Auto-generated method stub
		double c,f;
		
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);
		
		System.out.println("Enter the ahernhiet :");
		c=Double.parseDouble(ob.readLine());
		
		f=(9*c/5)+32;
		System.out.println("temp:"+f);
		
		
	}

}
