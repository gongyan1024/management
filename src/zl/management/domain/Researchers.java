package zl.management.domain;

import java.sql.Date;

//科研人士类
public class Researchers {
	private int id;
	private String name;
    private String englishName;	
    private String staffNumber; //职工号
	private String sex;
	private String birth;
	private String researchUnit;// 科研单位
	private String researchDepartment; //科研教研室
	private String personnelUnits; //人事单位
	private String finalDegree; // 最后学位
	private String finalEducation; // 最后学历
	private String politicalStatus;//政治面貌
	private String title; // 职称
	private Date fixedDate;//定职日期
	private String honoraryTitle; //荣誉称号
	private String disciplines; //学科门类
	private String statistics;	 //是否统计
	private String firstDiscipline;  //一级学科
	private String secDiscipline;  //二级学科
	private String thirdDiscipline;  //三级学科
	private String relatedDisciplines;  //相关学科
	private String researchDirection; // 研究方向
	private String idCard; // 身份证
	private String teacherCategory; // 教师类型
	private String tutorCategory; // 导师类型
	private String isExpert; // 是否为专家
	private Date appointmentDate; // 聘任日期
	private String administrativeDuty; // 行政职务
	private String country;
	private String nation;
	private String address; // 家庭住址
	private String postCode; // 邮政编码
	private String homePhone;
	private String phone;
	private String email;
	private String officePhone;
	private String officeFax;	//办公传真
	private String personWeb;	//个人网站
	private String jobSituation;	//在职状态
	private String firstForeignLanguage;	//第一外语
	private String secForeignLanguage;	//第二外语
	private String firstForeignLanguageLev;	//第一外语程度
	private String secForeignLanguageLev;	//第二外语程度
	private String trainingSituation; //进修情况
	private String academicPartTime; // 学术兼职
	private String academicSpecialty; // 学术特长
	private String approvalStatus; // 审核状态
	
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
	public String getEnglishName() {
		return englishName;
	}
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
	public String getStaffNumber() {
		return staffNumber;
	}
	public void setStaffNumber(String staffNumber) {
		this.staffNumber = staffNumber;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
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
	public String getResearchDepartment() {
		return researchDepartment;
	}
	public void setResearchDepartment(String researchDepartment) {
		this.researchDepartment = researchDepartment;
	}
	public String getPersonnelUnits() {
		return personnelUnits;
	}
	public void setPersonnelUnits(String personnelUnits) {
		this.personnelUnits = personnelUnits;
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
	public String getPoliticalStatus() {
		return politicalStatus;
	}
	public void setPoliticalStatus(String politicalStatus) {
		this.politicalStatus = politicalStatus;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getFixedDate() {
		return fixedDate;
	}
	public void setFixedDate(Date fixedDate) {
		this.fixedDate = fixedDate;
	}
	public String getHonoraryTitle() {
		return honoraryTitle;
	}
	public void setHonoraryTitle(String honoraryTitle) {
		this.honoraryTitle = honoraryTitle;
	}
	public String getDisciplines() {
		return disciplines;
	}
	public void setDisciplines(String disciplines) {
		this.disciplines = disciplines;
	}
	public String getStatistics() {
		return statistics;
	}
	public void setStatistics(String statistics) {
		this.statistics = statistics;
	}
	public String getFirstDiscipline() {
		return firstDiscipline;
	}
	public void setFirstDiscipline(String firstDiscipline) {
		this.firstDiscipline = firstDiscipline;
	}
	public String getSecDiscipline() {
		return secDiscipline;
	}
	public void setSecDiscipline(String secDiscipline) {
		this.secDiscipline = secDiscipline;
	}
	public String getThirdDiscipline() {
		return thirdDiscipline;
	}
	public void setThirdDiscipline(String thirdDiscipline) {
		this.thirdDiscipline = thirdDiscipline;
	}
	public String getRelatedDisciplines() {
		return relatedDisciplines;
	}
	public void setRelatedDisciplines(String relatedDisciplines) {
		this.relatedDisciplines = relatedDisciplines;
	}
	public String getResearchDirection() {
		return researchDirection;
	}
	public void setResearchDirection(String researchDirection) {
		this.researchDirection = researchDirection;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getTeacherCategory() {
		return teacherCategory;
	}
	public void setTeacherCategory(String teacherCategory) {
		this.teacherCategory = teacherCategory;
	}
	public String getTutorCategory() {
		return tutorCategory;
	}
	public void setTutorCategory(String tutorCategory) {
		this.tutorCategory = tutorCategory;
	}
	public String getIsExpert() {
		return isExpert;
	}
	public void setIsExpert(String isExpert) {
		this.isExpert = isExpert;
	}
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
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
	public String getOfficeFax() {
		return officeFax;
	}
	public void setOfficeFax(String officeFax) {
		this.officeFax = officeFax;
	}
	public String getPersonWeb() {
		return personWeb;
	}
	public void setPersonWeb(String personWeb) {
		this.personWeb = personWeb;
	}
	public String getJobSituation() {
		return jobSituation;
	}
	public void setJobSituation(String jobSituation) {
		this.jobSituation = jobSituation;
	}
	public String getFirstForeignLanguage() {
		return firstForeignLanguage;
	}
	public void setFirstForeignLanguage(String firstForeignLanguage) {
		this.firstForeignLanguage = firstForeignLanguage;
	}
	public String getSecForeignLanguage() {
		return secForeignLanguage;
	}
	public void setSecForeignLanguage(String secForeignLanguage) {
		this.secForeignLanguage = secForeignLanguage;
	}
	public String getFirstForeignLanguageLev() {
		return firstForeignLanguageLev;
	}
	public void setFirstForeignLanguageLev(String firstForeignLanguageLev) {
		this.firstForeignLanguageLev = firstForeignLanguageLev;
	}
	public String getSecForeignLanguageLev() {
		return secForeignLanguageLev;
	}
	public void setSecForeignLanguageLev(String secForeignLanguageLev) {
		this.secForeignLanguageLev = secForeignLanguageLev;
	}
	public String getTrainingSituation() {
		return trainingSituation;
	}
	public void setTrainingSituation(String trainingSituation) {
		this.trainingSituation = trainingSituation;
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
	public String getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
}
