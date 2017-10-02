package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.BaseDao;
import zl.management.dao.MeetingHostDao;
import zl.management.domain.MeetingHost;
import zl.management.util.Pager;

public class MeetingHostDaoImp extends BaseDao<MeetingHost> implements MeetingHostDao {

	@Override
	public void add(MeetingHost mh) {
		super.add(mh);
	}

	@Override
	public void delete(int id) {
		super.delete(MeetingHost.class, id);
	}

	@Override
	public void update(MeetingHost mh) {
		super.update(mh);
	}

	@Override
	public MeetingHost load(int id) {
		return super.load(MeetingHost.class, id);
	}

	@Override
	public Pager<MeetingHost> find(String name) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", name);
		return super.find(MeetingHost.class, params);
	}
	
	@Override
	public Pager<MeetingHost> find(Map<String, Object> params) {
		return super.find(MeetingHost.class, params);
	}

	@Override
	public List<MeetingHost> list() {
		Map<String, Object> params = new HashMap<String, Object>();
		return super.list(MeetingHost.class, params);
	}


}
