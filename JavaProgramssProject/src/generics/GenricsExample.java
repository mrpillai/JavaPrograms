package generics;

class GenTesCla<K> {

	K name;
	static int b=10;
	int a=20;
	final int g;


	public GenTesCla(K name, int a, int g) {
		super();
		this.name = name;
		this.a = a;
		this.g = g;
	}

	public K getName() {
		return name;
	}

	public void setName(K name) {
		this.name = name;
	}

	public int getG() {
		return g;
	}

}

public class GenricsExample {

	public static void main(String[] args) {

		GenTesCla gentescla =  new GenTesCla("Mridu", 0, 0);
		gentescla.b=100;
		System.out.println("b="+GenTesCla.b);
		
		//gentescla.g=100;

		
		gentescla.a=200;
		System.out.println("a="+gentescla.a);

		
		GenTesCla<Integer> gentescla1 =  new GenTesCla<Integer>(1, 0, 0);
		gentescla1.b++;
		System.out.println("b="+GenTesCla.b);
		
		gentescla1.a++;
		System.out.println("a="+gentescla1.a);
		
		System.out.println("Res:-"+gentescla.getName());
		System.out.println("Res1:-"+gentescla1.getName());

		System.out.println(printIsos());
	}
	
	public static  String printIsos(){
		 StringBuilder result = new StringBuilder();
		    for (int r = 1; r <= 10; r++) {
		        for (int j = 1; j <= r; j++) {
		            result.append("*");
		        }
		        result.append(System.lineSeparator());
		    }
		    return result.toString();
	}

}


