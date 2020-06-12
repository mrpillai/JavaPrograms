package regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptureGroup {

	public static void main( String args[] ) {
	      // String to be scanned to find the pattern.
	     // String line = "This order was placed for QT3000! OK?";
	      String line = "This15768hfjvgvgjv3456?";

	      String pattern = "(.*)(\\d+)(.*)";

	      // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);

	      // Now create matcher object.
	      Matcher m = r.matcher(line);
	      System.out.println("M:-"+m);
	      if (m.find( )) {
	         System.out.println("Found value0: " + m.group(0) );
	         System.out.println("Found value1: " + m.group(1) );
	         System.out.println("Found value2: " + m.group(2) );
	         System.out.println("Found value3: " + m.group(3) );

	      }else {
	         System.out.println("NO MATCH");
	      }
	      
	      String s = "gggggggghjklkjhgfd";

	      String pattern1 = "[abc]";

	      // Create a Pattern object
	      Pattern r1 = Pattern.compile(pattern1);

	      // Now create matcher object.
	     // Matcher m1 = r1.matcher(line1);
	      
	      
	      if ( s.matches(".*[^a-c].*") ) { 
	    	    // Do something
	    			         System.out.println("abc present" );

	      }else
		         System.out.println("abc not present" );

	   }
	
	
}
