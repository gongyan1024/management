package zl.management.domain;

public class ResearchReport {
	private int id;
	private String remarks;   //备注
	private String reportTopic;   //报告题目
	private String firstAuthorType;   //第一作者类型
	private String firstAuthorName;   //第一作者名称
	private String subordinateUnit;   //所属单位
	private String unitType;   //单位类型
	private String adoptionUnit;   //采纳单位
	private String adoptionTime;   //采纳时间
	private String accepted;   //是否被采纳
	private String cooperativeUnit;   //合作单位
	private String forwardingResults;   //转发成果
	private String disciplineCategory;   //学科门类
	private String firstDiscipline;   //一级学科
	private String projectSource;   //项目来源
	private String researchSection;   //教研室
	private String author;   //所有作者
	private String firstAuthorNumber;   //第一作者职工号
	private String schoolSignature;   //学校署名
	private String wordsNumber;   //字数
	private String auditStatus;   //审核状态
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstAuthorName() {
		return firstAuthorName;
	}
	public void setFirstAuthorName(String firstAuthorName) {
		this.firstAuthorName = firstAuthorName;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getReportTopic() {
		return reportTopic;
	}
	public void setReportTopic(String reportTopic) {
		this.reportTopic = reportTopic;
	}
	public String getFirstAuthorType() {
		return firstAuthorType;
	}
	public void setFirstAuthorType(String firstAuthorType) {
		this.firstAuthorType = firstAuthorType;
	}
	public String getSubordinateUnit() {
		return subordinateUnit;
	}
	public void setSubordinateUnit(String subordinateUnit) {
		this.subordinateUnit = subordinateUnit;
	}
	public String getUnitType() {
		return unitType;
	}
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}
	public String getAdoptionUnit() {
		return adoptionUnit;
	}
	public void setAdoptionUnit(String adoptionUnit) {
		this.adoptionUnit = adoptionUnit;
	}
	public String getAdoptionTime() {
		return adoptionTime;
	}
	public void setAdoptionTime(String adoptionTime) {
		this.adoptionTime = adoptionTime;
	}
	public String getAccepted() {
		return accepted;
	}
	public void setAccepted(String accepted) {
		this.accepted = accepted;
	}
	public String getCooperativeUnit() {
		return cooperativeUnit;
	}
	public void setCooperativeUnit(String cooperativeUnit) {
		this.cooperativeUnit = cooperativeUnit;
	}
	public String getForwardingResults() {
		return forwardingResults;
	}
	public void setForwardingResults(String forwardingResults) {
		this.forwardingResults = forwardingResults;
	}
	public String getDisciplineCategory() {
		return disciplineCategory;
	}
	public void setDisciplineCategory(String disciplineCategory) {
		this.disciplineCategory = disciplineCategory;
	}
	public String getFirstDiscipline() {
		return firstDiscipline;
	}
	public void setFirstDiscipline(String firstDiscipline) {
		this.firstDiscipline = firstDiscipline;
	}
	public String getProjectSource() {
		return projectSource;
	}
	public void setProjectSource(String projectSource) {
		this.projectSource = projectSource;
	}
	public String getResearchSection() {
		return researchSection;
	}
	public void setResearchSection(String researchSection) {
		this.researchSection = researchSection;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getFirstAuthorNumber() {
		return firstAuthorNumber;
	}
	public void setFirstAuthorNumber(String firstAuthorNumber) {
		this.firstAuthorNumber = firstAuthorNumber;
	}
	public String getSchoolSignature() {
		return schoolSignature;
	}
	public void setSchoolSignature(String schoolSignature) {
		this.schoolSignature = schoolSignature;
	}
	public String getWordsNumber() {
		return wordsNumber;
	}
	public void setWordsNumber(String wordsNumber) {
		this.wordsNumber = wordsNumber;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
}
