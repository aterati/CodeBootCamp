/**
 * 
 */
package com.rv.code;

/**
 * Binary Search Using both loop and recursive call.
 * 
 * Compare the number with the middle number 
 * If number is equals to the middle number - number found at a location 
 * If number is less than the middle number, we check the left block of numbers 
 * If number is greater than the middle number, we check the right block of numbers
 * 
 * @author aterati
 *
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = { 1, 2, 5, 8, 9, 11, 12, 13, 14, 16, 17, 19, 22, 23, 24, 26, 28, 31, 33, 34, 36, 37, 38, 39, 40, 42,
				43, 44, 46, 47, 48, 49, 50, 54, 55, 59, 60, 62, 63, 64, 65, 66, 68, 69, 70, 71, 72, 73, 75, 77, 79, 80,
				82, 86, 87, 88, 92, 93, 94, 96, 97, 98, 99, 100 };
		int number = 14;
		BinarySearch bs = new BinarySearch();

		int numberLocation = bs.binarySearchUsingLoop(arr, number);

		if (numberLocation > 0)
			System.out.println("BinarySearchUsingLoop: Number found at location: " + numberLocation);
		else
			System.out.println("BinarySearchUsingLoop: Number not found");

		numberLocation = bs.binarySearchUsingRecursion(arr, 0, arr.length - 1, number);

		if (numberLocation > 0)
			System.out.println("BinarySearchUsingRecursion: Number found at location: " + numberLocation);
		else
			System.out.println("BinarySearchUsingRecursion: Number not found");
	}

	/**
	 * This method uses a loop and updates the lower and upper limits.
	 *
	 * @param arr
	 * @param k
	 * @return
	 */
	int binarySearchUsingLoop(int[] arr, int k) {
		int lowerLimit = 0;
		int upperLimit = arr.length - 1;

		while (upperLimit >= lowerLimit) {

			int l = (lowerLimit + upperLimit) / 2;

			if (k == arr[l]) {
				return l;
			} else if (k < arr[l]) {
				upperLimit = l - 1;
			} else if (k > arr[l]) {
				lowerLimit = l + 1;
			}
		}

		return -1;
	}

	/**
	 * This method uses the recursive way of calling the same method with different
	 * limits.
	 * 
	 * @param arr
	 * @param lowerLimit
	 * @param upperLimit
	 * @param number
	 * @return location
	 */
	int binarySearchUsingRecursion(int[] arr, int lowerLimit, int upperLimit, int number) {

		int middle = (lowerLimit + upperLimit) / 2;

		if (number == arr[middle]) {
			return middle;
		} else if (number < arr[middle]) {

			upperLimit = middle - 1;

		} else if (number > arr[middle]) {
			lowerLimit = middle + 1;
		}

		if (upperLimit >= lowerLimit)
			return binarySearchUsingRecursion(arr, lowerLimit, upperLimit, number);

		return -1;
	}

}
