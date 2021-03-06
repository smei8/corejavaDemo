package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		//features of hashset
			//not indexed
			// does not allow dupliccated values
			// does not maintain the order
		Set myHashSet = new HashSet();
		
		String str1 = "hello";
		String str2 = "Welcome";
		//Room room = new Room(200. 300);
		//wrapper class
		//Integer number = new Integer(10); // new Integer() is deprecated, something old, advice not to use
		Integer number = 10;

		
		//Creating
		myHashSet.add(str1);
		myHashSet.add(str2);
		myHashSet.add(number);
		myHashSet.add(str1);
		
		//Reading
		System.out.println(myHashSet);
		//myHashSet.get
		Iterator<Set> hs = myHashSet.iterator();
		
		while (hs.hasNext())
			System.out.println(hs.next());
		
		System.out.println();
		
		//Updating
		myHashSet.add("bye");
		myHashSet.add(420);
		System.out.println(myHashSet);
		System.out.println();
		
		//Deleting
		myHashSet.remove("bye");
		System.out.println(myHashSet);
	}

}
