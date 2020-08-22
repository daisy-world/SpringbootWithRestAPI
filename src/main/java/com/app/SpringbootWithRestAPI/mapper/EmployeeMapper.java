package com.app.SpringbootWithRestAPI.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeMapper {
	
	
		@JsonProperty("employeeId")
		private String employeeId;
		
		@JsonProperty("employeeName")
        private String employeeName;
		
		@JsonProperty("address")
        private String address;
		
		@JsonProperty("email")
        private String email;
		
		@JsonProperty("age")
		private int age;

		

		public String getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(String employeeId) {
			this.employeeId = employeeId;
		}

		public String getEmployeeName() {
			return employeeName;
		}

		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		
		
		

}
