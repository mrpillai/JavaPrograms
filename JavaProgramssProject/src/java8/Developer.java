package java8;

import java.math.BigDecimal;

public class Developer {

	
	
	String name;
	BigDecimal sal;
	int age;
	
	
	
	public Developer(String name, BigDecimal sal, int age) {
		super();
		this.name = name;
		this.sal = sal;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSal() {
		return sal;
	}
	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", sal=" + sal + ", age=" + age + "]";
	}




}
