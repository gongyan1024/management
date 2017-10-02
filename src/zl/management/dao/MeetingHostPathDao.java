package zl.management.dao;

import java.util.List;

import zl.management.domain.filePath.MeetingHostPath;

public interface MeetingHostPathDao {
	public void add(MeetingHostPath mhPath);	//增
	public void delete(int id);	//删,通过研究人员id删除
	public void delete(String path);	//删,通过研究人员id删除
	public void update(MeetingHostPath mhPath); //改
	public List<MeetingHostPath> list(int id);	//查, 通过研究人员id查找
}
