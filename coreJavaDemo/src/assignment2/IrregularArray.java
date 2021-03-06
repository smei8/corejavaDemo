package assignment2;

public class IrregularArray {

	public static void main(String[] args) {

		
		//difference b/w regular and irregular array is:
		// 	a regular array, the number of elements in each dimension is know in advance
			// this number is set at the time of allocating memory for the array 
		int[][] regular = new int[3][5];
		
		//  a irregular array, the number of elements in at least one dimension isunknown
			// this number may vary within this dimension
		//irregular array declaration
		int[][] myArr = new int[2][]; //irregular 2D array with 3 rows
		int[][][] myArr2 = new int[3][4][]; //irregular 3D array
		
		//first row has 3 column;
		myArr[0] = new int[3];
		//second row has 2 columns;
		myArr[1] = new int[2];
		
		//initializing array
		int count = 0;
		for (int i = 0; i < myArr.length; i++) {
			for (int j = 0; j < myArr[i].length; j++) {
				myArr[i][j] = count++;
			}
		}
		
		//display the values of the irregular array
		for (int i = 0; i < myArr.length; i++) {
			for (int j = 0; j < myArr[i].length; j++) { // myArr[i].length is the length of each row
				System.out.print(myArr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
