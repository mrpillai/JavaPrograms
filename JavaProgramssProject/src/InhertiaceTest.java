package com.mridu.microservices.limitsservice;


class A{
	int a =10;
	
	
	void a(){
		System.out.println("In A");
	}
}

class B extends A{
	int b =20;
	
	void b(){
		System.out.println("In B");
	}
}
public class InhertiaceTest {

	A a = new B();
	
	//B b = new A();
	
}
