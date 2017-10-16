package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.ResearchReportDao;
import zl.management.dao.BaseDao;
import zl.management.domain.ResearchReport;
import zl.management.util.Pager;

public class ResearchReportDaoImp extends BaseDao<ResearchReport> implements ResearchReportDao {

	@Override
	public void add(ResearchReport obj) {
		super.add(obj);
	}

	@Override
	public void delete(int id) {
		super.delete(ResearchReport.class, id);
	}

	@Override
	public void update(ResearchReport obj) {
		super.update(obj);
	}

	@Override
	public ResearchReport load(int id) {
		return super.load(ResearchReport.class, id);
	}

	@Override
	public Pager<ResearchReport> find(String name) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", name);
		return super.find(ResearchReport.class, params);
	}
	
	@Override
	public Pager<ResearchReport> find(Map<String, Object> params) {
		return super.find(ResearchReport.class, params);
	}

	@Override
	public List<ResearchReport> list() {
		Map<String, Object> params = new HashMap<String, Object>();
		return super.list(ResearchReport.class, params);
	}

	@Override
	public int cout(Map<String, Object> params) {
		return super.cout(ResearchReport.class, params);
	}


}
