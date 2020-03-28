import java.util.Scanner;

import javax.swing.JOptionPane;

public class Expression {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Hello. Please enter three integers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int answer1 = num1 + num2 * num3;
		int answer2 = (num1 + num2) * num3;
		int answer3 = num1 * num2 + num3;
		int answer4 = num1 * (num2 + num3);
		
		String expression = "The maximum value is obtained by the following expression: ";
		String expression1 = num1+" + "+num2+" * "+num3;
		String expression2 = "("+num1+" + "+num2+") * "+num3;
		String expression3 = num1+" * "+num2+" + "+num3;
		String expression4 = num1+" * ("+num2+" + "+num3+")";
		
		int maxValueExpressionNumber = maxAnswer ( answer1, answer2, answer3, answer4);
		
		if (maxValueExpressionNumber == 0) {
			System.out.println(expression + expression1);
		}
		else if (maxValueExpressionNumber == 1) {
			System.out.println(expression + expression2);
		}
		else if (maxValueExpressionNumber == 2) {
			System.out.println(expression + expression3);
		} 
		else if (maxValueExpressionNumber == 3) {
			System.out.println(expression + expression4);
		}
	}
	
	public static int maxAnswer (int answer1, int answer2, int answer3, int answer4) {
		int [] answers = {answer1, answer2, answer3, answer4};
		int max = answer1;
		int indexMax = 0;
		
		for (int i=1; i<4; i++) {
			if (answers[i] > max) {
				max = answers[i];
				indexMax = i;
			}
		}
		return indexMax;
	}

}
