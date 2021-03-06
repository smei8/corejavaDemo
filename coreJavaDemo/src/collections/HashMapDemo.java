package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		//map differs from the rest of the collectio because it has a key and value
		
		//interface refernce var =  new collection you are creating()
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		
		//Creating
		phoneBook.put("xyz", 123456);
		phoneBook.put("abs", 234567);
		phoneBook.put("dfg", 345566);
		
		//Reading
		System.out.println("phone number of abs is: " + phoneBook.get("abs"));
		
		//take all the keys of the hashmap and store it in a set
		Set<String> allkeys = phoneBook.keySet();
		//iterating through the set
		Iterator<String> itr = allkeys.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			Integer number = phoneBook.get(name);
			System.out.println("key: " + name + ", Value: " + number);
		}
		
		//explore other ways to iterator through hashmap
		
		
		//delete
		phoneBook.remove("abd");
		System.out.println(phoneBook);
		
		//Update
		phoneBook.replace("xyz", 5555555);
		System.out.println(phoneBook);
	}
	

}
