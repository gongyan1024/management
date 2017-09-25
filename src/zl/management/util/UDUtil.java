package zl.management.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/*
 * 上传下载工具类
 */
public class UDUtil {

	public static List<String> upload(HttpServletRequest req, HttpServletResponse resp) {
		String message = "上传成功";
		List<String> paths = new ArrayList<String>();

		// 存储路径
		String savePath = req.getServletContext().getRealPath("/WEB-INF/upload");

		// 临时文件保存目录
		String tempPath = req.getServletContext().getRealPath("/WEB-INF/temp");
		File tmpFile = new File(tempPath);
		if (!tmpFile.exists()) {
			tmpFile.mkdir();
		}

		// 1.创建工厂
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setSizeThreshold(1024 * 100);
		factory.setRepository(tmpFile);

		// 2.创建文件上传解析器
		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setHeaderEncoding("utf-8");

		// 设置单个文件限制大小,100M
		upload.setFileSizeMax(1024 * 1024 * 100);
		// 设置总上传文件限制大小为500M
		upload.setFileSizeMax(1024 * 1024 * 100 * 5);

		// 3.用解析器分析上传数据,返回List<FileItem>类
		try {
			List<FileItem> list = upload.parseRequest(req);
			for (FileItem item : list) {
				if (!item.isFormField()) {
					String fileName = item.getName();
					if (fileName == null || fileName.equals("")) {
						return null;
					}

					// 注意,不同浏览器上传的文件名可能不同, 比如:c://a.txt a.txt, 这里只获取文件名
					fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
					// 获取扩展名, 方便对以后上传文件的限制

					@SuppressWarnings("unused")
					String fileExtName = fileName.substring(fileName.lastIndexOf(".") + 1);

					InputStream in = item.getInputStream();
					// 创建唯一标识的文件名
					String saveFilename = makeFileName(fileName);
					// 文件的保存目录
					String realSavePath = makePath(saveFilename, savePath);
					FileOutputStream out = new FileOutputStream(realSavePath + "\\" + saveFilename);
					paths.add(realSavePath + "\\" + saveFilename);
					// 创建缓存区
					byte[] buffer = new byte[1024];
					int len = 0;
					while ((len = in.read(buffer)) > 0) {
						out.write(buffer, 0, len);
					}

					in.close();
					out.close();
				} else {
					return null;
				}
			}
		} catch (FileUploadBase.FileSizeLimitExceededException e) {
			message = "单个文件超出最大值100M";
			e.printStackTrace();
		} catch (FileUploadBase.SizeLimitExceededException e) {
			message = "上传文件的总的大小超出限制的最大值500M！！！";
			e.printStackTrace();
		} catch (Exception e) {
			message = "上传失败";
			e.printStackTrace();
		}

		req.setAttribute("message", message);
		return paths;
	}

	/**
	 * @Title: makePath
	 * @Description: 根据文件名创建文件夹
	 * @param saveFilename
	 * @param savePath
	 * @return
	 * @return: String
	 */
	private static String makePath(String saveFilename, String savePath) {
		int hashCode = saveFilename.hashCode();

		int dir1 = hashCode & 0xf; // 0-15
		int dir2 = hashCode & 0xf0 >> 4; // 0-15

		String dir = savePath + "\\" + dir1 + "\\" + dir2; // upload\2\3
															// upload\3\5
		File file = new File(dir);
		if (!file.exists()) {
			file.mkdirs();
		}

		return dir;
	}

	/**
	 * @Title: makeFileName
	 * @Description: 创建一个唯一标识的文件名
	 * @param fileName
	 * @return
	 * @return: String
	 */
	private static String makeFileName(String fileName) {
		return UUID.randomUUID().toString() + "_" + fileName;
	}

	public static void download(HttpServletRequest req, HttpServletResponse resp) {
		String fileName = req.getParameter("filename");
		try {
			fileName = new String(fileName.getBytes("iso8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		File file = new File(fileName);
		if (!file.exists()) {
			req.setAttribute("message", "你所需要的资源已经删除");
			try {
				req.getRequestDispatcher("WEB-INF/jsp/message.jsp").forward(req, resp);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
			;
		} else {
			String realname = fileName.substring(fileName.indexOf("_") + 1);
			try {
				resp.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(realname, "UTF-8"));
			} catch (UnsupportedEncodingException e1) {
				e1.printStackTrace();
			}
			FileInputStream in = null;
			OutputStream out = null;
			try {
				in = new FileInputStream(fileName);
				out = resp.getOutputStream();
				byte buffer[] = new byte[1024];
				int len = 0;
				while ((len = in.read(buffer)) > 0) {
					out.write(buffer, 0, len);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (in != null)
						in.close();
					if(out != null)
						out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
