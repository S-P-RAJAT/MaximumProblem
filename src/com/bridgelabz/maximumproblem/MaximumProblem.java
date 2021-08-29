package com.bridgelabz.maximumproblem;

public class MaximumProblem {
	public static void main(String[] args) {
		System.out.println("Welcome to Maximum Problem Program!");
		int a = 1, b = 2, c = 3;
		System.out.println("Maximum of " + a + ", " + b + ", " + c + " is " + findMaximum(a, b, c));

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
}
