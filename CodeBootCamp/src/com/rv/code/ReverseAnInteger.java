package com.rv.code;


/**
 * This class helps to reverse an integer.
 * 
 * 
 * @author aterati
 *
 */
public class ReverseAnInteger {
	
	/**
	 * This method will reverse the number 
	 * using modulus(%) and division(/) operators.
	 * 
	 * @param num
	 * @return
	 */
	public int reverseNumber(int num) {
		int reverseNum=0;
		
		while(num>0) {
			reverseNum = reverseNum*10+(num%10);
			num = num/10;
		}
		return reverseNum;
	}
	
	public static void main(String[] args) {
		
//		Input number to reverse
		int number = 110251;
		ReverseAnInteger r = new ReverseAnInteger();
		System.out.println(r.reverseNumber(number));
		
	}

}
