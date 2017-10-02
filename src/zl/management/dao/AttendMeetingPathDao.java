package zl.management.dao;

import java.util.List;

import zl.management.domain.filePath.AttendMeetingPath;

public interface AttendMeetingPathDao {
	public void add(AttendMeetingPath atmPath);	//增
	public void delete(int id);	//删,通过研究人员id删除
	public void delete(String path);	//删,通过研究人员id删除
	public void update(AttendMeetingPath atmPath); //改
	public List<AttendMeetingPath> list(int id);	//查, 通过研究人员id查找
}
