package zl.management.domain;

import java.sql.Date;

//学术讲座
public class AcademicLecture {
	private int id;
	private String lectureName;
	private String subordinateUnit;   //所属单位
	private String teachingAndResearchSection;   //教研室
	private String lectureType;   //讲座类型
	private Date lectureDate;   //讲座日期
	private String lectureLevel;   //讲座级别
	private String lectureAssignment;   //讲座归属
	private String speaker;   //主讲人
	private String speakerUnit;   //主讲人单位
	private String keynoteHolder;   //主讲人职务
	private String titleOfSpeaker;   //主讲人职称
	private String venue;   //讲座地点
	private String auditStatus;   //审核状态
	private int attendanceAtLectures;   //参加讲座人数
	private String relatedDisciplines;   //相关学科
	private String lectureObjects;   //讲座对象
	private String emcee;   //主持人
	private String distinguishedGuest;   //嘉宾
	private String moderatorResume;   //主持人简历
	private String viewSummary;   //观点综述
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLectureName() {
		return lectureName;
	}
	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}
	public String getSubordinateUnit() {
		return subordinateUnit;
	}
	public void setSubordinateUnit(String subordinateUnit) {
		this.subordinateUnit = subordinateUnit;
	}
	public String getTeachingAndResearchSection() {
		return teachingAndResearchSection;
	}
	public void setTeachingAndResearchSection(String teachingAndResearchSection) {
		this.teachingAndResearchSection = teachingAndResearchSection;
	}
	public String getLectureType() {
		return lectureType;
	}
	public void setLectureType(String lectureType) {
		this.lectureType = lectureType;
	}
	public Date getLectureDate() {
		return lectureDate;
	}
	public void setLectureDate(Date lectureDate) {
		this.lectureDate = lectureDate;
	}
	public String getLectureLevel() {
		return lectureLevel;
	}
	public void setLectureLevel(String lectureLevel) {
		this.lectureLevel = lectureLevel;
	}
	public String getLectureAssignment() {
		return lectureAssignment;
	}
	public void setLectureAssignment(String lectureAssignment) {
		this.lectureAssignment = lectureAssignment;
	}
	public String getSpeaker() {
		return speaker;
	}
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}
	public String getSpeakerUnit() {
		return speakerUnit;
	}
	public void setSpeakerUnit(String speakerUnit) {
		this.speakerUnit = speakerUnit;
	}
	public String getKeynoteHolder() {
		return keynoteHolder;
	}
	public void setKeynoteHolder(String keynoteHolder) {
		this.keynoteHolder = keynoteHolder;
	}
	public String getTitleOfSpeaker() {
		return titleOfSpeaker;
	}
	public void setTitleOfSpeaker(String titleOfSpeaker) {
		this.titleOfSpeaker = titleOfSpeaker;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public int getAttendanceAtLectures() {
		return attendanceAtLectures;
	}
	public void setAttendanceAtLectures(int attendanceAtLectures) {
		this.attendanceAtLectures = attendanceAtLectures;
	}
	public String getRelatedDisciplines() {
		return relatedDisciplines;
	}
	public void setRelatedDisciplines(String relatedDisciplines) {
		this.relatedDisciplines = relatedDisciplines;
	}
	public String getLectureObjects() {
		return lectureObjects;
	}
	public void setLectureObjects(String lectureObjects) {
		this.lectureObjects = lectureObjects;
	}
	public String getEmcee() {
		return emcee;
	}
	public void setEmcee(String emcee) {
		this.emcee = emcee;
	}
	public String getDistinguishedGuest() {
		return distinguishedGuest;
	}
	public void setDistinguishedGuest(String distinguishedGuest) {
		this.distinguishedGuest = distinguishedGuest;
	}
	public String getModeratorResume() {
		return moderatorResume;
	}
	public void setModeratorResume(String moderatorResume) {
		this.moderatorResume = moderatorResume;
	}
	public String getViewSummary() {
		return viewSummary;
	}
	public void setViewSummary(String viewSummary) {
		this.viewSummary = viewSummary;
	}
	@Override
	public String toString() {
		return "AcademicLecture [id=" + id + ", lectureName=" + lectureName + ", subordinateUnit=" + subordinateUnit
				+ ", teachingAndResearchSection=" + teachingAndResearchSection + ", lectureType=" + lectureType
				+ ", lectureDate=" + lectureDate + ", lectureLevel=" + lectureLevel + ", lectureAssignment="
				+ lectureAssignment + ", speaker=" + speaker + ", speakerUnit=" + speakerUnit + ", keynoteHolder="
				+ keynoteHolder + ", titleOfSpeaker=" + titleOfSpeaker + ", venue=" + venue + ", auditStatus="
				+ auditStatus + ", attendanceAtLectures=" + attendanceAtLectures + ", relatedDisciplines="
				+ relatedDisciplines + ", lectureObjects=" + lectureObjects + ", emcee=" + emcee + ", distinguishedGuest="
				+ distinguishedGuest + ", moderatorResume=" + moderatorResume + ", viewSummary=" + viewSummary + "]";
	}
}
