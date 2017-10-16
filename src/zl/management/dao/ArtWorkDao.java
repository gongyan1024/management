package zl.management.dao;

import java.util.List;
import java.util.Map;

import zl.management.domain.ArtWork;
import zl.management.util.Pager;

public interface ArtWorkDao {
	public void add(ArtWork obj);	//增
	public void delete(int id);	//删
	public void update(ArtWork obj); //改
	public ArtWork load(int id);	//查,通过ID
	public Pager<ArtWork> find(String name);	//查,通过名字
	public Pager<ArtWork> find(Map<String, Object> params);	//查,通过名字
	public List<ArtWork> list();
	public int cout(Map<String, Object> params);
}
