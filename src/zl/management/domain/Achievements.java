package zl.management.domain;

import java.sql.Date;

//著作成果
public class Achievements {
	private int id;
	private String bookName; //著作名称
	private String firstAuthorType; //第一作者类型
	private String firstAuthor; //第一作者
	private String subordinateUnit; //所属单位
	private String office; //教研室
	private String participatedAuthor; //参编作者
	private String firstAuthorNumber; //第一作者职工号
	private String thePublisher; //出版单位
	private String publicationUnitType; //出版单位类型
	private Date publicationDate; //出版时间
	private String publishedIn; //出版地
	private String booksCategories; //著作类别
	private String disciplines; //学科门类
	private String levelOneSubject; //一级学科
	private String projectSource; //项目来源
	private double wordsNumber; //总字数
	private String foreignLanguage; //是否译成外文电话
	private String schoolName; //学校署名
	private String languages; //语种
	private String isbn;//ISBN号
	private String profile; //简介
	private String auditStatus; //审核状态
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getFirstAuthorType() {
		return firstAuthorType;
	}
	public void setFirstAuthorType(String firstAuthorType) {
		this.firstAuthorType = firstAuthorType;
	}
	public String getFirstAuthor() {
		return firstAuthor;
	}
	public void setFirstAuthor(String firstAuthor) {
		this.firstAuthor = firstAuthor;
	}
	public String getSubordinateUnit() {
		return subordinateUnit;
	}
	public void setSubordinateUnit(String subordinateUnit) {
		this.subordinateUnit = subordinateUnit;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getParticipatedAuthor() {
		return participatedAuthor;
	}
	public void setParticipatedAuthor(String participatedAuthor) {
		this.participatedAuthor = participatedAuthor;
	}
	public String getFirstAuthorNumber() {
		return firstAuthorNumber;
	}
	public void setFirstAuthorNumber(String firstAuthorNumber) {
		this.firstAuthorNumber = firstAuthorNumber;
	}
	public String getThePublisher() {
		return thePublisher;
	}
	public void setThePublisher(String thePublisher) {
		this.thePublisher = thePublisher;
	}
	public String getPublicationUnitType() {
		return publicationUnitType;
	}
	public void setPublicationUnitType(String publicationUnitType) {
		this.publicationUnitType = publicationUnitType;
	}
	public Date getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}
	public String getPublishedIn() {
		return publishedIn;
	}
	public void setPublishedIn(String publishedIn) {
		this.publishedIn = publishedIn;
	}
	public String getBooksCategories() {
		return booksCategories;
	}
	public void setBooksCategories(String booksCategories) {
		this.booksCategories = booksCategories;
	}
	public String getDisciplines() {
		return disciplines;
	}
	public void setDisciplines(String disciplines) {
		this.disciplines = disciplines;
	}
	public String getLevelOneSubject() {
		return levelOneSubject;
	}
	public void setLevelOneSubject(String levelOneSubject) {
		this.levelOneSubject = levelOneSubject;
	}
	public String getProjectSource() {
		return projectSource;
	}
	public void setProjectSource(String projectSource) {
		this.projectSource = projectSource;
	}
	public double getWordsNumber() {
		return wordsNumber;
	}
	public void setWordsNumber(double wordsNumber) {
		this.wordsNumber = wordsNumber;
	}
	public String getForeignLanguage() {
		return foreignLanguage;
	}
	public void setForeignLanguage(String foreignLanguage) {
		this.foreignLanguage = foreignLanguage;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
}
