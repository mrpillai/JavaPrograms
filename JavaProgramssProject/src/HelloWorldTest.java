import java.io.IOException;

/**
 * 
 */

/**
 * @author mrpillai
 *
 */
public class HelloWorldTest {

	
	  HelloWorldTest(){
		 
	  }
	  
	  final int a;
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello testing Java Program");
		

String s1 = "abc";
String s2 = "abc";
System.out.println(s1 == s2);


String s3 = "JournalDev";
int start = 1;
char end = 5;
System.out.println(start + end);
System.out.println(s3.substring(start, end));

try {
	throw new IOException("Hello");
}catch(IOException e) {
	System.out.println(e.getMessage());
}catch(Exception e){
	
}
		
	}

}
