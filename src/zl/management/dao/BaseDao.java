package zl.management.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import zl.management.util.MyBatisUtil;
import zl.management.util.Pager;
import zl.management.util.SystemContext;

public class BaseDao<T> {

	public void add(T t) {
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSession();
			session.insert(t.getClass().getName() + ".add", t);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtil.closeSession(session);
		}
	}

	public void update(T t) {
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSession();
			session.update(t.getClass().getName() + ".update", t);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtil.closeSession(session);
		}
	}

	public void delete(Class<T> clz, int id) {
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSession();
			session.update(clz.getName() + ".delete", id);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtil.closeSession(session);
		}
	}
	
	@SuppressWarnings("unchecked")
	public T load(Class<T> clz, int id) {
		T t = null;
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSession();
			t = (T) session.selectOne(clz.getName() + ".load", id);
		} finally {
			MyBatisUtil.closeSession(session);
		}

		return t;
	}
	
	//通过文件名路径删除
	public void delete(Class<?> clz, String path) {
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSession();
			session.update(clz.getName() + ".deleteByPath", path);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtil.closeSession(session);
		}
	}
	
	public List<T> list(Class<?> clz, Map<String, Object> params) {
		return list(clz.getName() + ".list", params);
	}

	public List<T> list(String sqlId, Map<String, Object> params) {
		List<T> list = null;

		SqlSession session = null;
		try {
			session = MyBatisUtil.createSession();
			list = session.selectList(sqlId, params);
		} finally {
			MyBatisUtil.closeSession(session);
		}

		return list;
	}

	public Pager<T> find(Class<T> clz, Map<String, Object> params) {
		return find(clz.getName() + ".find", params);
	}

	public Pager<T> find(String sqlId, Map<String, Object> params) {
		int pageSize = SystemContext.getPageSize();
		int pageOffset = SystemContext.getPageOffset();
		String order = SystemContext.getOrder();
		String sort = SystemContext.getSort();

		Pager<T> pages = new Pager<T>();
		SqlSession session = null;

		try {
			session = MyBatisUtil.createSession();
			if (params == null)
				params = new HashMap<String, Object>();
			params.put("pageSize", pageSize);
			params.put("pageOffset", pageOffset);
			params.put("order", order);
			params.put("sort", sort);
			List<T> list = session.selectList(sqlId, params);
			pages.setDatas(list);
			pages.setPageOffset(pageOffset);
			pages.setPageSize(pageSize);
		} finally {
			MyBatisUtil.closeSession(session);
		}
		return pages;
	}

	@SuppressWarnings("unchecked")
	public T loadBySqlId(String sqlId, Map<String, Object> params) {
		T t = null;
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSession();
			t = (T) session.selectOne(sqlId, params);
		} finally {
			MyBatisUtil.closeSession(session);
		}

		return t;
	}

	@SuppressWarnings("unchecked")
	public T loadBySqlId(String sqlId, Object param) {
		T t = null;
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSession();
			t = (T) session.selectOne(sqlId, param);
		} finally {
			MyBatisUtil.closeSession(session);
		}

		return t;
	}
	
	public int cout(Class<T> clz, Object params) {
		int cout = 0;
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSession();
			cout =  session.selectOne(clz.getName() + ".find_count", params);
		} finally {
			MyBatisUtil.closeSession(session);
		}
		return cout;
	}
}
