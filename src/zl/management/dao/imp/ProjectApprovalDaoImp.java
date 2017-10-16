package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.ProjectApprovalDao;
import zl.management.dao.BaseDao;
import zl.management.domain.ProjectApproval;
import zl.management.util.Pager;

public class ProjectApprovalDaoImp extends BaseDao<ProjectApproval> implements ProjectApprovalDao {

	@Override
	public void add(ProjectApproval obj) {
		super.add(obj);
	}

	@Override
	public void delete(int id) {
		super.delete(ProjectApproval.class, id);
	}

	@Override
	public void update(ProjectApproval obj) {
		super.update(obj);
	}

	@Override
	public ProjectApproval load(int id) {
		return super.load(ProjectApproval.class, id);
	}

	@Override
	public Pager<ProjectApproval> find(String name) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", name);
		return super.find(ProjectApproval.class, params);
	}
	
	@Override
	public Pager<ProjectApproval> find(Map<String, Object> params) {
		return super.find(ProjectApproval.class, params);
	}

	@Override
	public List<ProjectApproval> list() {
		Map<String, Object> params = new HashMap<String, Object>();
		return super.list(ProjectApproval.class, params);
	}

	@Override
	public int cout(Map<String, Object> params) {
		return super.cout(ProjectApproval.class, params);
	}
}
