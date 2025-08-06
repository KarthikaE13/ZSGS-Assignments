package day_10;
import java.util.*;

public class TreemapOp {
	public static void main(String[] args) {
		TreeMap<Integer,String> color = new TreeMap<>();
	color.put(1,"Blue");
	color.put(2,"Black");
	color.put(3,"Brown");
	color.put(4,"White");
	color.put(5,"Pink");
	color.put(6,"White");
	System.out.println(color);
	
	//copy a Tree Map content to another Tree Map.
	 TreeMap<Integer, String> colorCopy = new TreeMap<>(color);
     System.out.println("Copied TreeMap: " + colorCopy);
     //search a key in a Tree Map.
     System.out.println("Is key 2?"+color.containsKey(2));
     //search a value in a Tree Map.
     System.out.println("Is Blue?"+color.containsValue("Blue"));
	//get all keys from the given a Tree Map.
     System.out.println("All keys "+color.keySet());
     //get a key-value mapping associated with the greatest key and the least key in a map.
     Map.Entry<Integer,String> greatest = color.firstEntry();
     Map.Entry<Integer,String> least = color.lastEntry();
     System.out.println(greatest);
     System.out.println(least);
     //get the first (lowest) key and the last (highest) key currently in a map.
     System.out.println("First key: " + color.firstKey());
     System.out.println("Last key: " + color.lastKey());
//get a reverse order view of the keys contained in a given map.
     NavigableSet<Integer> descendingKeys = color.descendingKeySet();
     System.out.println("Keys in reverse order: " + descendingKeys);
   //delete all elements from a given Tree Map.
     color.clear();
     System.out.println(color);
	

	}

}
