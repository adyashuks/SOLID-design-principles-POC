package com.hr.demo.taxes;

import com.hr.demo.pesonnel.Employee;
import com.hr.demo.pesonnel.FullTimeEmployee;
import com.hr.demo.pesonnel.Intern;
import com.hr.demo.pesonnel.PartTimeEmployee;

public class FullTimeTaxCalculator implements TaxCalculator{

	private final int RETIREMENT_TAX_PERCENT = 10;
	private final int INCOME_TAX_PERECENT = 16;
	private final int BASE_HEALTH_INSURANCE = 100;

	public double calculate(Employee emp) {
		int monthlyIncome = emp.getMonthlyIncome();

			return BASE_HEALTH_INSURANCE + (monthlyIncome * RETIREMENT_TAX_PERCENT) / 100
					+ (monthlyIncome * INCOME_TAX_PERECENT) / 100;

	}
}
