package com.student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@Column(name="RollNo")
	private int id;
	private String sname;
	private String course;
	private String city;
	private long mobileNo;

	public Student() {
		super();
	}

	public Student(int id, String sname, String course, String city, long mobileNo) {
		super();
		this.id = id;
		this.sname = sname;
		this.course = course;
		this.city = city;
		this.mobileNo = mobileNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getmobileNo() {
		return mobileNo;
	}

	public void setmobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", course=" + course + ", city=" + city + ", mobileNo="
				+ mobileNo + "]";
	}

}
