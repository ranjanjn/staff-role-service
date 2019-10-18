package com.staff.api.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="staffroles")
public class StaffRoles {
	
	@Id
	private String staffRoleId;
	
	private String staffRole;
	
	@JsonManagedReference("staffroles-staff")
	@OneToMany(mappedBy = "staffRoles",cascade = CascadeType.ALL)
	List<Staff>staffList=new ArrayList<>();
	
	public StaffRoles(){
		
	}

	public StaffRoles(String staffRoleId, String staffRole, List<Staff> staffList) {
		super();
		this.staffRoleId = staffRoleId;
		this.staffRole = staffRole;
		this.staffList = staffList;
	}

	public String getStaffRoleId() {
		return staffRoleId;
	}

	public void setStaffRoleId(String staffRoleId) {
		this.staffRoleId = staffRoleId;
	}

	public String getStaffRole() {
		return staffRole;
	}

	public void setStaffRole(String staffRole) {
		this.staffRole = staffRole;
	}

	public List<Staff> getStaffList() {
		return staffList;
	}

	public void setStaffList(List<Staff> staffList) {
		this.staffList = staffList;
	}

	@Override
	public String toString() {
		return "StaffRoles [staffRoleId=" + staffRoleId + ", staffRole=" + staffRole + ", staffList=" + staffList + "]";
	}

	

}
