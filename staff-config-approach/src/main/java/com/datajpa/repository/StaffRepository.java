package com.datajpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.datajpa.entity.Staff;

public interface StaffRepository extends CrudRepository<Staff, Integer> {

	@Override
	<S extends Staff> S save(S entity);
}
