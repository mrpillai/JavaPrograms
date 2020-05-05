package exceptionHandling;

interface Type1 {
	void f() throws CloneNotSupportedException;
}

interface Type2 {
	void f() throws InterruptedException;
}

interface Type3 extends Type1, Type2 {
}

public class InterfaceException implements Type3 {
	public void f() {
		System.out.println("Hello world");
	}

	public static void main(String[] args) {
		Type3 t3 = new InterfaceException();
		t3.f();
	}
}
