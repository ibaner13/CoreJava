package com.training;

import com.training.myexceptions.Customer;
import com.training.myexceptions.RangeCheckException;

public class ExceptionApplication {
	public static void main(String[] args){
		try{
			Customer cust = new Customer(101, "Ramesh", "ram@abc.com", 9998887776L);
		}
		
		finally{
			System.out.println("Inside Finally");
		}
		System.out.println("Bye");
	}
}
