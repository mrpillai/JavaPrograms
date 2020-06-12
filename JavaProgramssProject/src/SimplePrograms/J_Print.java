package SimplePrograms;


//First java program
public class J_Print{
	public static void main (String[] args){
		System.out.println("Hello World!!");
		J_Animal a=new J_Animal();
		J_Dog b=new J_Dog();
		J_Animal c=new J_Dog();
		
		//J_Dog d= new J_Animal();

		a.eat();
		b.eat();
		c.eat();
	}
}

//Second java program for polymorphism
//parent class
class J_Animal{
	public void eat (){
		System.out.println("Parent class");
	}
}

//child class
class J_Dog extends J_Animal{
	public void eat (){
		System.out.println("Child class");
	}
}