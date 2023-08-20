/* JP to find BMI of a person and if it's in between 10-15 print need to work hard
 * if 15-22 BMI is okay.
 * if >22 Fat.
 */

package org.mathLogic;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the height(ft): ");
			float hi=sc.nextFloat();
			hi=hi * 0.3048f;
			System.out.print("Enter the weight(kg): ");
			float wt=sc.nextFloat();
			float bmi=wt/(hi*hi);
			System.out.println(bmi);
			
			
//			Normal technique
//			if(bmi<18.5)
//				System.out.println("Underweight");
//			else if(bmi<24.9)
//				System.out.println("Healthy Weight");
//			else if(bmi<29.9)
//				System.out.println("Overweight");
//			else
//				System.out.println("Obesity");
			
			
//			Ternary Operator
			System.out.println((bmi<18.5)?"Underweight":(bmi<24.9)?"Healthy Weight":(bmi<29.9)?"Overweight":"Obesity");
		}
}
}