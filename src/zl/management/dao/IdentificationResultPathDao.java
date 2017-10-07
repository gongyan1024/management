package zl.management.dao;

import java.util.List;

import zl.management.domain.filePath.IdentificationResultPath;

public interface IdentificationResultPathDao {
	public void add(IdentificationResultPath path);	//增
	public void delete(int id);	//删,通过研究人员id删除
	public void delete(String path);	//删,通过研究人员id删除
	public void update(IdentificationResultPath path); //改
	public List<IdentificationResultPath> list(int id);	//查, 通过研究人员id查找
}
