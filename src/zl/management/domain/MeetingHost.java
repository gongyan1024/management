package zl.management.domain;
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
	private String startDate; //开始日期
	private String endDate; //结束日期
	private String publications; //论文数量
	private String numberOfForeignRepresentatives; //国外代表数量
	private String delegates; //代表人数
	private String meetingContact; //会议联系人
	private String telephone; //电话
	private String email; //电邮
	private String formAComprehensiveReport; //是否形成综合报告或建议
	private String meetingFor; //会议经费
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
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getPublications() {
		return publications;
	}
	public void setPublications(String publications) {
		this.publications = publications;
	}
	public String getNumberOfForeignRepresentatives() {
		return numberOfForeignRepresentatives;
	}
	public void setNumberOfForeignRepresentatives(String numberOfForeignRepresentatives) {
		this.numberOfForeignRepresentatives = numberOfForeignRepresentatives;
	}
	public String getDelegates() {
		return delegates;
	}
	public void setDelegates(String delegates) {
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
	public String getMeetingFor() {
		return meetingFor;
	}
	public void setMeetingFor(String meetingFor) {
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
