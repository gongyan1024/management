package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.AchievementsPathDao;
import zl.management.dao.BaseDao;
import zl.management.domain.filePath.AchievementsPath;

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
		super.delete(AchievementsPath.class, path);
	}

}
