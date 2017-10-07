package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.BaseDao;
import zl.management.dao.PatentResultsPathDao;
import zl.management.domain.filePath.PatentResultsPath;

public class PatentResultsPathDaoImp extends BaseDao<PatentResultsPath> implements PatentResultsPathDao {

	@Override
	public void add(PatentResultsPath path) {
		super.add(path);
	}

	@Override
	public void delete(int id) {
		super.delete(PatentResultsPath.class, id);
	}

	@Override
	public void update(PatentResultsPath path) {
		super.update(path);
	}

	@Override
	public List<PatentResultsPath> list(int id) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("dId", id);
		return super.list(PatentResultsPath.class, params);
	}

	@Override
	public void delete(String path) {
		super.delete(PatentResultsPath.class, path);
	}

}
