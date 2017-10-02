package zl.management.dao;

import java.util.List;
import java.util.Map;

import zl.management.domain.AttendMeeting;
import zl.management.domain.Researchers;
import zl.management.util.Pager;

public interface AttendMeetingDao {
	public void add(AttendMeeting atm);	//增
	public void delete(int id);	//删
	public void update(AttendMeeting atm); //改
	public AttendMeeting load(int id);	//查,通过ID
	public Pager<AttendMeeting> find(String name);	//查,通过名字
	public Pager<AttendMeeting> find(Map<String, Object> params);	//查,通过名字
	public List<AttendMeeting> list();
}
