package zl.management.dao;

import java.util.List;

import zl.management.domain.filePath.ThesisPath;

public interface ThesisPathDao {
	public void add(ThesisPath path);	//增
	public void delete(int id);	//删,通过研究人员id删除
	public void delete(String path);	//删,通过研究人员id删除
	public void update(ThesisPath path); //改
	public List<ThesisPath> list(int id);	//查, 通过研究人员id查找
}
