package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.AcademicLecturePathDao;
import zl.management.dao.BaseDao;
import zl.management.domain.filePath.AcademicLecturePath;

public class AcademicLecturePathDaoImp extends BaseDao<AcademicLecturePath> implements AcademicLecturePathDao {

	@Override
	public void add(AcademicLecturePath path) {
		super.add(path);
	}

	@Override
	public void delete(int id) {
		super.delete(AcademicLecturePath.class, id);
	}

	@Override
	public void update(AcademicLecturePath path) {
		super.update(path);
	}

	@Override
	public List<AcademicLecturePath> list(int id) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("dId", id);
		return super.list(AcademicLecturePath.class, params);
	}

	@Override
	public void delete(String path) {
		super.delete(path);
	}

}
