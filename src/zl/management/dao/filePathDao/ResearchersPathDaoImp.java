package zl.management.dao.filePathDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.BaseDao;
import zl.management.domain.filePath.ResearchersPath;

public class ResearchersPathDaoImp extends BaseDao<ResearchersPath> implements ResearchersPathDao {

	@Override
	public void add(ResearchersPath reaPath) {
		super.add(reaPath);
	}

	@Override
	public void delete(int id) {
		super.delete(ResearchersPath.class, id);
	}

	@Override
	public void update(ResearchersPath reaPath) {
		super.update(reaPath);
	}

	@Override
	public List<ResearchersPath> list(int id) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("reaId", id);
		return super.list(ResearchersPath.class, params);
	}

}
