package com.hr.demo.persistence;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.hr.demo.pesonnel.Employee;
import com.hr.demo.pesonnel.FullTimeEmployee;
import com.hr.demo.pesonnel.Intern;
import com.hr.demo.pesonnel.PartTimeEmployee;

public class EmployeeRepository {
	
	private EmployeeFileSerializer serializer;

	public EmployeeRepository(EmployeeFileSerializer serializer) {
		this.serializer = serializer;
	}

	public List<Employee> findAll() {
		Employee fullTimeEmp1 = new FullTimeEmployee("Adya Shukla", 2000);
		Employee fullTimeEmp2 = new FullTimeEmployee("Adya1 Shukla", 3000);
		Employee partTimeEmp = new PartTimeEmployee("Adya2 Shukla", 4000);
		Employee internEmp = new Intern("Adya3 Shukla", 5000);

		return Arrays.asList(fullTimeEmp1, fullTimeEmp2, partTimeEmp, internEmp);
	}

	public void save(Employee employee) {
		try {
			
			String serializedString = this.serializer.serialize(employee);
			Path path = Paths.get(employee.getFullName().replace(" ", "_" + ".rec"));
			Files.write(path, serializedString.getBytes());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
