package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.ResearchReportPathDao;
import zl.management.dao.BaseDao;
import zl.management.domain.filePath.ResearchReportPath;

public class ResearchReportPathDaoImp extends BaseDao<ResearchReportPath> implements ResearchReportPathDao {

	@Override
	public void add(ResearchReportPath path) {
		super.add(path);
	}

	@Override
	public void delete(int id) {
		super.delete(ResearchReportPath.class, id);
	}

	@Override
	public void update(ResearchReportPath path) {
		super.update(path);
	}

	@Override
	public List<ResearchReportPath> list(int id) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("dId", id);
		return super.list(ResearchReportPath.class, params);
	}

	@Override
	public void delete(String path) {
		super.delete(ResearchReportPath.class,path);
	}

}
