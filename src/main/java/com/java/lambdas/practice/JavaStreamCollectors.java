package com.java.lambdas.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaStreamCollectors
{
	public static void main(String args[])
	{
      List<String> initialList = Arrays.asList("thirurkt", "thiyara", "koki", "praga","vimala");

      //convert list to set using java stream
      System.out.println(initialList.stream().collect(Collectors.toSet()));

      //convert mutable list to immutable list
      List<String> immutableList = initialList.stream().collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));

      //we can't perform any operation on immutableList, the below line of code will throw UnsupportedOperationException
     // immutableList.remove(1);

      //convert immutable list to mutable list
      List<String> mutableList = immutableList.stream().collect(Collectors.toCollection(LinkedList :: new));

      //perform remove operation on mutable list
      mutableList.remove(2);

      System.out.println(mutableList);

      //maxBy - collects the biggest element of the stream.Here it means sorting the given stream and produces the biggest element out of it.
      Optional<String> biggestElement = initialList.stream()
    		  .collect(Collectors.maxBy(Comparator.naturalOrder()));

      System.out.println(biggestElement.get());

      //minBy - collects the smallest element of the stream.Here it means sorting the given stream and produces the smallest element out of it.
      Optional<String> smallestElement = initialList.stream()
    		  .collect(Collectors.minBy(Comparator.naturalOrder()));

      System.out.println(smallestElement.get());


      Map<String, Integer> map = initialList.stream()
    		  .collect(Collectors.toMap(Function.identity(), String::length));

      System.out.println(map.values());

	}
}
