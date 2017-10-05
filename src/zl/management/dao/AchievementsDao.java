package zl.management.dao;

import java.util.List;
import java.util.Map;

import zl.management.domain.Achievements;
import zl.management.util.Pager;

public interface AchievementsDao {
	public void add(Achievements obj);	//增
	public void delete(int id);	//删
	public void update(Achievements obj); //改
	public Achievements load(int id);	//查,通过ID
	public Pager<Achievements> find(String name);	//查,通过名字
	public Pager<Achievements> find(Map<String, Object> params);	//查,通过名字
	public List<Achievements> list();
}
