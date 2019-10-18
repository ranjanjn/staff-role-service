package com.staff.api.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="staff")
public class Staff {
	
	@Id
	private String staffId;
	
	private String firstName;
	private String lastName;
	private String otherDetails;
	
	@JsonBackReference("staffroles-staff")
	@ManyToOne
	@JoinColumn(name="staff_role_id")
	private StaffRoles staffRoles;
	
	public Staff() {
		
	}

	public Staff(String staffId, String firstName, String lastName, String otherDetails, StaffRoles staffRoles) {
		super();
		this.staffId = staffId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.otherDetails = otherDetails;
		this.staffRoles = staffRoles;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOtherDetails() {
		return otherDetails;
	}

	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}

	public StaffRoles getStaffRoles() {
		return staffRoles;
	}

	public void setStaffRoles(StaffRoles staffRoles) {
		this.staffRoles = staffRoles;
	}

	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", firstName=" + firstName + ", lastName=" + lastName + ", otherDetails="
				+ otherDetails + ", staffRoles=" + staffRoles + "]";
	}
    
}
