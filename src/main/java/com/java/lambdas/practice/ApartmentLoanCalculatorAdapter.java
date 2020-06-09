package com.java.lambdas.practice;

public class ApartmentLoanCalculatorAdapter implements EmiCalculatorAdapter
{
	private EMICalculator emiCalculator;

	public ApartmentLoanCalculatorAdapter(EMICalculator emiCalculator)
	{
		this.emiCalculator = emiCalculator;
	}

	@Override
	public double calculateEmi()
	{
		return convertEmiFromHomeToApartment(emiCalculator.calculateEmi(5, 1000.00));
	}

	private double convertEmiFromHomeToApartment(double homeLoanEmi)
	{
		return homeLoanEmi-100;
	}

}
