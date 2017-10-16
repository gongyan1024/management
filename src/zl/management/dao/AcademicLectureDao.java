package zl.management.dao;

import java.util.List;
import java.util.Map;

import zl.management.domain.AcademicLecture;
import zl.management.util.Pager;

public interface AcademicLectureDao {
	public void add(AcademicLecture obj);	//增
	public void delete(int id);	//删
	public void update(AcademicLecture obj); //改
	public AcademicLecture load(int id);	//查,通过ID
	public Pager<AcademicLecture> find(String name);	//查,通过名字
	public Pager<AcademicLecture> find(Map<String, Object> params);	//查,通过名字
	public List<AcademicLecture> list();
	public int cout(Map<String, Object> params);
}
