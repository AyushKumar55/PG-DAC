package core;

import java.io.Serializable;

public class Cricketer implements Serializable{
	
	private static final long serialVersionUID = -834641570619081750L;
	private String name;
	private int age;
	private String email_id;
	private String phone;
	private int rating;

	public String getName() {
		return name;
	}

	public Cricketer(String name, int age, String email_id, String phone, int rating) {
		super();
		this.name = name;
		this.age = age;
		this.email_id = email_id;
		this.phone = phone;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age + ", Email Id: " + email_id + ", Phone No.: " + phone + ", Rating: "
				+ rating;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
