package zl.management.dao;

import java.util.List;
import java.util.Map;

import zl.management.domain.PatentResults;
import zl.management.util.Pager;

public interface PatentResultsDao {
	public void add(PatentResults obj);	//增
	public void delete(int id);	//删
	public void update(PatentResults obj); //改
	public PatentResults load(int id);	//查,通过ID
	public Pager<PatentResults> find(String name);	//查,通过名字
	public Pager<PatentResults> find(Map<String, Object> params);	//查,通过名字
	public List<PatentResults> list();
}
