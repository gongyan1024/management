package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.ProjectApprovalPathDao;
import zl.management.dao.BaseDao;
import zl.management.domain.filePath.ProjectApprovalPath;

public class ProjectApprovalPathDaoImp extends BaseDao<ProjectApprovalPath> implements ProjectApprovalPathDao {

	@Override
	public void add(ProjectApprovalPath path) {
		super.add(path);
	}

	@Override
	public void delete(int id) {
		super.delete(ProjectApprovalPath.class, id);
	}

	@Override
	public void update(ProjectApprovalPath path) {
		super.update(path);
	}

	@Override
	public List<ProjectApprovalPath> list(int id) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("dId", id);
		return super.list(ProjectApprovalPath.class, params);
	}

	@Override
	public void delete(String path) {
		super.delete(ProjectApprovalPath.class, path);
	}
}
