package com.java.lambdas.practice;

/**
 * This is a Explanation of this in a class context.
 *
 */
public class C
{

	//
	/**
	 * This is a public method of this class. This is the same as
	 * public int method(int param)
	 * the first Parameter C this is always implicit created by the compiler.
	 * This time is explicit defined. This does not change the behavior but is important to understand.
	 *
	 *
	 * @param a param
	 * @return the Param
	 */
	public int method(C this, int param){
		return param;
	}



}
