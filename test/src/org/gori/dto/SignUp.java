package org.gori.dto;

public class SignUp {
	private String id;
	private String password;
	private String email;
	private int age;
	private String name;
	
	
	public SignUp() {
		this("","","","0","");// TODO Auto-generated constructor stub
	}


	public SignUp(String id, String password, String email, String age, String name) {
		this.id=id;
		this.password=password;
		this.email=email;
		this.age=Integer.parseInt(age);
		this.name=name;
	}
	
	public SignUp(String id, String password, String email, int age, String name) {
		this.id=id;
		this.password=password;
		this.email=email;
		this.age=age;
		this.name=name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
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


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "SignUp [id=" + id + ", password=" + password + ", email=" + email + ", age=" + age + ", name=" + name
				+ "]";
	}
	
	
	
	
	
}
