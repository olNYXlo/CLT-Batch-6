package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;



/*
 Travelling Salesman Problem
 Problem Statement:
 A travelling salesman has to visit every city in his vicinity starting from a certain one &
 finally return to the same city. He has to minimize his travel distance / length of the entire
 trip.
 
 Given the location map as shown below, compute the minimum travel cost & travel route used 
  
  
  Solution:
  Using greedy algorithm, ensure the salesman picks the city closest to his current location
  provided he has yet to visit that city.
  

  
 
 */

public class GreedyAlgo {
	
	
	
	
	
	public static void main(String[] args) {
		
		
		HashMap<String, Integer> localTravelMap1 = new HashMap<String, Integer>();
		localTravelMap1.put("A", 0);
		localTravelMap1.put("B", 5);
		localTravelMap1.put("C", 0);
		localTravelMap1.put("D", 6);
		localTravelMap1.put("E", 0);
		localTravelMap1.put("F", 4);
		localTravelMap1.put("G", 0);
		localTravelMap1.put("H", 7);
		
		HashMap<String, Integer> localTravelMap2 = new HashMap<String, Integer>();
		localTravelMap2.put("A", 5);
		localTravelMap2.put("B", 0);
		localTravelMap2.put("C", 2);
		localTravelMap2.put("D", 4);
		localTravelMap2.put("E", 3);
		localTravelMap2.put("F", 0);
		localTravelMap2.put("G", 0);
		localTravelMap2.put("H", 0);
		
		HashMap<String, Integer> localTravelMap3 = new HashMap<String, Integer>();
		localTravelMap3.put("A", 0);
		localTravelMap3.put("B", 2);
		localTravelMap3.put("C", 0);
		localTravelMap3.put("D", 1);
		localTravelMap3.put("E", 0);
		localTravelMap3.put("F", 0);
		localTravelMap3.put("G", 0);
		localTravelMap3.put("H", 0);
		
		HashMap<String, Integer> localTravelMap4 = new HashMap<String, Integer>();
		localTravelMap4.put("A", 6);
		localTravelMap4.put("B", 4);
		localTravelMap4.put("C", 1);
		localTravelMap4.put("D", 0);
		localTravelMap4.put("E", 7);
		localTravelMap4.put("F", 0);
		localTravelMap4.put("G", 0);
		localTravelMap4.put("H", 0);
		
		HashMap<String, Integer> localTravelMap5 = new HashMap<String, Integer>();
		localTravelMap5.put("A", 0);
		localTravelMap5.put("B", 3);
		localTravelMap5.put("C", 0);
		localTravelMap5.put("D", 7);
		localTravelMap5.put("E", 0);
		localTravelMap5.put("F", 0);
		localTravelMap5.put("G", 6);
		localTravelMap5.put("H", 4);
		
		HashMap<String, Integer> localTravelMap6 = new HashMap<String, Integer>();
		localTravelMap6.put("A", 4);
		localTravelMap6.put("B", 0);
		localTravelMap6.put("C", 0);
		localTravelMap6.put("D", 0);
		localTravelMap6.put("E", 0);
		localTravelMap6.put("F", 0);
		localTravelMap6.put("G", 3);
		localTravelMap6.put("H", 0);
		
		HashMap<String, Integer> localTravelMap7 = new HashMap<String, Integer>();
		localTravelMap7.put("A", 0);
		localTravelMap7.put("B", 0);
		localTravelMap7.put("C", 0);
		localTravelMap7.put("D", 0);
		localTravelMap7.put("E", 6);
		localTravelMap7.put("F", 3);
		localTravelMap7.put("G", 0);
		localTravelMap7.put("H", 2);
		
		HashMap<String, Integer> localTravelMap8 = new HashMap<String, Integer>();
		localTravelMap8.put("A", 7);
		localTravelMap8.put("B", 0);
		localTravelMap8.put("C", 0);
		localTravelMap8.put("D", 0);
		localTravelMap8.put("E", 4);
		localTravelMap8.put("F", 0);
		localTravelMap8.put("G", 2);
		localTravelMap8.put("H", 0);
		
		HashMap<String, HashMap<String, Integer>> globalTravelMap = new HashMap<String, HashMap<String, Integer>>();
		globalTravelMap.put("A", localTravelMap1);
		globalTravelMap.put("B", localTravelMap2);
		globalTravelMap.put("C", localTravelMap3);
		globalTravelMap.put("D", localTravelMap4);
		globalTravelMap.put("E", localTravelMap5);
		globalTravelMap.put("F", localTravelMap6);
		globalTravelMap.put("G", localTravelMap7);
		globalTravelMap.put("H", localTravelMap8);
		
		System.out.println("Visual Representation of Travel Data");
		for (Entry<String, HashMap<String, Integer>> es : globalTravelMap.entrySet()) {
			
			System.out.print(es.getKey() + " : " );
			System.out.print(globalTravelMap.get(es.getKey()) + "\n");	
			
		}
		// Visual representation of the hashmap of travel data
		System.out.println("==========================================");
		
		
		String travelRoute = "A";
		int travelDist = 0;
		
		System.out.println("Starting Travel");
		System.out.println("==========================================");
		while (travelRoute.length() < 2 * globalTravelMap.size()) {
			// While he has yet to visit all places
			
			travelRoute += ",";
			List<String> visitedLocations = Arrays.asList(travelRoute.split(","));
			// Outputs a List containing all the locations the salesman has travelled to so far
			
			
			int min = 10;
			String currLocation = travelRoute.substring(travelRoute.length()-2,travelRoute.length()-1);
			// Gets the current location from the travel route
			// As Java does not allow negative indexing
			System.out.println("Arrived at : " + currLocation);
			
			
			ArrayList<String> possibleLocation = new ArrayList<String>(globalTravelMap.get(currLocation).keySet());
			ArrayList<Integer> costs = new ArrayList<Integer>(globalTravelMap.get(currLocation).values());
			System.out.println(costs);
			System.out.println(possibleLocation);
			
			int minIndex = 0;
			for (Integer i : costs) {
				if (i != 0 && i < min) {
					// checks for the minimum travel dist					
		
					if (!visitedLocations.contains(possibleLocation.get(costs.indexOf(i))) && possibleLocation.get(costs.indexOf(i)) != "A") {
						// Checks that salesman has yet to travel to that location before changing the min and minIndex
						min = i;
						minIndex = costs.indexOf(min);
						System.out.println("minimum : " + min);
					}					
					
				} // end of if case that decides the final decision
			} // end of for each loop (Greedy decision making)

			travelRoute += possibleLocation.get(minIndex);
			System.out.println("Travelling to -> " + possibleLocation.get(minIndex));
			
			travelDist += costs.get(minIndex);
			
		}
		String[] visitedLocations = travelRoute.split(",");
		if (globalTravelMap.size() == visitedLocations.length) {
			// Meaning salesman has travelled to all locations already
			// Hence, final movement is back to starting town
			
			travelRoute += ",";
			String currLocation = travelRoute.substring(travelRoute.length()-2, travelRoute.length()-1);
			ArrayList<String> possibleLocation = new ArrayList<String>(globalTravelMap.get(currLocation).keySet());
			ArrayList<Integer> costs = new ArrayList<Integer>(globalTravelMap.get(currLocation).values());
			travelRoute += possibleLocation.get(0);
			travelDist += costs.get(0);			
		}
		System.out.println("Finished Travel");
		System.out.println("==========================================");
		System.out.println("Travel Route Taken : ");
		System.out.println(travelRoute.replace(",", "->"));
		System.out.println("Travel Distance Covered : ");
		System.out.println(travelDist);

	}
}
