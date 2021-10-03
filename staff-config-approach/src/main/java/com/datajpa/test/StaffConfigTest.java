package com.datajpa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.datajpa.dto.StaffDto;
import com.datajpa.service.ManageStaffService;

public class StaffConfigTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = null;
		ManageStaffService staffService = null;
		StaffDto dto = null;
		applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		staffService = applicationContext.getBean("manageStaffService", ManageStaffService.class);
		dto = new StaffDto();
		dto.setStaffName("Rick Lanford");
		dto.setGender("male");
		dto.setEmailAddress("rick@gmail.com");
		dto.setMobileNo("15612556");
		dto.setAge(22);
		int staffNo = staffService.save(dto);
		System.out.println("staffNo:" + staffNo);

	}

}
