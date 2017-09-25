package zl.management.domain;

import java.util.Date;
import java.util.List;

public class Thesis {
	private String level;
	private String type;
	private String firstAuthorType;
	private String firstAuthorName;
	private String affiliatedUnits; //所属单位
	private String researchSection;	//教研室
	private List<String> authors; 	//所有作者的名字
	private String firstAuthorId; //第一作者的职工号
	private Date publishTime; //出版时间
	private String reprint;	//论文转载
	private String included; //论文收录
	private String publications; //发表刊物
	private String publicationLevel ;	//刊物级别
	private String editorialOfficeAddress ;	//编辑部地址
	private String disciplineCategory ;	//学科门类
	private String firstDiscipline ;	//第一学科
	private String projectSource;	//项目来源
	private String publicationRange ;	//发表范围
	private String PublicationUnit;	//论文集出版单位
	private String volumeNumber ;	//卷号
	private String issue;	//期号
	private String PageRange; //页码范围
	private String numberOfIndividualWriters; //个人执笔数
	private String schoolSignature; //学校署名
	private String Keyword; //关键字
	private String auditStatus ; //审核状态
	private String remarks; //备注
	private String page; //版面
	private String translation; //是否为译文
	private String ISSNnumber; //ISSN号
	private String CNNumber; //CN号
	private List<String> evidences; //佐证的上传文件路径
}
