package com.bridgelabz.maximumproblem;

public class MaximumProblem<E extends Comparable<E>> {
	E firstValue, secondValue, thirdValue;

	public MaximumProblem(E firstValue, E secondValue, E thirdValue) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
	}

	public void testMaximum()
	{
		System.out.println("Maximum of " + this.firstValue + ", " + this.secondValue + ", " + this.thirdValue + " is "
				+ MaximumProblem.findMaximum(this.firstValue, this.secondValue, this.thirdValue));
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Maximum Problem Program!");

		int integerNumber1 = 1, integerNumber2 = 2, integerNumber3 = 3;
		new MaximumProblem<Integer>(integerNumber1, integerNumber2, integerNumber3).testMaximum();

		float floatNumber1 = 9.0f, floatNumber2 = 52.0f, floatNumber3 = 3.0f;
		new MaximumProblem<Float>(floatNumber1, floatNumber2, floatNumber3).testMaximum();

		String string1 = "hello", string2 = "world", string3 = "computer";
		new MaximumProblem<String>(string1, string2, string3).testMaximum();

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
