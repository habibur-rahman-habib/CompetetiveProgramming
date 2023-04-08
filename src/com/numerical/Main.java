package com.numerical;

import java.util.*;
import java.io.*;

public class Main {
	
	private static Scanner sc;
	
	public static void main(String[] args) throws FileNotFoundException {
		sc = new Scanner(new FileReader(new File("input.txt")));
		
		double a = sc.nextDouble(), b = sc.nextDouble();
		
		System.out.println(bisection(a, b));
	}
	
	// Closed Methods
//	1. Bisection Method
	
	private static double bisection(double a, double b) {
		double fa = f(a);
		double fb = f(b);
		
		double c = a, fc;
		
		while ((int)(Math.abs(fa - fb) * 10000) > 0) {
			c = (a + b) / 2;
			fc = f(c);
			if (fc < 0 && fa < 0 || fc > 0 && fa > 0) {
				a = c;
				fa = fc;
			} else {
				b = c;
				fb = fc;
			}
			System.out.println("c: " + c);
		}
		
		return c;
	}
	
	private static double f(double x) {
		double val = (x * x) - 7;
		return val;
	}

}

