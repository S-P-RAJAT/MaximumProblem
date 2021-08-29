package com.bridgelabz.maximumproblem;

public class MaximumProblem {
	public static void main(String[] args) {
		System.out.println("Welcome to Maximum Problem Program!");

		int integerNumber1 = 1, integerNumber2 = 2, integerNumber3 = 3;		
		System.out.println("Maximum of " + integerNumber1 + ", " + integerNumber2 + ", " + integerNumber3 + " is " + findMaximum(integerNumber1, integerNumber2, integerNumber3));

		float floatNumber1 = 9.0f, floatNumber2 = 52.0f, floatNumber3 = 3.0f;
		System.out.println("Maximum of " + floatNumber1 + ", " + floatNumber2 + ", " + floatNumber3 + " is " + findMaximum(floatNumber1, floatNumber2, floatNumber3));

	}

	public static int findMaximum(Integer Number1, Integer Number2, Integer Number3) {
		if (Number1.compareTo(Number2) > 0) {
			if (Number1.compareTo(Number3) > 0) {
				return Number1;

			} else {
				return Number3;
			}

		} else {
			if (Number2.compareTo(Number3) > 0) {
				return Number2;

			} else {
				return Number3;

			}

		}

	}
	public static float findMaximum(Float Number1, Float Number2, Float Number3) {
		if (Number1.compareTo(Number2) > 0) {
			if (Number1.compareTo(Number3) > 0) {
				return Number1;

			} else {
				return Number3;
			}

		} else {
			if (Number2.compareTo(Number3) > 0) {
				return Number2;

			} else {
				return Number3;

			}

		}

	}
}
