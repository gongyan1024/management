package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.IdentificationResultPathDao;
import zl.management.dao.BaseDao;
import zl.management.domain.filePath.IdentificationResultPath;

public class IdentificationResultPathDaoImp extends BaseDao<IdentificationResultPath> implements IdentificationResultPathDao {

	@Override
	public void add(IdentificationResultPath path) {
		super.add(path);
	}

	@Override
	public void delete(int id) {
		super.delete(IdentificationResultPath.class, id);
	}

	@Override
	public void update(IdentificationResultPath path) {
		super.update(path);
	}

	@Override
	public List<IdentificationResultPath> list(int id) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("dId", id);
		return super.list(IdentificationResultPath.class, params);
	}

	@Override
	public void delete(String path) {
		super.delete(IdentificationResultPath.class,path);
	}

}
