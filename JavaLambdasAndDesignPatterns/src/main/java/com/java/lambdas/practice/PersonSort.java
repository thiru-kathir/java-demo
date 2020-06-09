package com.java.lambdas.practice;

import java.util.Comparator;
import java.util.List;

/**
 * Example of the {@link Comparator} interface of java 8.
 *
 */
public class PersonSort
{

	private List<Person> collection;

	public void sort()
	{
		// Sort by name
		collection.sort(Comparator.comparing(Person::getName));

		// Sort by name reversed
		collection.sort(Comparator.comparing(Person::getName).reversed());

		// Sort by id
		collection.sort(Comparator.comparing(Person::getId));

		// Sort by name then by id
		collection.sort(Comparator.comparing(Person::getName).thenComparing(Person::getId));

		// Sort by name reversed then by id
		collection.sort(Comparator.comparing(Person::getName).reversed().thenComparing(Person::getId));

		// Sort by name the by id reversed
		collection.sort(Comparator.comparing(Person::getName).thenComparing(Person::getId).reversed());

		// Sort by Other Stuff
		collection.sort(Comparator.comparing(Person::getOther));

	}

}
