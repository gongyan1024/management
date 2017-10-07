package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.ArtWorkPathDao;
import zl.management.dao.BaseDao;
import zl.management.domain.filePath.ArtWorkPath;

public class ArtWorkPathDaoImp extends BaseDao<ArtWorkPath> implements ArtWorkPathDao {

	@Override
	public void add(ArtWorkPath path) {
		super.add(path);
	}

	@Override
	public void delete(int id) {
		super.delete(ArtWorkPath.class, id);
	}

	@Override
	public void update(ArtWorkPath path) {
		super.update(path);
	}

	@Override
	public List<ArtWorkPath> list(int id) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("dId", id);
		return super.list(ArtWorkPath.class, params);
	}

	@Override
	public void delete(String path) {
		super.delete(ArtWorkPath.class,path);
	}

}
