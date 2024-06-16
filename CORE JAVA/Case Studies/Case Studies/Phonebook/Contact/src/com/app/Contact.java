package com.app;

import java.time.LocalDate;
import java.util.List;


public class Contact {
		private List<String> phoneNumbers;
		private String name; //non-updatable
		private LocalDate dob;  //non-updatable
		private String email; //optional

	
		
		public Contact(List<String> phoneNumbers, String name, LocalDate dob, String email) {
			super();
			this.phoneNumbers = phoneNumbers;
			this.name = name;
			this.dob = dob;
			this.email = (email.equals("") ? "Not Entered Any Email" : email);

		}



		@Override
		public String toString() {
			return "Contact [phoneNumbers=" + phoneNumbers + ", name=" + name + ", dob=" + dob + ", email=" + email
					+ "]";
		}



		public List<String> getPhoneNumbers() {
			return phoneNumbers;
		}



		public void setPhoneNumbers(List<String> phoneNumbers) {
			this.phoneNumbers = phoneNumbers;
		}



		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getName() {
			return name;
		}

		public LocalDate getDob() {
			return dob;
		}
		
		
		
		
		
}
