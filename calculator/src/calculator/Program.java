package calculator;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		   double num1;
		   //int n1 = (int)num1 (type casting is a method that converts a data type into another data type
		   double num2;
		   double ans;
	      char op;
	      //Static keyword is mainly used for memory management and it is used for a constant variable
	    /*final double PI=3.1416;(final keyword is used to denote constant if we denote final
	       then it can be accessed only once whether it is variable, method or classes*/
	      Scanner reader = new Scanner(System.in);
	      while(true) { //loopingstatements
	      System.out.print("Enter two numbers: ");
	      num1 = reader.nextDouble();
	      num2 = reader.nextDouble();
	      System.out.print("\nEnter an operator (+, -, *, /): ");
	      op = reader.next().charAt(0);
	       switch(op) {
	         case '+': ans = num1 + num2;
	            break;
	         case '-': ans = num1 - num2;
	            break;
	         case '*': ans = num1 * num2;
	            break;
	         case '/': ans = num1 / num2;
	            break;
	         
	         default: System.out.printf("Error! Enter correct operator");
	         return;
	      }
	      System.out.print("\nThe result is given as follows:\n");
	      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);

	}

}
}