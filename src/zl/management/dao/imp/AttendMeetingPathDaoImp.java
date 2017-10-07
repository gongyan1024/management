package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.AttendMeetingPathDao;
import zl.management.dao.BaseDao;
import zl.management.domain.filePath.AttendMeetingPath;

public class AttendMeetingPathDaoImp extends BaseDao<AttendMeetingPath> implements AttendMeetingPathDao {

	@Override
	public void add(AttendMeetingPath atmPath) {
		super.add(atmPath);
	}

	@Override
	public void delete(int id) {
		super.delete(AttendMeetingPath.class, id);
	}

	@Override
	public void update(AttendMeetingPath atmPath) {
		super.update(atmPath);
	}

	@Override
	public List<AttendMeetingPath> list(int id) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("dId", id);
		return super.list(AttendMeetingPath.class, params);
	}

	@Override
	public void delete(String path) {
		super.delete(AttendMeetingPath.class, path);
	}

}
