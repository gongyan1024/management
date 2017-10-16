package zl.management.domain;

import java.sql.Date;

//成就获奖
public class AchievementAward {
	private int id;
	private String bonusName;   //奖励名称
	private String firstFinishType;   //第一完成类型
	private String firstAdult ;   //第一完成人
	private String outcomeName;   //成果名称
	private String subordinateUnit;   //所属单位
	private String scientificResearchOffice;   //科研室
	private String firstAuthorNumber;   //第一作者职工号
	private String winningAuthor;   //获奖作者
	private int numberOfWinners;   //获奖者人数
	private String issuingAuthority;   //发证机关
	private Date dateOfAward;   //获奖日期
	private String awardLevel;   //获奖级别
	private String awardGrade;   //获奖等级
	private int totalNumberOfParticipants;   //总参加单位数
	private String unitRanking;   //单位排名
	private String awardApprovalnumber;   //奖励批准号
	private String disciplineCategory;   //学科门类
	private String firstClassDiscipline;   //一级学科
	private String projectSource; //项目来源
	private String formOfAchievement;   //成果形式
	private String auditStatus;   //审核状态
	private String remarks;   //备注
	private String rewardCategory;   //奖励类别
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getProjectSource() {
		return projectSource;
	}
	public void setProjectSource(String projectSource) {
		this.projectSource = projectSource;
	}
	public String getBonusName() {
		return bonusName;
	}
	public void setBonusName(String bonusName) {
		this.bonusName = bonusName;
	}
	public String getFirstFinishType() {
		return firstFinishType;
	}
	public void setFirstFinishType(String firstFinishType) {
		this.firstFinishType = firstFinishType;
	}
	public String getFirstAdult() {
		return firstAdult;
	}
	public void setFirstAdult(String firstAdult) {
		this.firstAdult = firstAdult;
	}
	public String getOutcomeName() {
		return outcomeName;
	}
	public void setOutcomeName(String outcomeName) {
		this.outcomeName = outcomeName;
	}
	public String getSubordinateUnit() {
		return subordinateUnit;
	}
	public void setSubordinateUnit(String subordinateUnit) {
		this.subordinateUnit = subordinateUnit;
	}
	public String getScientificResearchOffice() {
		return scientificResearchOffice;
	}
	public void setScientificResearchOffice(String scientificResearchOffice) {
		this.scientificResearchOffice = scientificResearchOffice;
	}
	public String getFirstAuthorNumber() {
		return firstAuthorNumber;
	}
	public void setFirstAuthorNumber(String firstAuthorNumber) {
		this.firstAuthorNumber = firstAuthorNumber;
	}
	public String getWinningAuthor() {
		return winningAuthor;
	}
	public void setWinningAuthor(String winningAuthor) {
		this.winningAuthor = winningAuthor;
	}
	public int getNumberOfWinners() {
		return numberOfWinners;
	}
	public void setNumberOfWinners(int numberOfWinners) {
		this.numberOfWinners = numberOfWinners;
	}
	public String getIssuingAuthority() {
		return issuingAuthority;
	}
	public void setIssuingAuthority(String issuingAuthority) {
		this.issuingAuthority = issuingAuthority;
	}
	public Date getDateOfAward() {
		return dateOfAward;
	}
	public void setDateOfAward(Date dateOfAward) {
		this.dateOfAward = dateOfAward;
	}
	public String getAwardLevel() {
		return awardLevel;
	}
	public void setAwardLevel(String awardLevel) {
		this.awardLevel = awardLevel;
	}
	public String getAwardGrade() {
		return awardGrade;
	}
	public void setAwardGrade(String awardGrade) {
		this.awardGrade = awardGrade;
	}
	public int getTotalNumberOfParticipants() {
		return totalNumberOfParticipants;
	}
	public void setTotalNumberOfParticipants(int totalNumberOfParticipants) {
		this.totalNumberOfParticipants = totalNumberOfParticipants;
	}
	public String getUnitRanking() {
		return unitRanking;
	}
	public void setUnitRanking(String unitRanking) {
		this.unitRanking = unitRanking;
	}
	public String getAwardApprovalnumber() {
		return awardApprovalnumber;
	}
	public void setAwardApprovalnumber(String awardApprovalnumber) {
		this.awardApprovalnumber = awardApprovalnumber;
	}
	public String getDisciplineCategory() {
		return disciplineCategory;
	}
	public void setDisciplineCategory(String disciplineCategory) {
		this.disciplineCategory = disciplineCategory;
	}
	public String getFirstClassDiscipline() {
		return firstClassDiscipline;
	}
	public void setFirstClassDiscipline(String firstClassDiscipline) {
		this.firstClassDiscipline = firstClassDiscipline;
	}
	public String getFormOfAchievement() {
		return formOfAchievement;
	}
	public void setFormOfAchievement(String formOfAchievement) {
		this.formOfAchievement = formOfAchievement;
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
	public String getRewardCategory() {
		return rewardCategory;
	}
	public void setRewardCategory(String rewardCategory) {
		this.rewardCategory = rewardCategory;
	}
}
