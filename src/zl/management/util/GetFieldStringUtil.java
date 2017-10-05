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

	public static void main(String[] args) {
		String str = "论文级别	论文类型	论文题目	第一作者类型	第一作者	所属单位	教研室	所有作者	第一作者职工号	发表/出版时间	论文转载	论文收录	发表刊物/论文集	刊物级别	编辑部地址	学科门类	一级学科	项目来源	发表范围	论文集出版单位	卷号	期号	页码范围	个人执笔数	学校署名	关键字	审核状态	备注	版面	是否为译文	ISSN号	CN号";
		String[] strings = { "论文级别", "论文类型", "论文题目", "第一作者类型", "第一作者", "所属单位", "教研室", "所有作者", "第一作者职工号", "发表/出版时间",
				"论文转载", "论文收录", "发表刊物/论文集", "刊物级别", "编辑部地址", "学科门类", "一级学科", "项目来源", "发表范围", "论文集出版单位", "卷号", "期号",
				"页码范围", "个人执笔数", "学校署名", "关键字", "审核状态", "备注", "版面", "是否为译文", "ISSN号", "CN号" };
		System.out.println(dealTrHtml(strings, Thesis.class));
	}

}
