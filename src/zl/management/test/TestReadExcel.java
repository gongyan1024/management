/**   
 * Copyright © 2017 公司名. All rights reserved.
 * 
 * @Title: TestReadExcel.java 
 * @Prject: management
 * @Package: zl.management.test 
 * @Description: TODO
 * @author: zhenlin   
 * @date: 2017年9月25日 下午10:41:43 
 * @version: V1.0   
 */
package zl.management.test;

import static org.junit.Assert.fail;

import java.io.File;
import java.util.List;

import org.junit.Test;

import zl.management.util.ExcelUtil;

/** 
 * @ClassName: TestReadExcel 
 * @Description: TODO
 * @author: zhenlin
 * @date: 2017年9月25日 下午10:41:43  
 */
public class TestReadExcel {
	
	@Test
	public void testRead() {
		String filePath = "D:/a.xlsx";
		File file = new File(filePath);
		List<List<Object>> list = ExcelUtil.readExcel(file);
		System.out.println("list.size = " + list.size());
		for(int i = 0; i < list.size(); ++i) {
			List<Object> row = list.get(i);
			for(int j = 0; j < row.size(); ++j) {
				System.out.print(row.get(j) + " ");
			}
			System.out.println();
		}
		
	}
}
