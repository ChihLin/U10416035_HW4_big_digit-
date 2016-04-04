//U10416035 Cheng Chih Lin

import java.util.Scanner;
import java.util.ArrayList;



public class TestDecimal {

	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			// prompt the user to print the two big number
			System.out.print("Enter the first number = ");
			String x = input.nextLine();
			
			System.out.print("Enter the second number = ");
			String y = input.nextLine();
			
			//new an object and print the result
			Decimal decimal = new Decimal(x,y);
			decimal.Plus();
			decimal.Judge();
		
	
	}
}
