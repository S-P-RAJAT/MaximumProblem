package com.bridgelabz.maximumproblem;

public class MaximumProblem {
	public static void main(String[] args) {
		System.out.println("Welcome to Maximum Problem Program!");

		int integerNumber1 = 1, integerNumber2 = 2, integerNumber3 = 3;
		System.out.println("Maximum of " + integerNumber1 + ", " + integerNumber2 + ", " + integerNumber3 + " is "
				+ findMaximum(integerNumber1, integerNumber2, integerNumber3));

		float floatNumber1 = 9.0f, floatNumber2 = 52.0f, floatNumber3 = 3.0f;
		System.out.println("Maximum of " + floatNumber1 + ", " + floatNumber2 + ", " + floatNumber3 + " is "
				+ findMaximum(floatNumber1, floatNumber2, floatNumber3));

		String string1 = "hello", string2 = "world", string3 = "computer";
		System.out.println("Maximum of " + string1 + ", " + string2 + ", " + string3 + " is "
				+ findMaximum(string1, string2, string3));

	}

	public static <E extends Comparable<E>> E findMaximum(E firstInput, E secondInput, E thirdInput) {
		if (firstInput.compareTo(secondInput) > 0) {
			if (firstInput.compareTo(thirdInput) > 0) {
				return firstInput;

			} else {
				return thirdInput;
			}

		} else {
			if (secondInput.compareTo(thirdInput) > 0) {
				return secondInput;

			} else {
				return thirdInput;

			}

		}

	}

}
