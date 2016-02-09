package com.training.exceptions;

public class Converter {

	public double farenToCelcius (Double faren) throws NullPointerException
	{
		double cel = 0;
		cel = (5.0/9.0) * (faren-32);	
		return cel;
	}
}
