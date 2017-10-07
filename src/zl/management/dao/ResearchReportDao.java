package zl.management.dao;

import java.util.List;
import java.util.Map;

import zl.management.domain.ResearchReport;
import zl.management.util.Pager;

public interface ResearchReportDao {
	public void add(ResearchReport obj);	//增
	public void delete(int id);	//删
	public void update(ResearchReport obj); //改
	public ResearchReport load(int id);	//查,通过ID
	public Pager<ResearchReport> find(String name);	//查,通过名字
	public Pager<ResearchReport> find(Map<String, Object> params);	//查,通过名字
	public List<ResearchReport> list();
}
