package exceptionHandling;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ExceptionHandling {

	public static void main(String[] args) {

		
		try {
			
			
			//HashSet<String> numbersSet = new LinkedHashSet<>(Arrays.asList(15));
			
			
		    // divide by Zero
		    int result = 19/0;
		}
		catch(ArithmeticException aex) {
		 
		    // exception handling code
		    System.out.println("Exception handling code");
		}
		
		int a =10;
		int b=100;
		
		  System.out.println("Result:-"+(a+b));
							
	}

	

}
