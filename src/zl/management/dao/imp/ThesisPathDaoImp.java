package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.BaseDao;
import zl.management.dao.ThesisPathDao;
import zl.management.domain.filePath.ThesisPath;

public class ThesisPathDaoImp extends BaseDao<ThesisPath> implements ThesisPathDao {

	@Override
	public void add(ThesisPath path) {
		super.add(path);
	}

	@Override
	public void delete(int id) {
		super.delete(ThesisPath.class, id);
	}

	@Override
	public void update(ThesisPath path) {
		super.update(path);
	}

	@Override
	public List<ThesisPath> list(int id) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("dId", id);
		return super.list(ThesisPath.class, params);
	}

	@Override
	public void delete(String path) {
		super.delete(ThesisPath.class, path);
	}

}
