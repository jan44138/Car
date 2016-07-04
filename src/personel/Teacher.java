package personel;

import java.math.BigDecimal;

public class Teacher extends Person {

	BigDecimal salary;
	
	public Teacher(String name, String surname, short age, BigDecimal salary){
		super(name, surname, age);
		this.salary = salary;
	}
}
