package com.datajpa.service;

import com.datajpa.dto.StaffDto;
import com.datajpa.entity.Staff;
import com.datajpa.repository.StaffRepository;

public class ManageStaffService {

	private StaffRepository staffRepository;

	public int save(StaffDto staffDto) {
		Staff staff = null;
		staff = new Staff();
		staff.setStaffNo(staffDto.getStaffNo());
		staff.setStaffName(staffDto.getStaffName());
		staff.setAge(staffDto.getAge());
		staff.setEmailAddress(staffDto.getEmailAddress());
		staff.setGender(staffDto.getGender());
		staff.setMobileNo(staffDto.getMobileNo());
		staffRepository.save(staff);
		return staff.getStaffNo();

	}

	public void setStaffRepository(StaffRepository staffRepository) {
		this.staffRepository = staffRepository;
	}

}
