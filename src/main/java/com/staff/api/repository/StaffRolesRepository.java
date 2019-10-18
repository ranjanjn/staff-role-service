package com.staff.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.staff.api.domain.StaffRoles;

@Repository
public interface StaffRolesRepository extends JpaRepository<StaffRoles, String>{
	
	public StaffRoles findByStaffRole(String staffRole);

}
