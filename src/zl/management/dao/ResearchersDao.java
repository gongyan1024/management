package zl.management.dao;

import java.util.List;
import java.util.Map;

import zl.management.domain.Researchers;
import zl.management.util.Pager;

public interface ResearchersDao {
	public void add(Researchers res);	//增
	public void delete(int id);	//删
	public void update(Researchers res); //改
	public Researchers load(int id);	//查,通过ID
	public Pager<Researchers> find(String name);	//查,通过名字
	public Pager<Researchers> find(Map<String, Object> params);	//查,通过名字
	public List<Researchers> list();
}
