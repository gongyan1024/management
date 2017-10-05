package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.ThesisDao;
import zl.management.dao.BaseDao;
import zl.management.domain.Thesis;
import zl.management.util.Pager;

public class ThesisDaoImp extends BaseDao<Thesis> implements ThesisDao {

	@Override
	public void add(Thesis obj) {
		super.add(obj);
	}

	@Override
	public void delete(int id) {
		super.delete(Thesis.class, id);
	}

	@Override
	public void update(Thesis obj) {
		super.update(obj);
	}

	@Override
	public Thesis load(int id) {
		return super.load(Thesis.class, id);
	}

	@Override
	public Pager<Thesis> find(String name) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", name);
		return super.find(Thesis.class, params);
	}
	
	@Override
	public Pager<Thesis> find(Map<String, Object> params) {
		return super.find(Thesis.class, params);
	}

	@Override
	public List<Thesis> list() {
		Map<String, Object> params = new HashMap<String, Object>();
		return super.list(Thesis.class, params);
	}


}
