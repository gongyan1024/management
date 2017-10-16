package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.BaseDao;
import zl.management.dao.PatentResultsDao;
import zl.management.domain.PatentResults;
import zl.management.util.Pager;

public class PatentResultsDaoImp extends BaseDao<PatentResults> implements PatentResultsDao {

	@Override
	public void add(PatentResults obj) {
		super.add(obj);
	}

	@Override
	public void delete(int id) {
		super.delete(PatentResults.class, id);
	}

	@Override
	public void update(PatentResults obj) {
		super.update(obj);
	}

	@Override
	public PatentResults load(int id) {
		return super.load(PatentResults.class, id);
	}

	@Override
	public Pager<PatentResults> find(String name) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", name);
		return super.find(PatentResults.class, params);
	}
	
	@Override
	public Pager<PatentResults> find(Map<String, Object> params) {
		return super.find(PatentResults.class, params);
	}

	@Override
	public List<PatentResults> list() {
		Map<String, Object> params = new HashMap<String, Object>();
		return super.list(PatentResults.class, params);
	}

	@Override
	public int cout(Map<String, Object> params) {
		return super.cout(PatentResults.class, params);
	}


}
