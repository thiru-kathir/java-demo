package com.java.lambdas.practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaCollectionMapUsingStreamAPI {

public static void main(String args[])
{
    final Map<String,String> seasonsMap = new HashMap<>();
    seasonsMap.put("0001", "Winter");
    seasonsMap.put("0002", "Spring");
    seasonsMap.put("0003", "Summer");
    seasonsMap.put("0004", "Autumn");
    seasonsMap.put("0005", "Summer 2020");

    //Step 1: stream through the map and find the entryset which has the value as "Summer"
    //Step 2 : from the entryset get the key and find the first out of it
    //Step 3 : convert Optional<String> to String using get() and print it.
     String filteredMap = seasonsMap.entrySet().stream()
    		 .filter(season -> "Summer".equals(season.getValue()))
    		 .map(Map.Entry :: getKey)
    		 .findFirst().map(Object :: toString).orElse("");
    	 System.out.println(filteredMap);


    	 //follow step 1 as before
    	 //Step 2: from the entryset get the mapkey and collect the values

    	 List<String> mapKeyList =  seasonsMap.entrySet().stream()
    	    		 .filter(season -> season.getValue().startsWith("Summer"))
    	    		 .map(Map.Entry :: getKey).collect(Collectors.toList());

    	 System.out.println(mapKeyList.toString());
}

}
