package datastructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		// 1. create a collection
		ArrayList<String> cities = new ArrayList<String>();
		
		
		// 2. Add some elements
		cities.add("Cleveland");
		cities.add("Toronto");
		cities.add("Chicago");
		
		for(String city: cities) {
			System.out.println(city);
		}
		
		int size = cities.size();
		System.out.println("You are " + size + " elements in the collection");
		
		System.out.println(cities.get(0));
		
		cities.remove(0);
		size = cities.size();
		System.out.println("You are " + size + " elements in the collection");
		
		for(String city: cities) {
			System.out.println(city);
		}


	}

}
