package zl.management.dao;

import java.util.List;
import java.util.Map;

import zl.management.domain.ProjectApproval;
import zl.management.util.Pager;

public interface ProjectApprovalDao {
	public void add(ProjectApproval obj);	//增
	public void delete(int id);	//删
	public void update(ProjectApproval obj); //改
	public ProjectApproval load(int id);	//查,通过ID
	public Pager<ProjectApproval> find(String name);	//查,通过名字
	public Pager<ProjectApproval> find(Map<String, Object> params);	//查,通过名字
	public List<ProjectApproval> list();
}
