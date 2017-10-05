package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import zl.management.dao.BaseDao;
import zl.management.dao.MeetingHostPathDao;
import zl.management.domain.filePath.MeetingHostPath;
import zl.management.util.MyBatisUtil;

public class MeetingHostPathDaoImp extends BaseDao<MeetingHostPath> implements MeetingHostPathDao {

	@Override
	public void add(MeetingHostPath alPath) {
		super.add(alPath);
	}

	@Override
	public void delete(int id) {
		super.delete(MeetingHostPath.class, id);
	}

	@Override
	public void update(MeetingHostPath alPath) {
		super.update(alPath);
	}

	@Override
	public List<MeetingHostPath> list(int id) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("dId", id);
		return super.list(MeetingHostPath.class, params);
	}

	@Override
	public void delete(String path) {
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSession();
			session.update(MeetingHostPath.class.getName() + ".deleteByPath", path);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtil.closeSession(session);
		}
	}

}
