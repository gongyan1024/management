package zl.management.domain;

//参加会议
public class AttendMeeting {
	 private int id;
     private String attendee;   //参会人
     private String subordinateUnit;   //所属单位
     private String teachingResearchSection;   //教研室
     private String conferenceName;   //会议名称
     private String sponsor;   //主办单位
     private String meetingType;   //会议类型
     private String disciplineCategory;   //学科门类
     private String participantAddress;   //参会地址
     private String participantDate;   //参会日期
     private String submitThesis;   //是否提交论文
     private String thesisTitle;   //论文题目
     private String invitedReport;   //是否特邀报告
     private String reportTopic;   //报告题目
     private String auditStatus;   //审核状态
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAttendee() {
		return attendee;
	}
	public void setAttendee(String attendee) {
		this.attendee = attendee;
	}
	public String getSubordinateUnit() {
		return subordinateUnit;
	}
	public void setSubordinateUnit(String subordinateUnit) {
		this.subordinateUnit = subordinateUnit;
	}
	public String getTeachingResearchSection() {
		return teachingResearchSection;
	}
	public void setTeachingResearchSection(String teachingResearchSection) {
		this.teachingResearchSection = teachingResearchSection;
	}
	public String getConferenceName() {
		return conferenceName;
	}
	public void setConferenceName(String conferenceName) {
		this.conferenceName = conferenceName;
	}
	public String getSponsor() {
		return sponsor;
	}
	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
	public String getMeetingType() {
		return meetingType;
	}
	public void setMeetingType(String meetingType) {
		this.meetingType = meetingType;
	}
	public String getDisciplineCategory() {
		return disciplineCategory;
	}
	public void setDisciplineCategory(String disciplineCategory) {
		this.disciplineCategory = disciplineCategory;
	}
	public String getParticipantAddress() {
		return participantAddress;
	}
	public void setParticipantAddress(String participantAddress) {
		this.participantAddress = participantAddress;
	}
	public String getParticipantDate() {
		return participantDate;
	}
	public void setParticipantDate(String participantDate) {
		this.participantDate = participantDate;
	}
	public String getSubmitThesis() {
		return submitThesis;
	}
	public void setSubmitThesis(String submitThesis) {
		this.submitThesis = submitThesis;
	}
	public String getThesisTitle() {
		return thesisTitle;
	}
	public void setThesisTitle(String thesisTitle) {
		this.thesisTitle = thesisTitle;
	}
	public String getInvitedReport() {
		return invitedReport;
	}
	public void setInvitedReport(String invitedReport) {
		this.invitedReport = invitedReport;
	}
	public String getReportTopic() {
		return reportTopic;
	}
	public void setReportTopic(String reportTopic) {
		this.reportTopic = reportTopic;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	@Override
	public String toString() {
		return "AttendMeeting [id=" + id + ", attendee=" + attendee + ", subordinateUnit=" + subordinateUnit
				+ ", teachingResearchSection=" + teachingResearchSection + ", conferenceName=" + conferenceName
				+ ", sponsor=" + sponsor + ", meetingType=" + meetingType + ", disciplineCategory=" + disciplineCategory
				+ ", participantAddress=" + participantAddress + ", participantDate=" + participantDate
				+ ", submitThesis=" + submitThesis + ", thesisTitle=" + thesisTitle + ", invitedReport=" + invitedReport
				+ ", reportTopic=" + reportTopic + ", auditStatus=" + auditStatus + "]";
	}
	
}
