package zl.management.dao;

import java.util.List;

import zl.management.domain.filePath.AcademicLecturePath;

public interface AcademicLecturePathDao {
	public void add(AcademicLecturePath alPath);	//增
	public void delete(int id);	//删,通过研究人员id删除
	public void delete(String path);	//删,通过研究人员id删除
	public void update(AcademicLecturePath alPath); //改
	public List<AcademicLecturePath> list(int id);	//查, 通过研究人员id查找
}
