package com.bridgelabz.day3.UC_LineComparisonProblem;

import java.util.*;
public class LineComparisonProblem {

	private static final String Maths = null;

	public static void main(String[] args) {
		System.out.println("-------------Welcome to Line Comparison Computation Program-------------");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Co-ordinates(x1,y1): ");
		float x1= scan.nextFloat();
		float y1= scan.nextFloat();
		System.out.print("Enter Second Co-ordinates(x2,y2): ");
		float x2= scan.nextFloat();
		float y2= scan.nextFloat();
		System.out.println();
		System.out.println("Length of a line "+Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));  
	}

}
