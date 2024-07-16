package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.Address;
import com.app.Employee;
import com.app.Student;

@Configuration
public class AppConfig {
	@Bean
	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmpId("102");
		employee.setEmpName("Michel");
		employee.setAge(28);
		employee.setDesignation("Software Tester");
		employee.setAddress(getEmployeeAddress());
		return employee;
	}

	@Bean
	public Address getEmployeeAddress() {
		Address employeeAddress = new Address();
		employeeAddress.setHouseNo("450-90-1");
		employeeAddress.setArea("Gachibowli");
		employeeAddress.setCity("Hyderabad");
		employeeAddress.setState("Telangana");
		employeeAddress.setCountry("India");
		employeeAddress.setZipCode("506778");
		return employeeAddress;
	}

	@Bean
	public Student getStudent() {
		Student student = new Student();
		student.setsId("3003");
		student.setsName("Lissa");
		student.setAge(26);
		student.setCourse("Cyber Security");
		student.setAddress(getStudentAddress());
		return student;
	}

	@Bean
	public Address getStudentAddress() {
		Address studentAddress = new Address();
		studentAddress.setHouseNo("450-90-1");
		studentAddress.setArea("Gachibowli");
		studentAddress.setCity("Hyderabad");
		studentAddress.setState("Telangana");
		studentAddress.setCountry("India");
		studentAddress.setZipCode("506778");
		return studentAddress;
	}
}
