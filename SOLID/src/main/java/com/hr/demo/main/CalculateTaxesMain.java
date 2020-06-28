package com.hr.demo.main;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import com.hr.demo.logging.ConsoleLoger;
import com.hr.demo.persistence.EmployeeFileSerializer;
import com.hr.demo.persistence.EmployeeRepository;
import com.hr.demo.pesonnel.Employee;
import com.hr.demo.taxes.TaxCalculator;
import com.hr.demo.taxes.TaxCalculatorFactory;

public class CalculateTaxesMain {

	public static void main(String[] args) {
		
		EmployeeFileSerializer emplSerializer = new EmployeeFileSerializer();
    	EmployeeRepository repo = new EmployeeRepository(emplSerializer);
    	ConsoleLoger consoleLoger = new ConsoleLoger();
    	
    	List<Employee> employees = repo.findAll();
    	
    	Locale locale = new Locale("en", "IN");
    	NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
    	
    	for(Employee e : employees) {
    		try {
    			TaxCalculator taxCalculator = TaxCalculatorFactory.create(e);
    			double tax = taxCalculator.calculate(e);
    			String formattedTax = currencyFormatter.format(tax);
    			
    			consoleLoger.writeInfo("Total Taxes =  " + formattedTax.toString());
    		} catch(Exception e1) {
    			consoleLoger.writeError("Error saving employee", e1);
    		}
    	}
	}

}
