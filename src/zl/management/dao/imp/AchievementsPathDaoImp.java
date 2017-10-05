package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import zl.management.dao.AchievementsPathDao;
import zl.management.dao.BaseDao;
import zl.management.domain.filePath.AchievementsPath;
import zl.management.util.MyBatisUtil;

public class AchievementsPathDaoImp extends BaseDao<AchievementsPath> implements AchievementsPathDao {

	@Override
	public void add(AchievementsPath path) {
		super.add(path);
	}

	@Override
	public void delete(int id) {
		super.delete(AchievementsPath.class, id);
	}

	@Override
	public void update(AchievementsPath path) {
		super.update(path);
	}

	@Override
	public List<AchievementsPath> list(int id) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("dId", id);
		return super.list(AchievementsPath.class, params);
	}

	@Override
	public void delete(String path) {
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSession();
			session.update(AchievementsPath.class.getName() + ".deleteByPath", path);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtil.closeSession(session);
		}
	}

}
