package day_10;

import java.util.TreeSet;

public class Treesetop {
	public static void main(String[] args) {
TreeSet<String> colors = new TreeSet<>();
colors.add("White");
colors.add("Blue");
colors.add("Green");
colors.add("Red");
colors.add("Black");
System.out.println(colors); //create a new tree set, add some colours (string) and print out the tree set.
for(String color: colors) {
	System.out.print(color);
}// iterate through all elements in a tree set.
	TreeSet<String> colors2= new TreeSet<>();
	colors2.add("Pink");
	colors2.addAll(colors);
	System.out.println(colors2);//add all the elements of a specified tree set to another tree set.
	//create a reverse order view of the elements contained in a given tree set.
	System.out.println(colors.reversed());
	//get the first and last elements in a tree set.
	System.out.println("First element" +colors.first());
	System.out.println("First element" +colors.last());
	//. clone a tree set list to another tree set.
	TreeSet<String> clonecolors= (TreeSet<String>)colors.clone();
	System.out.println("Cloned tree set : "+clonecolors);
	System.out.println("Size :"+ colors.size());//get the number of elements in a tree set.
	System.out.println("Is equal "+ colors.equals(colors2));//compare two tree sets.
	TreeSet<Integer> nums= new TreeSet<>();
	nums.add(1);
	nums.add(2);
	nums.add(3);
	nums.add(4);
	nums.add(5);
	nums.add(6);
	nums.add(7);
	nums.add(8);
	nums.add(9);
	nums.add(10);
	System.out.println("Numbers less than 7: " + nums.headSet(7));

    // j. Element >= 6
    System.out.println("Ceiling of 6: " + nums.ceiling(6));

    // k. Element <= 6
    System.out.println("Floor of 6: " + nums.floor(6));

    // l. Strictly greater than 6
    System.out.println("Higher than 6: " + nums.higher(6));

    // m. Strictly less than 6
    System.out.println("Lower than 6: " + nums.lower(6));

    // n. Retrieve and remove first element
    System.out.println("Poll First: " + nums.pollFirst());
 // n. Retrieve and remove last element
    System.out.println("Poll Last: " + nums.pollLast());
    //remove a given element from a tree set.
    nums.remove(6);
    System.out.println(nums);
}
	}
