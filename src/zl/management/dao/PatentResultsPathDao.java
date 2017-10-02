package zl.management.dao;

import java.util.List;

import zl.management.domain.filePath.PatentResultsPath;

public interface PatentResultsPathDao {
	public void add(PatentResultsPath path);	//增
	public void delete(int id);	//删,通过研究人员id删除
	public void delete(String path);	//删,通过研究人员id删除
	public void update(PatentResultsPath path); //改
	public List<PatentResultsPath> list(int id);	//查, 通过研究人员id查找
}
