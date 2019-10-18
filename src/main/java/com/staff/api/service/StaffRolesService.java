package com.staff.api.service;

import java.util.List;

import com.staff.api.domain.StaffRoles;

public interface StaffRolesService {
	
	public void createStaffRoles(StaffRoles staffRoles);
	
	public void findStaffRolesById(String staffroleId);
	
	public List<StaffRoles>findAllStaffRoles();
	
	public StaffRoles findByStaffRole(String staffRole);

}
