package com.vedait.Basics.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {
	@Id
	private int id;
	private String name;
	private int experience;
	private int teachingGrade;
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
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getTeachingGrade() {
		return teachingGrade;
	}
	public void setTeachingGrade(int teachingGrade) {
		this.teachingGrade = teachingGrade;
	}
	public Teacher(int id, String name, int experience, int teachingGrade) {
		super();
		this.id = id;
		this.name = name;
		this.experience = experience;
		this.teachingGrade = teachingGrade;
	}
	

}
