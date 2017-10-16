package zl.management.dao;

import java.util.List;
import java.util.Map;

import zl.management.domain.MeetingHost;
import zl.management.util.Pager;

public interface MeetingHostDao {
	public void add(MeetingHost mh);	//增
	public void delete(int id);	//删
	public void update(MeetingHost mh); //改
	public MeetingHost load(int id);	//查,通过ID
	public Pager<MeetingHost> find(String name);	//查,通过名字
	public Pager<MeetingHost> find(Map<String, Object> params);	//查,通过名字
	public List<MeetingHost> list();
	public int cout(Map<String, Object> params);
}
