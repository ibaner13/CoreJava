package com.training.myexceptions;
//Inheritance
//Checked Exception - Because extending Exception
public class RangeCheckException extends Exception {
	private long handPhone;
	//Mandatory Dependency
	public RangeCheckException(long handPhone)
	{
		super();
		this.handPhone = handPhone;
	}
	//Overriding Super Class Method
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return handPhone + " Should be a 10 digit number";
	}
}
