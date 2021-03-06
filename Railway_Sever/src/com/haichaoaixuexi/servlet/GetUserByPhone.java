package com.haichaoaixuexi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.haichaoaixuexi.dao.UserDao;
import com.haichaoaixuexi.dao.impl.UserDaoImpl;
import com.haichaoaixuexi.entity.Users;

/**
 * Servlet implementation class GetUserByPhone
 */
@WebServlet("/GetUserByPhone.do")
public class GetUserByPhone extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/**
		 * 设置编码方式
		 */
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		/**
		 * 获取参数
		 */
		String uphone = request.getParameter("uphone");
		
		PrintWriter out = null;
		/**
		 * 返回值
		 */
		try {
			out = response.getWriter();
			/**
			 * 业务逻辑
			 */
			UserDao udi = new UserDaoImpl();
			Users u = udi.getUserByPhone(uphone);
			if (u!=null) {
				Gson gson = new Gson();
				out.println(gson.toJson(u));
				System.out.println(gson.toJson(u));
			}else {
				out.print("failed");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
