package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.AcademicLectureDao;
import zl.management.dao.BaseDao;
import zl.management.domain.AcademicLecture;
import zl.management.util.Pager;

public class AcademicLectureDaoImp extends BaseDao<AcademicLecture> implements AcademicLectureDao {

	@Override
	public void add(AcademicLecture obj) {
		super.add(obj);
	}

	@Override
	public void delete(int id) {
		super.delete(AcademicLecture.class, id);
	}

	@Override
	public void update(AcademicLecture obj) {
		super.update(obj);
	}

	@Override
	public AcademicLecture load(int id) {
		return super.load(AcademicLecture.class, id);
	}

	@Override
	public Pager<AcademicLecture> find(String name) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", name);
		return super.find(AcademicLecture.class, params);
	}
	
	@Override
	public Pager<AcademicLecture> find(Map<String, Object> params) {
		return super.find(AcademicLecture.class, params);
	}

	@Override
	public List<AcademicLecture> list() {
		Map<String, Object> params = new HashMap<String, Object>();
		return super.list(AcademicLecture.class, params);
	}


}
