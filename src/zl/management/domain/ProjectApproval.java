package zl.management.domain;

//项目立项
public class ProjectApproval {
	private int id;
	private String entryName;   //项目名称
	private String projectNumber;   //项目编号
	private String personInCharge;   //负责人
	private String staffNumber;   //负责人职工号
	private String subordinateUnit;   //所属单位
	private String projectNature;   //项目性质
	private String projectLevel;   //项目级别
	private String projectMembers;   //项目成员
	private String projectYear;   //项目年度
	private String projectClassification;   //项目分类
    private String projectSubclass;   //项目子类
	private String projectStatus;   //项目状态
	private String isChange;   //是否变更
	private String postponed;   //是否延期
	private String approvalNumber;   //批准号
	private String projectSourceUnit;   //项目来源单位
	private String rank;   //承担单位排名
	private String projectTime;   //立项日期
	private String startTime;   //开始时间
	private String plannedCompletionDate;   //计划完成日期
	private String dateOfEntry;   //结项日期
	private String gradeOfKnot;   //结项等级
	private String actualCompletionTime;   //实际完成时间
	private String formOfAchievement;   //成果形式
	private String subTopic;   //是否为子课题
	private String typeOfContract;   //合同类型
	private String contractFunds;   //合同经费
	private String outlayCardNumber;   //经费卡号
	private String matchingFunds;   //配套经费
	private String matchingCardNumber;   //配套卡号
	private String fileBox;   //所属档案盒
	private String disciplineCategory;   //学科门类
	private String subjectClassification;   //学科分类
	private String projectSource;   //项目来源
	private String researchCategory;   //研究类别
	private String nationalBigEconomy;   //国民经济(大类)
	private String nationalMiddleEconomy;   //国民经济(中类)
	private String formOfCooperation;   //合作形式
	private String socioEconomicGoals;   //社会经济目标
	private String auditStatus;   //审核状态
	private String remarks;   //备注
	private String titleOfPersonInCharge;   //负责人职称号
	private String startStopTime;   //起止时间
	private String arrivalExpenses;   //到账经费
	private String expenditure;   //支出经费
	private String managementFees;   //已提管理费
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEntryName() {
		return entryName;
	}
	public void setEntryName(String entryName) {
		this.entryName = entryName;
	}
	public String getProjectNumber() {
		return projectNumber;
	}
	public void setProjectNumber(String projectNumber) {
		this.projectNumber = projectNumber;
	}
	public String getPersonInCharge() {
		return personInCharge;
	}
	public void setPersonInCharge(String personInCharge) {
		this.personInCharge = personInCharge;
	}
	public String getStaffNumber() {
		return staffNumber;
	}
	public void setStaffNumber(String staffNumber) {
		this.staffNumber = staffNumber;
	}
	public String getSubordinateUnit() {
		return subordinateUnit;
	}
	public void setSubordinateUnit(String subordinateUnit) {
		this.subordinateUnit = subordinateUnit;
	}
	public String getProjectNature() {
		return projectNature;
	}
	public void setProjectNature(String projectNature) {
		this.projectNature = projectNature;
	}
	public String getProjectLevel() {
		return projectLevel;
	}
	public void setProjectLevel(String projectLevel) {
		this.projectLevel = projectLevel;
	}
	public String getProjectMembers() {
		return projectMembers;
	}
	public void setProjectMembers(String projectMembers) {
		this.projectMembers = projectMembers;
	}
	public String getProjectYear() {
		return projectYear;
	}
	public void setProjectYear(String projectYear) {
		this.projectYear = projectYear;
	}
	public String getProjectClassification() {
		return projectClassification;
	}
	public void setProjectClassification(String projectClassification) {
		this.projectClassification = projectClassification;
	}
	public String getProjectSubclass() {
		return projectSubclass;
	}
	public void setProjectSubclass(String projectSubclass) {
		this.projectSubclass = projectSubclass;
	}
	public String getProjectStatus() {
		return projectStatus;
	}
	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}
	public String getIsChange() {
		return isChange;
	}
	public void setIsChange(String change) {
		this.isChange = change;
	}
	public String getPostponed() {
		return postponed;
	}
	public void setPostponed(String postponed) {
		this.postponed = postponed;
	}
	public String getApprovalNumber() {
		return approvalNumber;
	}
	public void setApprovalNumber(String approvalNumber) {
		this.approvalNumber = approvalNumber;
	}
	public String getProjectSourceUnit() {
		return projectSourceUnit;
	}
	public void setProjectSourceUnit(String projectSourceUnit) {
		this.projectSourceUnit = projectSourceUnit;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getProjectTime() {
		return projectTime;
	}
	public void setProjectTime(String projectDate) {
		this.projectTime = projectDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getPlannedCompletionDate() {
		return plannedCompletionDate;
	}
	public void setPlannedCompletionDate(String plannedCompletionDate) {
		this.plannedCompletionDate = plannedCompletionDate;
	}
	public String getDateOfEntry() {
		return dateOfEntry;
	}
	public void setDateOfEntry(String dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}
	public String getGradeOfKnot() {
		return gradeOfKnot;
	}
	public void setGradeOfKnot(String gradeOfKnot) {
		this.gradeOfKnot = gradeOfKnot;
	}
	public String getActualCompletionTime() {
		return actualCompletionTime;
	}
	public void setActualCompletionTime(String actualCompletionTime) {
		this.actualCompletionTime = actualCompletionTime;
	}
	public String getFormOfAchievement() {
		return formOfAchievement;
	}
	public void setFormOfAchievement(String formOfAchievement) {
		this.formOfAchievement = formOfAchievement;
	}
	public String getSubTopic() {
		return subTopic;
	}
	public void setSubTopic(String subTopic) {
		this.subTopic = subTopic;
	}
	public String getTypeOfContract() {
		return typeOfContract;
	}
	public void setTypeOfContract(String typeOfContract) {
		this.typeOfContract = typeOfContract;
	}
	public String getContractFunds() {
		return contractFunds;
	}
	public void setContractFunds(String contractFunds) {
		this.contractFunds = contractFunds;
	}
	public String getOutlayCardNumber() {
		return outlayCardNumber;
	}
	public void setOutlayCardNumber(String outlayCardNumber) {
		this.outlayCardNumber = outlayCardNumber;
	}
	public String getMatchingFunds() {
		return matchingFunds;
	}
	public void setMatchingFunds(String matchingFunds) {
		this.matchingFunds = matchingFunds;
	}
	public String getMatchingCardNumber() {
		return matchingCardNumber;
	}
	public void setMatchingCardNumber(String matchingCardNumber) {
		this.matchingCardNumber = matchingCardNumber;
	}
	public String getFileBox() {
		return fileBox;
	}
	public void setFileBox(String fileBox) {
		this.fileBox = fileBox;
	}
	public String getDisciplineCategory() {
		return disciplineCategory;
	}
	public void setDisciplineCategory(String disciplineCategory) {
		this.disciplineCategory = disciplineCategory;
	}
	public String getSubjectClassification() {
		return subjectClassification;
	}
	public void setSubjectClassification(String subjectClassification) {
		this.subjectClassification = subjectClassification;
	}
	public String getProjectSource() {
		return projectSource;
	}
	public void setProjectSource(String projectSource) {
		this.projectSource = projectSource;
	}
	public String getResearchCategory() {
		return researchCategory;
	}
	public void setResearchCategory(String researchCategory) {
		this.researchCategory = researchCategory;
	}
	public String getNationalBigEconomy() {
		return nationalBigEconomy;
	}
	public void setNationalBigEconomy(String nationalBigEconomy) {
		this.nationalBigEconomy = nationalBigEconomy;
	}
	public String getNationalMiddleEconomy() {
		return nationalMiddleEconomy;
	}
	public void setNationalMiddleEconomy(String nationalMiddleEconomy) {
		this.nationalMiddleEconomy = nationalMiddleEconomy;
	}
	public String getFormOfCooperation() {
		return formOfCooperation;
	}
	public void setFormOfCooperation(String formOfCooperation) {
		this.formOfCooperation = formOfCooperation;
	}
	public String getSocioEconomicGoals() {
		return socioEconomicGoals;
	}
	public void setSocioEconomicGoals(String socioEconomicGoals) {
		this.socioEconomicGoals = socioEconomicGoals;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getTitleOfPersonInCharge() {
		return titleOfPersonInCharge;
	}
	public void setTitleOfPersonInCharge(String titleOfPersonInCharge) {
		this.titleOfPersonInCharge = titleOfPersonInCharge;
	}
	public String getStartStopTime() {
		return startStopTime;
	}
	public void setStartStopTime(String startStopTime) {
		this.startStopTime = startStopTime;
	}
	public String getArrivalExpenses() {
		return arrivalExpenses;
	}
	public void setArrivalExpenses(String arrivalExpenses) {
		this.arrivalExpenses = arrivalExpenses;
	}
	public String getExpenditure() {
		return expenditure;
	}
	public void setExpenditure(String expenditure) {
		this.expenditure = expenditure;
	}
	public String getManagementFees() {
		return managementFees;
	}
	public void setManagementFees(String managementFees) {
		this.managementFees = managementFees;
	}
}
