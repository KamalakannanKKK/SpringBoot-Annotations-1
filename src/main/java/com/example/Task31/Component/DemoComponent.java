package com.example.Task31.Component;

import org.springframework.stereotype.Component;

@Component
public class DemoComponent {

	private int id;
	private String name;
	private String gender;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public DemoComponent(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	public DemoComponent() {
		super();
	}

	@Override
	public String toString() {
		return "DemoComponent [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}

}
