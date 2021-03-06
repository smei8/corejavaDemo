package assignment2;

public class ArrayDemo2 {
	public static int[][] matrixAdd(int[][] arr1, int[][]arr2) {
		int[][] sum = new int[arr1.length][arr1.length];
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				int first = arr1[i][j];
				int second = arr2[i][j];
				sum[i][j] = first + second;
				//System.out.println(sum[i][j]);
			}
			//System.out.println();
		}
		return sum;
	}
	public static int[][] matrixMultiply(int[][] arr1, int[][] arr2) {
		int[][] product = new int[arr1.length][arr1.length];
		int total = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) { //why does arr1[i].length work not arr1.length?
				int first = arr1[i][j];
				int second = arr2[j][i];
				System.out.println("this is first:" + first);
				System.out.println("this is second:" + second);
				total =+ first * second; 
				product[i][j] = total;
			}
		}
		return product;
	}
	public static void main(String[] args) {
		int[][] myMatrix1 = new int[][] {{10, 20}, {30, 10}};
		int[][] myMatrix2 = new int[][] {{40, 50}, {20, 10}};
		int[][] total = new int[myMatrix1.length][myMatrix2.length];
		
//		int iLength = my2D[0].length;
//		int jLength = my2D[1].length;
		

		//matrixAdd(myMatrix1, myMatrix2);
		total = matrixAdd(myMatrix1, myMatrix2);
		for (int i = 0; i < myMatrix2.length; i++) {
			for (int j = 0; j < myMatrix2[i].length; j++) {
				
				System.out.println(total[i][j]);
			}
			System.out.println();
		}

		
		for (int i = 0; i < myMatrix2.length; i++) {
			for (int j = 0; j < myMatrix2[i].length; j++) {
				total = matrixMultiply(myMatrix1, myMatrix2);
				System.out.println(total[i][j]);
			}
			System.out.println();
		}
	}
}
