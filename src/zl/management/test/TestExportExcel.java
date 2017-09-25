/**   
 * Copyright © 2017 公司名. All rights reserved.
 * 
 * @Title: TestExportExcel.java 
 * @Prject: management
 * @Package: zl.management.test 
 * @Description: TODO
 * @author: zhenlin   
 * @date: 2017年9月20日 下午9:15:17 
 * @version: V1.0   
 */
package zl.management.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.junit.Test;

import zl.management.dao.DAOFactory;
import zl.management.dao.ResearchersDao;
import zl.management.domain.Researchers;
import zl.management.util.ExcelUtil;
import zl.management.util.Pager;
import zl.management.util.SystemContext;

public class TestExportExcel {
	private static ResearchersDao dao = DAOFactory.getResearchersDao();

	@Test
	public void test() {
		SystemContext.setPageSize(8);
		SystemContext.setPageIndex(1);
		SystemContext.setPageOffset(0);
		Pager<Researchers> page = dao.find(null);
		List<Researchers> list = page.getDatas();
		System.out.println(list.size());
		try {
			FileOutputStream out = new FileOutputStream("E://a.xls");
			String[] headers = { "人员名称", "性别", "	身份证信息", "出生日期", "科研单位", "最后学位", "最后学历", "职称", "研究方向", "行政职务", "国籍",
					"民族", "家庭住址", "邮政编码", "住宅电话", "手机", "EMAIL", "办公电话", "学术兼职", "学术特长", "附件上传" };
			ExcelUtil.exportExcel("科研人员信息一览表", headers, list, out);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
