package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.AchievementAwardPathDao;
import zl.management.dao.BaseDao;
import zl.management.domain.filePath.AchievementAwardPath;

public class AchievementAwardPathDaoImp extends BaseDao<AchievementAwardPath> implements AchievementAwardPathDao {

	@Override
	public void add(AchievementAwardPath path) {
		super.add(path);
	}

	@Override
	public void delete(int id) {
		super.delete(AchievementAwardPath.class, id);
	}

	@Override
	public void update(AchievementAwardPath path) {
		super.update(path);
	}

	@Override
	public List<AchievementAwardPath> list(int id) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("did", id);
		return super.list(AchievementAwardPath.class, params);
	}

	@Override
	public void delete(String path) {
		super.delete(AchievementAwardPath.class, path);
	}

}
