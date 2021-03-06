package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//feature of list
			//indexed
			//allows duplicated values
			//maintain the order
		
		//not recommanded way of creating Arraylist object
		//ArrayList myList = new ArrayList();
		
		//recommanded way
		List myList = new ArrayList();
		//List myVector = new Vector();
		
		String str1 = "hello";
		String str2 = "Welcome";
		//Room room = new Room(200. 300);
		//wrapper class
		//Integer number = new Integer(10); // new Integer() is deprecated, something old, advice not to use
		Integer number = 10;
		
		// C-Create
		System.out.println("Creating: ");
		myList.add(str1);
		myList.add(str2);
		//myList.add(room);
		myList.add(number);
		myList.add(str1);
		System.out.println();
		
		//R-Read
		System.out.println("Reading: ");
		System.out.println(myList);
		System.out.println(myList.get(1));
		System.out.println();
		
		//U-Update
		System.out.println("Updating: ");
		myList.set(0, "bye");
		myList.set(1, "home");
		myList.set(2, 20);
		// Auto boxing - primitive is automatically converted to its wrapper type 
		//and vice versa
		System.out.println(myList);
		System.out.println(myList.get(1));
		System.out.println();
		
		//D-Delete
		System.out.println("Deleting: ");
		myList.remove(1);
		System.out.println(myList);
	}

}
