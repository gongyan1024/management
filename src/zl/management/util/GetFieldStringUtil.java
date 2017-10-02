package zl.management.util;

import java.lang.reflect.Field;

import zl.management.domain.PatentResults;

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

	public static void main(String[] args) {
		String str = "专利名称	第一发明人类型	第一发明人	所属单位	教研室	专利发明人	专利类型	专利范围	专利状态	申请号	申请日期	公开号	公开日期	授权号	授权日期	学校署名	审核状态	备注	是否为职务专利";
		String[] strings = { "专利名称", "第一发明人类型", "第一发明人", "所属单位", "教研室", "专利发明人", "专利类型", "专利范围", "专利状态", "申请号", "申请日期",
				"公开号", "公开日期", "授权号", "授权日期", "学校署名", "审核状态", "备注", "是否为职务专利" };
		System.out.println(dealTrHtml(strings, PatentResults.class));
	}

}
