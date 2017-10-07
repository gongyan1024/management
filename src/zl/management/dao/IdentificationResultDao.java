package zl.management.dao;

import java.util.List;
import java.util.Map;

import zl.management.domain.IdentificationResult;
import zl.management.util.Pager;

public interface IdentificationResultDao {
	public void add(IdentificationResult obj);	//增
	public void delete(int id);	//删
	public void update(IdentificationResult obj); //改
	public IdentificationResult load(int id);	//查,通过ID
	public Pager<IdentificationResult> find(String name);	//查,通过名字
	public Pager<IdentificationResult> find(Map<String, Object> params);	//查,通过名字
	public List<IdentificationResult> list();
}
