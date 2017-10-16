package zl.management.domain;

import java.sql.Date;

//主办会议
public class MeetingHost {
	private int id;
	private String meetingName; //会议名称
	private String theme; //会议主题
	private String undertakeDepartment; //承办部门
	private String office; //教研室
	private String disciplines; //学科门类
	private String level1Subject; //一级学科
	private String meetingPlace; //会议地点
	private String meetingType; //会议类型
	private Date startDate; //开始日期
	private Date endDate; //结束日期
	private int publications; //论文数量
	private int numberOfForeignRepresentatives; //国外代表数量
	private int delegates; //代表人数
	private String meetingContact; //会议联系人
	private String telephone; //电话
	private String email; //电邮
	private String formAComprehensiveReport; //是否形成综合报告或建议
	private double meetingFor; //会议经费
	private String sourcesOfFunds; //经费来源
	private String sessionDescription; //会议简介
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMeetingName() {
		return meetingName;
	}
	public void setMeetingName(String meetingName) {
		this.meetingName = meetingName;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getUndertakeDepartment() {
		return undertakeDepartment;
	}
	public void setUndertakeDepartment(String undertakeDepartment) {
		this.undertakeDepartment = undertakeDepartment;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getDisciplines() {
		return disciplines;
	}
	public void setDisciplines(String disciplines) {
		this.disciplines = disciplines;
	}
	public String getLevel1Subject() {
		return level1Subject;
	}
	public void setLevel1Subject(String level1Subject) {
		this.level1Subject = level1Subject;
	}
	public String getMeetingPlace() {
		return meetingPlace;
	}
	public void setMeetingPlace(String meetingPlace) {
		this.meetingPlace = meetingPlace;
	}
	public String getMeetingType() {
		return meetingType;
	}
	public void setMeetingType(String meetingType) {
		this.meetingType = meetingType;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getPublications() {
		return publications;
	}
	public void setPublications(int publications) {
		this.publications = publications;
	}
	public int getNumberOfForeignRepresentatives() {
		return numberOfForeignRepresentatives;
	}
	public void setNumberOfForeignRepresentatives(int numberOfForeignRepresentatives) {
		this.numberOfForeignRepresentatives = numberOfForeignRepresentatives;
	}
	public int getDelegates() {
		return delegates;
	}
	public void setDelegates(int delegates) {
		this.delegates = delegates;
	}
	public String getMeetingContact() {
		return meetingContact;
	}
	public void setMeetingContact(String meetingContact) {
		this.meetingContact = meetingContact;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFormAComprehensiveReport() {
		return formAComprehensiveReport;
	}
	public void setFormAComprehensiveReport(String formAComprehensiveReport) {
		this.formAComprehensiveReport = formAComprehensiveReport;
	}
	public double getMeetingFor() {
		return meetingFor;
	}
	public void setMeetingFor(double meetingFor) {
		this.meetingFor = meetingFor;
	}
	public String getSourcesOfFunds() {
		return sourcesOfFunds;
	}
	public void setSourcesOfFunds(String sourcesOfFunds) {
		this.sourcesOfFunds = sourcesOfFunds;
	}
	public String getSessionDescription() {
		return sessionDescription;
	}
	public void setSessionDescription(String sessionDescription) {
		this.sessionDescription = sessionDescription;
	}
	@Override
	public String toString() {
		return "MeetingHost [id=" + id + ", meetingName=" + meetingName + ", theme=" + theme + ", undertakeDepartment="
				+ undertakeDepartment + ", office=" + office + ", disciplines=" + disciplines + ", level1Subject="
				+ level1Subject + ", meetingPlace=" + meetingPlace + ", meetingType=" + meetingType + ", startDate="
				+ startDate + ", endDate=" + endDate + ", publications=" + publications
				+ ", numberOfForeignRepresentatives=" + numberOfForeignRepresentatives + ", delegates=" + delegates
				+ ", meetingContact=" + meetingContact + ", telephone=" + telephone + ", email=" + email
				+ ", formAComprehensiveReport=" + formAComprehensiveReport + ", meetingFor=" + meetingFor
				+ ", sourcesOfFunds=" + sourcesOfFunds + ", sessionDescription=" + sessionDescription + "]";
	}
	
	
}
