package datastructures;

import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// implements map interfaces
		Map<Integer, String> hMap = new TreeMap<Integer, String>();
		mapUtil(hMap);
	}

	public static void mapUtil(Map<Integer, String> map) {
		// add key-value pairs
		map.put(101, "steve");
		map.put(502, "roger");
		map.put(22, "jennifer");
		map.put(315, "mika");
		map.put(36, "ellie");

		map.put(750, "kelly");

		// expose /access elements
		System.out.println("See all the keys: " + map.keySet());
		System.out.println("See all key-value pairs: " + map);

		// iterate through map of key-value pairs?
		for (int key : map.keySet()) {
			System.out.println("[Key:" + key + ". Value: " + map.get(key) + " ]");
		}

	}

}
