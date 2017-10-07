package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.IdentificationResultDao;
import zl.management.dao.BaseDao;
import zl.management.domain.IdentificationResult;
import zl.management.util.Pager;

public class IdentificationResultDaoImp extends BaseDao<IdentificationResult> implements IdentificationResultDao {

	@Override
	public void add(IdentificationResult obj) {
		super.add(obj);
	}

	@Override
	public void delete(int id) {
		super.delete(IdentificationResult.class, id);
	}

	@Override
	public void update(IdentificationResult obj) {
		super.update(obj);
	}

	@Override
	public IdentificationResult load(int id) {
		return super.load(IdentificationResult.class, id);
	}

	@Override
	public Pager<IdentificationResult> find(String name) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", name);
		return super.find(IdentificationResult.class, params);
	}
	
	@Override
	public Pager<IdentificationResult> find(Map<String, Object> params) {
		return super.find(IdentificationResult.class, params);
	}

	@Override
	public List<IdentificationResult> list() {
		Map<String, Object> params = new HashMap<String, Object>();
		return super.list(IdentificationResult.class, params);
	}


}
