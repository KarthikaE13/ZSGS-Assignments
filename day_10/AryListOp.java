package day_10;
import java.util.ArrayList;
import java.util.Collections;

public class AryListOp {

	public static void main(String[] args) {
		//to create a new array list, add some colours (string) and print out the collection.
		ArrayList<String> colors= new ArrayList<>();
		colors.add("Blue");
		colors.add("Green");
		colors.add("Red");
		colors.add("Pink");
		colors.add("Black");
		colors.add("Gray");
		System.out.println(colors);
		for(String color: colors) { // to iterate through all elements in an array list
			if(color=="Blue") {// to search an element in an array list.
System.out.println("YES");
				}
		}
		String fav = colors.get(1);//to retrieve an element (at a specified index) from a given array list.
		System.out.println(fav);
		colors.set(0, "White"); //to insert an element into the array list at the first position
		colors.set(2,"orange"); //to update specific array element by given element
		System.out.println(colors);
		colors.remove(2);//to remove the third element from an array list.
		System.out.println(colors);
		colors.sort(null);// to sort a given array list
		System.out.println(colors);
		Collections.shuffle(colors);//to shuffle elements in an array list.
		System.out.println(colors);
		ArrayList<String> colors2= new ArrayList<>();
		Collections.copy(colors,colors2);
		System.out.println(colors2);//. to copy one array list into another.
		
		
	}

}
