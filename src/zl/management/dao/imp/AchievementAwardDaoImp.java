package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.AchievementAwardDao;
import zl.management.dao.BaseDao;
import zl.management.domain.AchievementAward;
import zl.management.util.Pager;

public class AchievementAwardDaoImp extends BaseDao<AchievementAward> implements AchievementAwardDao {

	@Override
	public void add(AchievementAward obj) {
		super.add(obj);
	}

	@Override
	public void delete(int id) {
		super.delete(AchievementAward.class, id);
	}

	@Override
	public void update(AchievementAward obj) {
		super.update(obj);
	}

	@Override
	public AchievementAward load(int id) {
		return super.load(AchievementAward.class, id);
	}

	@Override
	public Pager<AchievementAward> find(String name) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", name);
		return super.find(AchievementAward.class, params);
	}
	
	@Override
	public Pager<AchievementAward> find(Map<String, Object> params) {
		return super.find(AchievementAward.class, params);
	}

	@Override
	public List<AchievementAward> list() {
		Map<String, Object> params = new HashMap<String, Object>();
		return super.list(AchievementAward.class, params);
	}


}
