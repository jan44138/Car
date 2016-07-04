package personel;

import java.math.BigDecimal;

public class Director extends Person{

	BigDecimal salary;
	
	public Director(String name, String surname, short age, BigDecimal salary){
		super(name, surname, age);
		this.salary = salary;
	}
}
