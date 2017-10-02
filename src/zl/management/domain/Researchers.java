package zl.management.domain;

import java.util.List;

//科研人士类
public class Researchers {
	private int id;
	private String name;
	private String sex;
	private String idCard; // 身份证
	private String birth;
	private String researchUnit;// 科研单位
	private String finalDegree; // 最后学位
	private String finalEducation; // 最后学历
	private String title; // 职称
	private String researchDirection; // 研究方向
	private String administrativeDuty; // 行政职务
	private String country;
	private String nation;
	private String address; // 家庭住址
	private String postCode; // 邮政编码
	private String homePhone;
	private String phone;
	private String email;
	private String officePhone;
	private String academicPartTime; // 学术兼职
	private String academicSpecialty; // 学术特长

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void academicPartTime(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getResearchUnit() {
		return researchUnit;
	}

	public void setResearchUnit(String researchUnit) {
		this.researchUnit = researchUnit;
	}

	public String getFinalDegree() {
		return finalDegree;
	}

	public void setFinalDegree(String finalDegree) {
		this.finalDegree = finalDegree;
	}

	public String getFinalEducation() {
		return finalEducation;
	}

	public void setFinalEducation(String finalEducation) {
		this.finalEducation = finalEducation;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getResearchDirection() {
		return researchDirection;
	}

	public void setResearchDirection(String researchDirection) {
		this.researchDirection = researchDirection;
	}

	public String getAdministrativeDuty() {
		return administrativeDuty;
	}

	public void setAdministrativeDuty(String administrativeDuty) {
		this.administrativeDuty = administrativeDuty;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

	public String getAcademicPartTime() {
		return academicPartTime;
	}

	public void setAcademicPartTime(String academicPartTime) {
		this.academicPartTime = academicPartTime;
	}

	public String getAcademicSpecialty() {
		return academicSpecialty;
	}

	public void setAcademicSpecialty(String academicSpecialty) {
		this.academicSpecialty = academicSpecialty;
	}


	public void setName(String name) {
		// TODO 自动生成的方法存根
		this.name = name;
	}
}
