package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.AttendMeetingDao;
import zl.management.dao.BaseDao;
import zl.management.domain.AttendMeeting;
import zl.management.util.Pager;

public class AttendMeetingDaoImp extends BaseDao<AttendMeeting> implements AttendMeetingDao {
	@Override
	public void add(AttendMeeting atm) {
		super.add(atm);
	}

	@Override
	public void delete(int id) {
		super.delete(AttendMeeting.class, id);
	}

	@Override
	public void update(AttendMeeting atm) {
		super.update(atm);
	}

	@Override
	public AttendMeeting load(int id) {
		return super.load(AttendMeeting.class, id);
	}

	@Override
	public Pager<AttendMeeting> find(String name) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", name);
		return super.find(AttendMeeting.class, params);
	}
	
	@Override
	public List<AttendMeeting> list() {
		Map<String, Object> params = new HashMap<String, Object>();
		return super.list(AttendMeeting.class, params);
	}

	@Override
	public Pager<AttendMeeting> find(Map<String, Object> params) {
		return super.find(AttendMeeting.class, params);
	}

	@Override
	public int cout(Map<String, Object> params) {
		return super.cout(AttendMeeting.class, params);
	}

}
