package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Friend {
	@Id
	private String fcode;
	private String fname;
	private String address;
	private String mobile;
	private String email;
	public String getFcode() {
		return fcode;
	}
	public void setFcode(String fcode) {
		this.fcode = fcode;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Friend(String fcode, String fname, String address, String mobile,
			String email) {
		super();
		this.fcode = fcode;
		this.fname = fname;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}
	public Friend() {
		super();
	}
	public Friend(String fcode) {
		super();
		this.fcode = fcode;
	}
	@Override
	public String toString() {
		return "Friend [fcode=" + fcode + ", fname=" + fname + ", address="
				+ address + ", mobile=" + mobile + ", email=" + email + "]";
	}
	
}
