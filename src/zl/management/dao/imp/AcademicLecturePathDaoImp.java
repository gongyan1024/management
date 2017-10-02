package zl.management.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import zl.management.dao.AcademicLecturePathDao;
import zl.management.dao.BaseDao;
import zl.management.domain.filePath.AcademicLecturePath;
import zl.management.domain.filePath.AttendMeetingPath;
import zl.management.util.MyBatisUtil;

public class AcademicLecturePathDaoImp extends BaseDao<AcademicLecturePath> implements AcademicLecturePathDao {

	@Override
	public void add(AcademicLecturePath alPath) {
		super.add(alPath);
	}

	@Override
	public void delete(int id) {
		super.delete(AcademicLecturePath.class, id);
	}

	@Override
	public void update(AcademicLecturePath alPath) {
		super.update(alPath);
	}

	@Override
	public List<AcademicLecturePath> list(int id) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("atmId", id);
		return super.list(AcademicLecturePath.class, params);
	}

	@Override
	public void delete(String path) {
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSession();
			session.update(AcademicLecturePath.class.getName() + ".deleteByPath", path);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtil.closeSession(session);
		}
	}

}
