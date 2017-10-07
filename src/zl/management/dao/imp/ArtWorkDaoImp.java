package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.ArtWorkDao;
import zl.management.dao.BaseDao;
import zl.management.domain.ArtWork;
import zl.management.util.Pager;

public class ArtWorkDaoImp extends BaseDao<ArtWork> implements ArtWorkDao {

	@Override
	public void add(ArtWork obj) {
		super.add(obj);
	}

	@Override
	public void delete(int id) {
		super.delete(ArtWork.class, id);
	}

	@Override
	public void update(ArtWork obj) {
		super.update(obj);
	}

	@Override
	public ArtWork load(int id) {
		return super.load(ArtWork.class, id);
	}

	@Override
	public Pager<ArtWork> find(String name) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", name);
		return super.find(ArtWork.class, params);
	}
	
	@Override
	public Pager<ArtWork> find(Map<String, Object> params) {
		return super.find(ArtWork.class, params);
	}

	@Override
	public List<ArtWork> list() {
		Map<String, Object> params = new HashMap<String, Object>();
		return super.list(ArtWork.class, params);
	}


}
