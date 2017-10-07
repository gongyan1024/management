package zl.management.domain;

//鉴定成果
public class IdentificationResult {
	private int id;
	private String outcomeName;   //成果名称
	private String firstAuthorType;   //第一作者类型
	private String firstAuthorName;   //第一作者
	private String subordinateUnit;   //所属单位
	private String researchSection;   //教研室
	private String firstAuthorNumber;   //第一作者职工号
	private String author;   //成果作者
	private String identificationDepartment;   //鉴定部门
	private String identificationDate;   //鉴定日期
	private String expertConclusion;   //鉴定结论
	private String identificationNumber;   //鉴定号
	private String completionForm;   //完成形式
	private String remarks;   //备注
	private String firstDiscipline;   //一级学科
	private String disciplineCategory;   //学科门类
	private String projectSource;   //项目来源
	private String schoolSignature;   //学校署名
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
	public String getResearchSection() {
		return researchSection;
	}
	public void setResearchSection(String researchSection) {
		this.researchSection = researchSection;
	}
	public String getFirstDiscipline() {
		return firstDiscipline;
	}
	public void setFirstDiscipline(String firstDiscipline) {
		this.firstDiscipline = firstDiscipline;
	}
	public String getOutcomeName() {
		return outcomeName;
	}
	public void setOutcomeName(String outcomeName) {
		this.outcomeName = outcomeName;
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
	public String getFirstAuthorNumber() {
		return firstAuthorNumber;
	}
	public void setFirstAuthorNumber(String firstAuthorNumber) {
		this.firstAuthorNumber = firstAuthorNumber;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIdentificationDepartment() {
		return identificationDepartment;
	}
	public void setIdentificationDepartment(String identificationDepartment) {
		this.identificationDepartment = identificationDepartment;
	}
	public String getIdentificationDate() {
		return identificationDate;
	}
	public void setIdentificationDate(String identificationDate) {
		this.identificationDate = identificationDate;
	}
	public String getExpertConclusion() {
		return expertConclusion;
	}
	public void setExpertConclusion(String expertConclusion) {
		this.expertConclusion = expertConclusion;
	}
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public String getCompletionForm() {
		return completionForm;
	}
	public void setCompletionForm(String completionForm) {
		this.completionForm = completionForm;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getDisciplineCategory() {
		return disciplineCategory;
	}
	public void setDisciplineCategory(String disciplineCategory) {
		this.disciplineCategory = disciplineCategory;
	}
	public String getProjectSource() {
		return projectSource;
	}
	public void setProjectSource(String projectSource) {
		this.projectSource = projectSource;
	}
	public String getSchoolSignature() {
		return schoolSignature;
	}
	public void setSchoolSignature(String schoolSignature) {
		this.schoolSignature = schoolSignature;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
}
