package com.haichaoaixuexi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	private static final String URL="jdbc:mysql://localhost:3306/railwaysystem?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull";
	private static final String USER="root";
	private static final String PASSWORD="123456";
	//��������
	public Connection getConn() {
		// ��������
		Connection conn =null;
		try {
			// 1������������
			
				Class.forName("com.mysql.jdbc.Driver");
				// 2����������
				conn = DriverManager.getConnection(URL,USER,PASSWORD);
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//��ɾ��
	public int executeUpdate(String sql,Object...params){
		int num=0;
		//��������
		Connection conn=  getConn();
		PreparedStatement pstmt=null;
		try {
			//����PreparedStatement����
			pstmt= conn.prepareStatement(sql);
			//��ռλ����ֵ
			if(params!=null){
				for(int i=0;i<params.length;i++){
					pstmt.setObject(i+1, params[i]);
				}
			}			
			//ִ����ɾ�Ĳ���
			num=pstmt.executeUpdate();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				//�رսӿڶ���
				if(pstmt!=null){
					pstmt.close();
				}
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		return num;
	}	
	
	
	//��ѯ
	public ResultSet executeQuery(String sql,Object...params){
		//��������
		Connection conn= getConn();
		ResultSet rst=null;
		try {
			//����preparedStatemet����
			PreparedStatement pstmt= conn.prepareStatement(sql);
			//��ռλ����ֵ
			if(params!=null){
				for(int i=0;i<params.length;i++){
					pstmt.setObject(i+1, params[i]);
				}
			}	
			//ִ�в�ѯ
			rst= pstmt.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rst;
	}	
}
