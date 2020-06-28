package com.hr.demo.taxes;

import com.hr.demo.pesonnel.Employee;

public class InternTaxCalculator implements TaxCalculator {

	private final int INCOME_TAX_PERECENT = 16;

	public double calculate(Employee emp) {
		int monthlyIncome = emp.getMonthlyIncome();
		if (monthlyIncome < 500) {
			return 0;
		} else {
			return (monthlyIncome * INCOME_TAX_PERECENT) / 100;
		}
	}
}
