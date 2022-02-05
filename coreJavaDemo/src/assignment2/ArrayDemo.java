package assignment2;

public class ArrayDemo {

	public static int sumOfArray(int [] array) {
		int sum = 0; // sum of array
		
		for (int i = 0; i < array.length; i++) {
			sum = array[i] + sum;
		}
		return sum;
	}
	public static int duplicateNum(int [] arr, int x) {
		int count = 0; //to count how many time a num appeared

		//goes through each number in the arry
		for (int i = 0; i < arr.length; i++) {
			//compares the each x being passed in with i
			if (x == arr[i]) 
				// if x == i then count increments
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		int[] myNumbers = new int[] {10, 20, 30, 10, 40, 50, 20, 10}; //total 190

		// to print out each int in the array
		for (int i = 0; i < myNumbers.length; i++) {
			//store each element in the arry here to pass to repeatedNUm method for comparison
			int x = myNumbers[i];
			//prints out each int in the array one at a time while calling
			//the method repeatedNum to count the occurrence of each number
			System.out.println(x + " - " + duplicateNum(myNumbers, x));
		}
		//System.out.println(repeatedNum(myNumbers));		
		System.out.println("The sum of this array is "+ sumOfArray(myNumbers));
		
	}
}


////int repeated[] = new int[array.length];
//
/////boolean visited[] = new boolean[array.length];
//int count = 0;
//for (int i = 0; i < array.length; i++) {
//	//System.out.println("this is i: " + array[i]);
//	//if (visited[i] == true) //skip over if its true
//		//continue;
//	//count = 0;	
//	for (int j = i + 1; j < array.length; j++) {
//		//System.out.println("this is j: " + array[j]);
//		//count = 0;
//		if (array[i] == array[j]) {
//			//repeated[i]++;
//			//countArr[i] = array[i];
//			//count[i]++;
//			//visited[i] = true;
//			count++;
//			//repeated[i] = count;
//			//return count;
//			System.out.println("this is count: " + count);
//		}
//	}
//}
//return count++;		


//for (int i = 0; i < myNumbers.length; i++) {
//	System.out.print(myNumbers[i] + " - ");
//	System.out.println(duplicateNum(myNumbers));
//}