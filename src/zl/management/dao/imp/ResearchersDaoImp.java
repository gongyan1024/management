package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import zl.management.dao.BaseDao;
import zl.management.dao.ResearchersDao;
import zl.management.domain.Researchers;
import zl.management.util.MyBatisUtil;
import zl.management.util.Pager;

public class ResearchersDaoImp extends BaseDao<Researchers> implements ResearchersDao {
	@Override
	public void add(Researchers res) {
		super.add(res);
	}

	@Override
	public void delete(int id) {
		super.delete(Researchers.class, id);
	}

	@Override
	public void update(Researchers res) {
		super.update(res);
	}

	@Override
	public Researchers load(int id) {
		return super.load(Researchers.class, id);
	}

	@Override
	public Pager<Researchers> find(String name) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", name);
		return super.find(Researchers.class, params);
	}
	
	@Override
	public List<Researchers> list() {
		Map<String, Object> params = new HashMap<String, Object>();
		return super.list(Researchers.class, params);
	}

	@Override
	public Pager<Researchers> find(Map<String, Object> params) {
		return super.find(Researchers.class, params);
	}

	@Override
	public Researchers loadByStaffNum(String StaffNum) {
		Researchers res = null;
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSession();
			res = session.selectOne(Researchers.class.getName() + ".loadByStaffNum", StaffNum);
		} finally {
			MyBatisUtil.closeSession(session);
		}

		return res;
	}

	@Override
	public int cout(Map<String, Object> params) {
		return super.cout(Researchers.class, params);
	}
}
