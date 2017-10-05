package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import zl.management.dao.BaseDao;
import zl.management.dao.PatentResultsPathDao;
import zl.management.domain.filePath.PatentResultsPath;
import zl.management.util.MyBatisUtil;

public class PatentResultsPathDaoImp extends BaseDao<PatentResultsPath> implements PatentResultsPathDao {

	@Override
	public void add(PatentResultsPath path) {
		super.add(path);
	}

	@Override
	public void delete(int id) {
		super.delete(PatentResultsPath.class, id);
	}

	@Override
	public void update(PatentResultsPath path) {
		super.update(path);
	}

	@Override
	public List<PatentResultsPath> list(int id) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("dId", id);
		return super.list(PatentResultsPath.class, params);
	}

	@Override
	public void delete(String path) {
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSession();
			session.update(PatentResultsPath.class.getName() + ".deleteByPath", path);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtil.closeSession(session);
		}
	}

}
