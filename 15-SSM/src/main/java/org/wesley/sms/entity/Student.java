package org.wesley.sms.entity;

import java.util.Date;

public class Student {

	private Integer id;
	private String name;
	private String account;
	private String password;
	private Date birthday;
	private Boolean gender;
	private String studyNumber;

	public Student() {
		super();
	}

	public Student(Integer id, String name, String account, String password, Date birthday, Boolean gender,
			String studyNumber) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
		this.password = password;
		this.birthday = birthday;
		this.gender = gender;
		this.studyNumber = studyNumber;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", account=" + account + ", password=" + password
				+ ", birthday=" + birthday + ", gender=" + gender + ", studyNumber=" + studyNumber + "]";
	}

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

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public String getStudyNumber() {
		return studyNumber;
	}

	public void setStudyNumber(String studyNumber) {
		this.studyNumber = studyNumber;
	}

}
