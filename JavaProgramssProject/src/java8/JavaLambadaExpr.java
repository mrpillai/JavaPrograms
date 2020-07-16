package java8;


interface FunctionalIntf{
	
	void functMethod();
}
public class JavaLambadaExpr {

	public static void main(String[] args) {

	FunctionalIntf dui = ()->{
			System.out.println("jio");
		};
		
		Lamb lamb = new Lamb();
		FunctionalIntf ref = lamb::lamb;
		
		ref.functMethod();
		dui.functMethod();
		
		FunctionalIntf dus = ()->System.out.println("yopo");
		FunctionalIntf dus1 = 0S=-90843c4rtyui op[]
				ystem.out :: println("yopo");

		dus.functMethod();
		dus1.functMethod();

	}

}

class Lamb{
	
	void lamb(){
		System.out.println("Lammb method");
	}
}
