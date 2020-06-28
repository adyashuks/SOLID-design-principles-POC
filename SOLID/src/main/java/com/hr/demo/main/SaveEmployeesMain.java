package com.hr.demo.main;

import java.util.List;

import com.hr.demo.logging.ConsoleLoger;
import com.hr.demo.persistence.EmployeeFileSerializer;
import com.hr.demo.persistence.EmployeeRepository;
import com.hr.demo.pesonnel.Employee;

/**
 * SaveEmployeesMain
 *
 */
public class SaveEmployeesMain 
{
    public static void main( String[] args )
    {
    	EmployeeFileSerializer emplSerializer = new EmployeeFileSerializer();
    	EmployeeRepository repo = new EmployeeRepository(emplSerializer);
    	ConsoleLoger consoleLoger = new ConsoleLoger();
    	
    	List<Employee> employees = repo.findAll();
    	
    	for(Employee e : employees) {
    		try {
    			repo.save(e);
    			consoleLoger.writeInfo("Save employee " + e.toString());
    		} catch(Exception e1) {
    			consoleLoger.writeError("Error saving employee", e1);
    		}
    	}
    }
}
