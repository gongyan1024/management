package zl.management.dao;

import java.util.List;

import zl.management.domain.filePath.ResearchReportPath;

public interface ResearchReportPathDao {
	public void add(ResearchReportPath path);	//增
	public void delete(int id);	//删,通过研究人员id删除
	public void delete(String path);	//删,通过研究人员id删除
	public void update(ResearchReportPath path); //改
	public List<ResearchReportPath> list(int id);	//查, 通过研究人员id查找
}
