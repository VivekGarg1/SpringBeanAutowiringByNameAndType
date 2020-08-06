package com.home.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.model.Employee;
import com.home.model.Pancard;

public class ClientTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Employee employee = context.getBean(Employee.class, "employee");
		if(employee!=null)
			System.out.println(employee.getEmployeeId()+"\t"+employee.getEmail()+"\t"+employee.getEmployeeName());
		Pancard pancard = employee.getPancard();
		if(pancard!=null) {
			System.out.println(pancard.getPanHolderName()+"\t"+pancard.getPanNo());
		}
		((AbstractApplicationContext) context).close();
	}

}
