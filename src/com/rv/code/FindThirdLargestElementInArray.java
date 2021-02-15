package com.rv.code;

/**
 * Code to find third largest element in an array.
 * 
 * @author aterati
 *
 */
public class FindThirdLargestElementInArray {

	/**
	 * Given an array of distinct elements. Find the third largest element in it.
	 * Return -1 if the list contains less than 3 numbers.
	 * 
	 * Logic: Use 3 storage variables to keep a record of largest, second largest and third largest numbers.
	 * Loop through the array and update the variables accordinly. 
	 *
	 * @author aterati
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		FindThirdLargestElementInArray ft = new FindThirdLargestElementInArray();
		int[] inputArray1 = {9, 1, 2, 4,9, 3,6 };
		int[] inputArray2 = {9, 3, 0, 6, 5};
		int[] inputArray3 = {4,5};
		System.out.println("The third Largest Number in inputArray1 is: " + ft.findThirdLargestNumber(inputArray1, 0));
		System.out.println("The third Largest Number in inputArray2 is: " + ft.findThirdLargestNumber(inputArray2, 0));
		System.out.println("The third Largest Number in inputArray3 is: " + ft.findThirdLargestNumber(inputArray3, 0));

	}

	int findThirdLargestNumber(int a[], int n) {

		if (a.length < 2)
			return -1;
		else {
			int largestNumber = a[0];
			int secondLargestNumber = -1;
			int thirdLargestNumber = -1;

			for (int i = 1; i < a.length; i++) {

				if (largestNumber < a[i] && largestNumber != a[i]) {
					thirdLargestNumber = secondLargestNumber;
					secondLargestNumber = largestNumber;
					largestNumber = a[i];
				} else if (secondLargestNumber < a[i] && secondLargestNumber !=a[i]) {
					thirdLargestNumber = secondLargestNumber;
					secondLargestNumber = a[i];
				} else if (thirdLargestNumber < a[i]) {
					thirdLargestNumber = a[i];
				}
			}

			return thirdLargestNumber;
		}

	}

}
