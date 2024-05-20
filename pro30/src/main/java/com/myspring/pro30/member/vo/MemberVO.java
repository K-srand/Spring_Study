package com.myspring.pro30.member.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("memberVO")
public class MemberVO {
	
		private String id;
		private String pwd;
		private String name;
		private String email;
		private String zip_num;
		private String address;
		private String phone;
		private char useyn;
		private Date indate;

		public MemberVO() {
			
		}
		
		public MemberVO(String id, String pwd, String name, String email, String zip_num, String address, String phone, char useyn, Date indate) {
			this.id = id;
			this.pwd = pwd;
			this.name = name;
			this.email = email;
			this.zip_num = zip_num;
			this.address = address;
			this.phone = phone;
			this.useyn = useyn;
			this.indate = indate;
			
		}
		
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getZip_num() {
			return zip_num;
		}

		public void setZip_num(String zip_num) {
			this.zip_num = zip_num;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public char getUseyn() {
			return useyn;
		}

		public void setUseyn(char useyn) {
			this.useyn = useyn;
		}

		public Date getIndate() {
			return indate;
		}

		public void setIndate(Date indate) {
			this.indate = indate;
		}
}

