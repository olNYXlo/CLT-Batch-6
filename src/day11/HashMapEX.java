package day11;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapEX {

	public static void main(String[] args) {
		
		
		
		Map<Integer, String> mapRef = new HashMap<Integer, String>();
		mapRef.put(52, "Oracle");
		mapRef.put(12, "Java");
		mapRef.put(40, "Python");
		mapRef.put(32, "C++");
		
		
		for(Map.Entry temp:mapRef.entrySet()) {
			System.out.println(temp.getKey() + " " + temp.getValue());
		}
		
		TreeMap refTreeMap = new TreeMap(mapRef);
		System.out.println("Sorted HashMap: " + refTreeMap);

	}
}
