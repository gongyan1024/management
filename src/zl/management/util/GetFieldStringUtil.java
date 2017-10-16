package zl.management.util;

import java.lang.reflect.Field;

import zl.management.domain.Thesis;

public class GetFieldStringUtil {
	public static String getInsertString(Class<?> clz) {
		StringBuilder sb = new StringBuilder();
		Field[] field = clz.getDeclaredFields();
		String fieldName = "(";
		for (int i = 0; i < field.length; ++i) {
			fieldName = field[i].getName();
			if (fieldName.equals("id"))
				continue;
			sb.append(fieldName);
			if (i != field.length - 1)
				sb.append(", ");
		}
		sb.append(")");

		sb.append("values(");
		for (int i = 0; i < field.length; ++i) {
			fieldName = field[i].getName();
			if (fieldName.equals("id"))
				continue;
			sb.append("#{" + fieldName + "}");
			if (i != field.length - 1)
				sb.append(", ");
		}
		sb.append(")");

		return sb.toString();
	}

	public static String getUpdateString(Class<?> clz) {
		StringBuilder sb = new StringBuilder();
		Field[] field = clz.getDeclaredFields();
		String fieldName = "";
		for (int i = 0; i < field.length; ++i) {
			fieldName = field[i].getName();
			if (fieldName.equals("id"))
				continue;
			sb.append(fieldName);
			sb.append("=#{" + fieldName + "}");
			if (i != field.length - 1)
				sb.append(", ");
		}

		return sb.toString();
	}

	public static String dealExcelField(String str) {
		String res = "";

		String[] names = str.split("	");

		for (int i = 0; i < names.length; ++i) {
			res += "\"" + names[i] + "\"";
			if (i != names.length - 1)
				res += ", ";
		}

		return res;
	}

	public static String dealTrHtml(String[] fieldCn, Class<?> clz) {
		StringBuilder sb = new StringBuilder();

		Field[] fields = clz.getDeclaredFields();

		int index = 0;

		for (int i = 0; i < fields.length; ++i) {
			if (fields[i].getName().equals("id")) {
				continue;
			}
			String str = "<tr><td>" + fieldCn[index] + "</td><td><input type=\"text\" id=\"lg-form\" name=" + "\""
					+ fields[i].getName() + "\"" + " value=" + "\"${requestScope.r." + fields[i].getName() + "}\">"
					+ "</tr>";
			sb.append(str);
			sb.append("\r\n");
			index++;
		}

		return sb.toString();
	}

	public static String dealTheadHtml(Class<?> clz) {
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("\r\n");
		Field[] fields = clz.getDeclaredFields();
		for (int i = 0; i < fields.length; ++i) {
			if (fields[i].getName().equals("id")) {
				continue;
			}
			String str = "<td>" + fields[i].getName() + "</td>";
			sb.append(str);
			sb.append("\r\n");
		}
		sb.append("</tr>");

		return sb.toString();
	}

	public static String dealTbodyHtml(Class<?> clz) {
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("\r\n");
		Field[] fields = clz.getDeclaredFields();
		for (int i = 0; i < fields.length; ++i) {
			if (fields[i].getName().equals("id")) {
				continue;
			}
			String str = "<td>${entry." + fields[i].getName() + "}</td>";
			sb.append(str);
			sb.append("\r\n");
		}
		sb.append("</tr>");

		return sb.toString();
	}
	
	public static String getIfField(Class<?> clz) {
		StringBuilder sb = new StringBuilder();
		Field[] fields = clz.getDeclaredFields();
		for (int i = 0; i < fields.length; ++i) {
			String fieldName = fields[i].getName();
			
			if (fields[i].getName().equals("id")) {
				continue;
			}
			String str = "";
            if(fieldName.contains("Name")) {
            	str = "\n<if test=" + "\"" + fieldName + " != null and " + fieldName +" != \'%%\'" + "\">";
            	str += "\n(" + fieldName + " like #{" + fieldName + "})";
            	str += "\n</if>";
            }else {
            	str = "\n<if test=" + "\"" + fieldName + " != null and " + fieldName +" != \'\'" + "\">";
            	str += "\n(" + fieldName + " = #{" + fieldName + "})";
            	str += "\n</if>";
            }
			sb.append(str);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "项目名称	项目编号	负责人	负责人职工号	所属单位	项目性质	项目级别	项目成员	项目年度	项目分类	项目子类	项目状态	是否变更	是否延期	批准号	项目来源单位	承担单位排名	立项日期	开始时间	计划完成日期	结项日期	结项等级	实际完成时间	成果形式	是否为子课题	合同类型	合同经费	经费卡号	配套经费	配套卡号	所属档案盒	学科门类	学科分类	项目来源	研究类别	国民经济行业（大类）	国民经济行业(中类)	合作形式	社会经济目标	审核状态	备注	负责人职称	起止时间	到帐经费	支出经费	已提管理费";
		String[] strings = { "项目名称", "项目编号", "负责人", "负责人职工号", "所属单位", "项目性质", "项目级别", "项目成员", "项目年度", "项目分类", "项目子类",
				"项目状态", "是否变更", "是否延期", "批准号", "项目来源单位", "承担单位排名", "立项日期", "开始时间", "计划完成日期", "结项日期", "结项等级", "实际完成时间",
				"成果形式", "是否为子课题", "合同类型", "合同经费", "经费卡号", "配套经费", "配套卡号", "所属档案盒", "学科门类", "学科分类", "项目来源", "研究类别",
				"国民经济行业（大类）", "国民经济行业(中类)", "合作形式", "社会经济目标", "审核状态", "备注", "负责人职称", "起止时间", "到帐经费", "支出经费", "已提管理费" };
		System.out.println(getIfField(Thesis.class));
	}

}
