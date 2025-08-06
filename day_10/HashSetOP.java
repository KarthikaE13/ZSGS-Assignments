package day_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetOP {

	public static void main(String[] args) {
		HashSet<Double>list = new HashSet<>();
		list.add(2.3);
		list.add(2.78);
		list.add(12.3);
		list.add(2.03);
		list.add(2.33);
		for(Double d:list) { //iterate through all elements in a hash list.
			System.out.print(d);
		}
		System.out.println(list.size());//get the number of elements in a hash set.
		list.clear();
		System.out.println(list); //empty the hash set.
		System.out.println("Is empty:"+list.isEmpty());//test a hash set is empty or not.
		list.add(2.3);
		list.add(2.78);
		list.add(12.3);
		list.add(2.03);
		list.add(2.33);
		
		HashSet<Double>list1= (HashSet<Double>) list.clone();//Clone a hash set to another hash set.
		System.out.println(list1);
		List<Double> ar = new ArrayList<>(list); //convert a hash set to an ArrayList.
		System.out.println("ArrayList: "+ ar);
		Set<Double> ts= new TreeSet<>(list1);
		System.out.println("Tree set: "+ts); //. convert a hash set to a tree set.
		Object[] arr = list.toArray();
		
		System.out.println("HashSet to array: " + Arrays.toString(arr));//convert a hash set to an Array.
		
		System.out.println("Is set1 equal to set2? " + list.equals(list1));
		
	}

}
