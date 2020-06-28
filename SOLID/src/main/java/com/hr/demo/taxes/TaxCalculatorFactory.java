package com.hr.demo.taxes;

import com.hr.demo.pesonnel.Employee;
import com.hr.demo.pesonnel.FullTimeEmployee;
import com.hr.demo.pesonnel.Intern;
import com.hr.demo.pesonnel.PartTimeEmployee;

public class TaxCalculatorFactory {

	public static TaxCalculator create(Employee emp) {
		
		if(emp instanceof FullTimeEmployee) {
			return new FullTimeTaxCalculator();
		}
		
		if(emp instanceof PartTimeEmployee) {
			return new PartTimeTaxCalculator();
		}
		
		if(emp instanceof Intern) {
			return new InternTaxCalculator();
		}
		
		throw new RuntimeException("Invalid Employee type");
	}
}
