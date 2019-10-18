package com.staff.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.staff.api.domain.StaffRoles;
import com.staff.api.service.StaffRolesService;

@RestController
@RequestMapping("/staffrole")
public class StaffRolesController {
	
	
	@Autowired
	private StaffRolesService staffRolesService;
	
	@PostMapping("/create")
	public void createStaffRoles(@RequestBody StaffRoles staffRoles) {
		staffRolesService.createStaffRoles(staffRoles);
	}
	
	@GetMapping("/findAll")
	public List<StaffRoles>findAllStaffRoles(){
		List<StaffRoles>staffRolesList = staffRolesService.findAllStaffRoles();
		return staffRolesList;
	}
	
	@GetMapping("/findstaffrole/{staffrole}")
	public StaffRoles findByStaffRole(@PathVariable String staffRole) {
		return staffRolesService.findByStaffRole(staffRole);
	}

}
