package datastructures;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		
		// LinkedHash - in order that they were entered
		// HashSet - complete random order
		// TreeSet - rearranges to natural order
		
		
		Set<String> animals = new TreeSet<String>();
		
		animals.add("dog");
		animals.add("hog");
		animals.add("cat");
		animals.add("snake");
		
		System.out.println(animals + " " + animals.size());
		
		animals.add("goose");
		animals.add("ferret");
		animals.add("snake");
		
		System.out.println(animals + " " + animals.size());
		
		// Create and an new set that we use for comparison
		
		Set<String> farmAnimals = new HashSet<String>();
		
		farmAnimals.add("Chicken");
		farmAnimals.add("cow");
		farmAnimals.add("pig");
		farmAnimals.add("horse");
		farmAnimals.add("dog");
		
		// what is the intersection between animals and farm animals
		// copy exiting set into a new set
		Set<String> intersectionSet = new HashSet<String>(animals);
		System.out.println(intersectionSet);
		
		// retain only the elements that are also in the other set
		intersectionSet.retainAll(farmAnimals);
		System.out.println("The intersection is: " + intersectionSet);
		
		// what is the union
		Set<String> unionSet = new HashSet<>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("The union is: " + unionSet);
		
		// What is the difference?
		Set<String> differenceSet = new HashSet<>(animals);
		differenceSet.removeAll(farmAnimals);
		System.out.println("The difference is " + differenceSet);

	}

}
