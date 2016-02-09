package com.training.exceptions;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Converter obj = new Converter();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Farenheit: ");
		double faren1 = Double.parseDouble(sc.next());
		double cel1 = obj.farenToCelcius(faren1);
		System.out.println("Celcius value of 45F: " + cel1);
		sc.close();
		
		Double faren2 = null;
		double cel2 = 0.0;
		try
		{
			cel2 = obj.farenToCelcius(faren2);
		}
		catch(NullPointerException e)
		{
			System.out.println("Faren is Null. Please Check");
			System.out.println(e.getMessage());
		}
		System.out.println("Celcius value of " + faren2 + " is: " + cel2);
	}
}
