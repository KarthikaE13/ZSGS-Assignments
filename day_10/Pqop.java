package day_10;
import java.util.*;

public class Pqop {

	public static void main(String[] args) {
		// create a new priority queue, add some colors (string) and print out the elements of the priority queue.

	PriorityQueue<String> colors = new PriorityQueue<>();
	colors.add("White");
	colors.add("Blue");
	colors.add("Green");
	colors.add("Red");
	colors.add("Black");
	System.out.println(colors);
	// iterate through all elements in priority queue.
	for(String color: colors) {
		if(color=="Blue") 
			System.out.println("There is a blue");
	}
//add all the elements of a priority queue to another priority queue.
	PriorityQueue<String> Extracolors = new PriorityQueue<>();
	Extracolors.add("Pink");
	Extracolors.addAll(colors);
	System.out.println(Extracolors);
	// insert a given element into a priority queue.
	colors.offer("Violet");
	System.out.println("How many colors?"+colors.size());//count the number of elements in a priority queue.
	// compare two priority queues.
	System.out.println("Is equal:"+colors.equals(Extracolors));
	// retrieve the first element of the priority queue.
	System.out.println(colors.peek());
	//retrieve and remove the first element.
	System.out.println(colors.poll());
	//convert a priority queue to an array containing all of the elements of the queue.
	Object[] ar = colors.toArray();
	System.out.println(Arrays.toString(ar));
	//remove all the elements from a priority queue.
	colors.remove();
	System.out.println(colors);
	
	
	}

}
