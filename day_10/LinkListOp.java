package day_10;

import java.util.LinkedList;

public class LinkListOp {
	

	public static void main(String[] args) {
	LinkedList<Integer> nums = new LinkedList<>();
	nums.add(1);
	nums.addLast(2);//append the specified element to the end of a linked list.
	nums.add(3);
	nums.add(4);
	nums.add(5);
	nums.add(6);
	
	System.out.println(nums);
	
for(Integer num : nums) {
if (num==3) System.out.println("yes");} //iterate through all elements in a linked list.
	
int startIndex = 2; // Start from index 2 (element "C")

for (int i = startIndex; i < nums.size(); i++) {//iterate through all elements in a linked list starting at the specified position.
    System.out.println(nums.get(i));
}
  //iterate a linked list in reverse order.

int l = nums.size()-1;
for(int i=l ;i>=0;i--) {
	System.out.println(nums.get(i));
}
nums.set(startIndex, 8);
System.out.println(nums); //insert the specified element at the specified position in the linked list.
	//Insert elements into the linked list at the first and last position.
	nums.addFirst(9);
	nums.addLast(6);
	System.out.println(nums.getFirst());
	System.out.println(nums.getLast());
	// get the first and last occurrence of the specified elements in a linked list.
	
	 int target = 6;

     int firstIndex = nums.indexOf(target);
     int lastIndex = nums.lastIndexOf(target);

     System.out.println("First occurrence of '" + target + "': " + firstIndex);
     System.out.println("Last occurrence of '" + target + "': " + lastIndex);
	

}
}
