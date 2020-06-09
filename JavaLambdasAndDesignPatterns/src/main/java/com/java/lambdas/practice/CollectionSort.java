package com.java.lambdas.practice;

import java.util.Comparator;
import java.util.List;


/**
 * This is a Lambda Example for T, this will work for any List containing Objects extending Comparable so the have a
 * compareTo Method.
 *
 * @param <T> any Object implementing the Comparable interface
 */
public class CollectionSort<T extends Comparable<T>>
{

	/**
	 *	The List we use to sort
	 */
	public List<T> list;

	/**
	 * Example of Lambda Sort
	 */
	public void sort()
	{
		//Old way creating a new Comparator and compare a to b
		list.sort(new Comparator<T>()
		{
			@Override
			public int compare(T a, T b)
			{
				return a.compareTo(b);
			}
		});

		// Lambda way calling directly
		list.sort((T a, T b) -> {
			return a.compareTo(b);
		});

		//The method block only contains a return so we don't need the method block
		list.sort((T a, T b) -> a.compareTo(b));

		// We don't need a type cause the compiler already knows he needs a method with the signature T a, T b
		list.sort((a, b) -> a.compareTo(b));

		// This works cause the Object T contains a method compareTo with the signature compareTo(T a, T b)
		// Why cause
		list.sort(T::compareTo);

		// We can reverse the sort via the Comparator class
		Comparator<T> cmp = T::compareTo;
		cmp = cmp.reversed();
		list.sort(cmp);

	}



}
