package zl.management.dao;

import java.util.List;
import java.util.Map;

import zl.management.domain.AchievementAward;
import zl.management.util.Pager;

public interface AchievementAwardDao {
	public void add(AchievementAward obj);	//增
	public void delete(int id);	//删
	public void update(AchievementAward obj); //改
	public AchievementAward load(int id);	//查,通过ID
	public Pager<AchievementAward> find(String name);	//查,通过名字
	public Pager<AchievementAward> find(Map<String, Object> params);	//查,通过名字
	public List<AchievementAward> list();
	public int cout(Map<String, Object> params);
}
