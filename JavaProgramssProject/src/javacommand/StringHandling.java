package javacommand;

public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="a"
				+ "e";
		int countr = 0;
		
		String[] starr = s.split("");
		
		for(String s1:starr){
			
			countr++;
		}
		System.out.println("countgrdxf:-"+countr);
		
		/*int j=0;
		for(int i=0;0<=i;i++,j++){
			s.charAt(i);
			
		}
		
		System.out.println("count by old loop:"+j);
		*/
		
	}

}
