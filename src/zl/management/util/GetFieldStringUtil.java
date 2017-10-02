package zl.management.util;

import java.lang.reflect.Field;

import zl.management.domain.AcademicLecture;

public class GetFieldStringUtil {
	public static String getInsertString(Class<?> clz) {
		StringBuilder sb = new StringBuilder();
		Field[] field = clz.getDeclaredFields();
		String fieldName = "(";
		for (int i = 0; i < field.length; ++i) {
			fieldName = field[i].getName();
			sb.append(fieldName);
			if (i != field.length - 1)
				sb.append(", ");
		}
		sb.append(")");

		sb.append("values(");
		for (int i = 0; i < field.length; ++i) {
			fieldName = field[i].getName();
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
		String str = "讲座名称	所属单位	教研室	讲座类型	讲座日期	讲座级别	讲座归属	主讲人	主讲人单位	主讲人职务	主讲人职称	讲座地点	审核状态	参加讲座人数	相关学科	讲座对象	主持人	嘉宾	主讲人学术简历	观点综述";
		String[] strings = { "讲座名称", "所属单位", "教研室", "讲座类型", "讲座日期", "讲座级别", "讲座归属", "主讲人", "主讲人单位", "主讲人职务", "主讲人职称",
				"讲座地点", "审核状态", "参加讲座人数", "相关学科", "讲座对象", "主持人", "嘉宾", "主讲人学术简历", "观点综述" };
		System.out.println(dealTrHtml(strings, AcademicLecture.class));
	}

}
