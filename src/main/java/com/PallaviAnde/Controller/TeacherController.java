package com.PallaviAnde.Controller;

public class TeacherController {

	private Integer id;
	private String name;
	private String subject;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "TeacherController [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}
	
	
}
