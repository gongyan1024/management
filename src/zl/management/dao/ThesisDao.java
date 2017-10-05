package zl.management.dao;

import java.util.List;
import java.util.Map;

import zl.management.domain.Thesis;
import zl.management.util.Pager;

public interface ThesisDao {
	public void add(Thesis obj);	//增
	public void delete(int id);	//删
	public void update(Thesis obj); //改
	public Thesis load(int id);	//查,通过ID
	public Pager<Thesis> find(String name);	//查,通过名字
	public Pager<Thesis> find(Map<String, Object> params);	//查,通过名字
	public List<Thesis> list();
}
