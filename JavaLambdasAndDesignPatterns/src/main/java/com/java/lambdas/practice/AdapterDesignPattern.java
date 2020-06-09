package com.java.lambdas.practice;

/**
 *
 * @author kathithi
 *
 */
public class AdapterDesignPattern
{
	public static void main(String args[])
	{
		HomeLoanEMICalculator homeLoanCal = new HomeLoanEMICalculator();
		ApartmentLoanCalculatorAdapter apartLoanCal = new ApartmentLoanCalculatorAdapter(homeLoanCal);
		System.out.println(apartLoanCal.calculateEmi());
	}
}
