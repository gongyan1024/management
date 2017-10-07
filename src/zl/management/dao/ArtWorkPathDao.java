package zl.management.dao;

import java.util.List;

import zl.management.domain.filePath.ArtWorkPath;

public interface ArtWorkPathDao {
	public void add(ArtWorkPath path);	//增
	public void delete(int id);	//删,通过研究人员id删除
	public void delete(String path);	//删,通过研究人员id删除
	public void update(ArtWorkPath path); //改
	public List<ArtWorkPath> list(int id);	//查, 通过研究人员id查找
}
