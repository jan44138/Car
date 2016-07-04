package personel;

import java.math.BigDecimal;

public abstract class Person {

	String name;
	short age;
	BigDecimal salary;

	public Person(String name, short age, BigDecimal salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;

	}
	
	
}
