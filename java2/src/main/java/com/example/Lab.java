package com.example;

import java.util.Arrays;
import java.util.Stack;

public class Lab {

	/*
	  1. Return the nth fibonacci number
	  f(0) = 0
	  f(1) = 1
	  f(10) = 55
	*/
	public static int fibonacci(int n) {

		int num = 0;
		int num2 = 1;
		int loop;
		int fib = 0;

			for (loop = 0; loop < n; loop++) {
				fib = num + num2;
				num = num2;
				num2 = fib;
			}
			return num;

	}

	/*
	  2. Sort array of integers
	  f([2,4,5,1,3,1]) = [1,1,2,3,4,5]
	  Don't use built-in sort() method... that would be lame.
	*/
	public static int[] sort(int[] array) {


		int[] arr = array;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				int swap = 0;
				if (arr[i] > arr[j]) {
					swap = arr[i];
					arr[i] = arr[j];
					arr[j] = swap;
				}
			}

		}

		return arr;
	}

	/*
	  3. Return the factorial of n
	  f(0) = 1
	  f(1) = 1
	  f(3) = 6
	*/
	public static int factorial(int n) {

		int num = 1;
		int hold = 0;

		if (n==0){
			return 1;
		}

		for (int i = 1; i <= n; i++) {

			hold = num * i;
			num = hold;
		}


		return hold;
	}

	/*
	  4. Rotate left
	  Given array, rotate left n times and return array
	  f([1,2,3,4,5], 1) = [2,3,4,5,1]
	  f([1,2,3,4,5], 6) = [2,3,4,5,1]
	  f([1,2,3,4,5], 3) = [4,5,1,2,3]
	*/
	public static int[] rotateLeft(int[] array, int n) {


		int[]newArr = Arrays.copyOf(array,5);

		//System.out.println(newArr[0]+","+newArr[1]+","+newArr[2]+","+newArr[3]+","+newArr[4]);

		for (int i = 0; i < n; i++){

			newArr[4] = array[0];
			newArr[3] = array[4];
			newArr[2] = array[3];
			newArr[1] = array[2];
			newArr[0] = array[1];

			array[4] = newArr[4];
			array[3] = newArr[3];
			array[2] = newArr[2];
			array[1] = newArr[1];
			array[0] = newArr[0];

			//System.out.println(newArr[0]+","+newArr[1]+","+newArr[2]+","+newArr[3]+","+newArr[4]);
		}

		return newArr;
	}

	/*
	  5. Balanced Brackets
	  A bracket is any one of the following: (, ), {, }, [, or ]
	  The following are balanced brackets:
	    ()
	    ()()
	    (())
	    ({[]})
	  The following are NOT balanced brackets:
	  (
	  )
	  (()
	  ([)]
	  Return true if balanced
	  Return false if not balanced
	*/
	public static boolean balancedBrackets(String bracketsString) {
		return false;
	}



}
