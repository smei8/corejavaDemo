package collections;

import java.util.List;
import java.util.Vector;

public class VecterDemo {

	public static void main(String[] args) {
		
		//default capacity is 10
		Vector myVector = new Vector(4);
		
		String str1 = "blue";
		String str2 = "yellow";
		String str3 = "green";
		Integer number = 22;
		
		//Creating
		myVector.add(str1);
		myVector.add(str2);
		myVector.add(str3);
		myVector.add(number);

		
		//Reading
		System.out.println(myVector);
		System.out.println(myVector.capacity());
		
		//Updating
		//when adding an new element at a index that already has something
		//it wont get replace, it will just push that element down one index
		myVector.add(3, "new element");
		System.out.println(myVector);
		System.out.println(myVector.capacity());
		
		//Deleting
		myVector.remove(0);
		System.out.println(myVector);
		System.out.println(myVector.capacity());
	}
}
