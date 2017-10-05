package zl.management.dao;

import java.util.List;

import zl.management.domain.filePath.AchievementsPath;

public interface AchievementsPathDao {
	public void add(AchievementsPath path);	//增
	public void delete(int id);	//删,通过研究人员id删除
	public void delete(String path);	//删,通过研究人员id删除
	public void update(AchievementsPath path); //改
	public List<AchievementsPath> list(int id);	//查, 通过研究人员id查找
}
