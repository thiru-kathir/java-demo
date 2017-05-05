package de.dmc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Streams
{

	public static void main(final String[] args)
	{
		final List<String> list = new ArrayList<>();
		list.add("Tanja");
		list.add("Stephane");
		list.add("Georg");

		final List<String> sublist = list.stream().map(s -> s.substring(1)).collect(Collectors.toList());
		System.out.println(sublist);

		final char[] foo =
		{ 'T', 'a', 'n', 'j', 'a' };
		System.out.println(Arrays.asList(foo));


		final List<String> sublist2 = list.stream().map(s -> Arrays.asList(s.toCharArray())).flatMap(a -> a.stream())
				.map(c -> new String(c)).collect(Collectors.toList());
		System.out.println(sublist2);
	}
}
