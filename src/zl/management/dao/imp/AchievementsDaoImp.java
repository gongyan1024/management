package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.AchievementsDao;
import zl.management.dao.BaseDao;
import zl.management.domain.Achievements;
import zl.management.util.Pager;

public class AchievementsDaoImp extends BaseDao<Achievements> implements AchievementsDao {

	@Override
	public void add(Achievements obj) {
		super.add(obj);
	}

	@Override
	public void delete(int id) {
		super.delete(Achievements.class, id);
	}

	@Override
	public void update(Achievements obj) {
		super.update(obj);
	}

	@Override
	public Achievements load(int id) {
		return super.load(Achievements.class, id);
	}

	@Override
	public Pager<Achievements> find(String name) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", name);
		return super.find(Achievements.class, params);
	}
	
	@Override
	public Pager<Achievements> find(Map<String, Object> params) {
		return super.find(Achievements.class, params);
	}

	@Override
	public List<Achievements> list() {
		Map<String, Object> params = new HashMap<String, Object>();
		return super.list(Achievements.class, params);
	}


}
