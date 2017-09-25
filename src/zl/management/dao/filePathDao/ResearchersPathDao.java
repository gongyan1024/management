package zl.management.dao.filePathDao;

import java.util.List;

import zl.management.domain.filePath.ResearchersPath;

public interface ResearchersPathDao {
	public void add(ResearchersPath reaPath);	//增
	public void delete(int id);	//删,通过研究人员id删除
	public void update(ResearchersPath reaPath); //改
	public List<ResearchersPath> list(int id);	//查, 通过研究人员id查找
}
