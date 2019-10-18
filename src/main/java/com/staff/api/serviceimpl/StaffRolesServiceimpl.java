package com.staff.api.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staff.api.domain.StaffRoles;
import com.staff.api.repository.StaffRolesRepository;
import com.staff.api.service.StaffRolesService;

@Service
public class StaffRolesServiceimpl implements StaffRolesService{
	
	@Autowired
	private StaffRolesRepository staffRolesRepository;

	@Override
	public void createStaffRoles(StaffRoles staffRoles) {
		staffRolesRepository.save(staffRoles);
		
	}

	@Override
	public void findStaffRolesById(String staffroleId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<StaffRoles> findAllStaffRoles() {
		List<StaffRoles>staffRolesList=new ArrayList<>();
		staffRolesList = staffRolesRepository.findAll();
		return staffRolesList ;
	}

	@Override
	public StaffRoles findByStaffRole(String staffRole) {
		StaffRoles staffRoles = new StaffRoles();
		 staffRoles = staffRolesRepository.findByStaffRole(staffRole);
		 return staffRoles;
	}

}
