package com.haichaoaixuexi.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.google.gson.Gson;
import com.haichaoaixuexi.dao.Eq_checkDao;
import com.haichaoaixuexi.dao.impl.Eq_checkDaoImpl;
import com.haichaoaixuexi.entity.Eq_check;

/**
 * Servlet implementation class Eq_checkForAndroid
 */
@WebServlet("/Eq_checkForAndroid.do")
public class Eq_checkForAndroid extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/**
		 * ���ñ��뷽ʽ
		 */
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		PrintWriter out = null;
		out = response.getWriter();
		Eq_checkDao ecd = new Eq_checkDaoImpl();
		Eq_check ec = null;
		String picpath = "";
		String file = request.getSession().getServletContext().getRealPath("upload");
		System.out.println("file:" + file);
		// �����ļ���������
		DiskFileItemFactory df = new DiskFileItemFactory();
		// ���û����С
		df.setSizeThreshold(4096);
		// �����ϴ��������
		ServletFileUpload su = new ServletFileUpload(df);
		try {
			// �õ����еı�����
			List<FileItem> list = su.parseRequest(request);
			System.out.println("��������" + list.size());

			for (FileItem fileItem : list) {
				if (fileItem.isFormField()) {
					// ������ͨ���ֶ�
					System.out.println(fileItem.getFieldName() + fileItem.getString("utf-8"));
					if ("bean".equals(fileItem.getFieldName())) {
						Gson gson = new Gson();
                        ec = gson.fromJson(fileItem.getString("utf-8"), Eq_check.class);
					}
				} else {
					// �������ͨ���ֶ�
					String picname = fileItem.getName();
					// ��ȡ�ַ���,��ȡ���һ��\��λ��
					int i = file.lastIndexOf("\\");
					// upload\name.jpg
					picpath = file.substring(i + 1, file.length()) + "\\" + picname;
					System.out.println("picname:" + picname);
					//д���ļ�
					fileItem.write(new File(file, picname));
					ec.setGZTP(picname);
				}
			}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			out.println("filewritefailed");
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.println("unknownfailed");
			e.printStackTrace();
		}
		if (ec!=null) {
			ec.setYSR(0);
			if (ecd.save(ec)) {
				out.println("success");
			}else {
				out.println("database error");
			}
		}
		
	}

}
