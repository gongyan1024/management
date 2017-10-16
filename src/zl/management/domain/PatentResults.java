package zl.management.domain;

import java.sql.Date;

//专利成果
public class PatentResults {
	private int id;
	private String patentName; //专利名称
	private String firstInventorType; //第一发明人类型
	private String firstInventor; //第一发明人
	private String subordinateUnits; //所属单位
	private String office; //教研室
	private String patentInventor; //专利发明人
	private String patentType; //专利类型
	private String patentscope; //专利范围
	private String patentStatus; //专利状态
	private String applicationNumber; //申请号
	private Date applicationDate; //申请日期
	private String openNo; //公开号
	private Date openDate; //公开日期
	private String licenseNo; //授权号
	private Date licenseDate; //授权日期
	private String theSchoolName; //学校署名
	private String auditStatus; //审核状态
	private String remark; //备注
	private String isPositionPatent; //是否为职务专利
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPatentName() {
		return patentName;
	}
	public void setPatentName(String patentName) {
		this.patentName = patentName;
	}
	public String getFirstInventorType() {
		return firstInventorType;
	}
	public void setFirstInventorType(String firstInventorType) {
		this.firstInventorType = firstInventorType;
	}
	public String getFirstInventor() {
		return firstInventor;
	}
	public void setFirstInventor(String firstInventor) {
		this.firstInventor = firstInventor;
	}
	public String getSubordinateUnits() {
		return subordinateUnits;
	}
	public void setSubordinateUnits(String subordinateUnits) {
		this.subordinateUnits = subordinateUnits;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getPatentInventor() {
		return patentInventor;
	}
	public void setPatentInventor(String patentInventor) {
		this.patentInventor = patentInventor;
	}
	public String getPatentType() {
		return patentType;
	}
	public void setPatentType(String patentType) {
		this.patentType = patentType;
	}
	public String getPatentscope() {
		return patentscope;
	}
	public void setPatentscope(String patentscope) {
		this.patentscope = patentscope;
	}
	public String getPatentStatus() {
		return patentStatus;
	}
	public void setPatentStatus(String patentStatus) {
		this.patentStatus = patentStatus;
	}
	public String getApplicationNumber() {
		return applicationNumber;
	}
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	public Date getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}
	public String getOpenNo() {
		return openNo;
	}
	public void setOpenNo(String openNo) {
		this.openNo = openNo;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public String getLicenseNo() {
		return licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	public Date getLicenseDate() {
		return licenseDate;
	}
	public void setLicenseDate(Date licenseDate) {
		this.licenseDate = licenseDate;
	}
	public String getTheSchoolName() {
		return theSchoolName;
	}
	public void setTheSchoolName(String theSchoolName) {
		this.theSchoolName = theSchoolName;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getIsPositionPatent() {
		return isPositionPatent;
	}
	public void setIsPositionPatent(String isPositionPatent) {
		this.isPositionPatent = isPositionPatent;
	}
	@Override
	public String toString() {
		return "PatentResults [id=" + id + ", patentName=" + patentName + ", firstInventorType=" + firstInventorType
				+ ", firstInventor=" + firstInventor + ", subordinateUnits=" + subordinateUnits + ", office=" + office
				+ ", patentInventor=" + patentInventor + ", patentType=" + patentType + ", patentscope=" + patentscope
				+ ", patentStatus=" + patentStatus + ", applicationNumber=" + applicationNumber + ", applicationDate="
				+ applicationDate + ", openNo=" + openNo + ", openDate=" + openDate + ", licenseNo=" + licenseNo
				+ ", licenseDate=" + licenseDate + ", theSchoolName=" + theSchoolName + ", auditStatus=" + auditStatus
				+ ", remark=" + remark + ", isPositionPatent=" + isPositionPatent + "]";
	}
}
