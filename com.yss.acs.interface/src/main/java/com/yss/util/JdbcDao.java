package com.yss.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.autotest.utils.PathUtil;
import com.yss.conversion.ResultSetConvert;

public class JdbcDao {
	private static Connection conn;
	private static Statement st;
	private static ResultSet rs;
	private ResultSetConvert rsc = new ResultSetConvert();

	// 获取执行数据库操作的一个对象-Statement
	public static Statement getSt() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		// ACS:---jdbc:oracle:thin:@192.168.96.8:1521/localoracle
		String url = "jdbc:oracle:thin:@192.168.102.8:1521/orcl";
		String username = "fundcs";
		String password = "fundcs";
		conn = DriverManager.getConnection(url, username, password);
		st = conn.createStatement();
		return st;
	}

	// 获取需要执行的sql
	public static String getSql(String interfaceMethodName) {
		Properties prop = new Properties();
		InputStream in;
		try {
			in = new BufferedInputStream(new FileInputStream(PathUtil.getPath("/sql.properties")));
			try {
				prop.load(in);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		String sql = prop.getProperty(interfaceMethodName);
		return sql;
	}

	// 执行查询数据库的SQL语句，返回一个结果集（ResultSet）对象
	public ResultSet getRs(String interfaceMethodName) throws ClassNotFoundException, SQLException {
		String sql = JdbcDao.getSql(interfaceMethodName);
		st = JdbcDao.getSt();
		rs = st.executeQuery(sql);
		return rs;
	}

	// 将结果集（ResultSet）对象转换成Map对象
	public Map<String, Object> getDBOneData(String interfaceMethodName) {
		Map<String, Object> map = new HashMap<String, Object>();
		JdbcDao jdbcDao = new JdbcDao();
		try {
			rs = jdbcDao.getRs(interfaceMethodName);
			map = rsc.convertMap(rs);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				conn.close();
				st.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return map;
	}

	// 将结果集（ResultSet）对象转换成List对象
	public List<Map<String, Object>> getDBMoreData(String interfaceMethodName) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		JdbcDao jdbcDao = new JdbcDao();
		try {
			rs = jdbcDao.getRs(interfaceMethodName);
			list = rsc.convertList(rs);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				conn.close();
				st.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public List<String> convertArrayList(String interfaceMethodName) throws SQLException {
		List<String> list = new ArrayList<String>();
		JdbcDao jdbcDao = new JdbcDao();
		try {
			rs = jdbcDao.getRs(interfaceMethodName);
			list = rsc.convertArrayList(rs);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				conn.close();
				st.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	// 用于执行INSERT、UPDATE或DELETE语句以及SQL DDL语句
	public int getUp(String interfaceMethodName) throws ClassNotFoundException, SQLException {
		String sql = JdbcDao.getSql(interfaceMethodName);
		st = JdbcDao.getSt();
		int num = st.executeUpdate(sql);
		st.close();
		conn.close();
		return num;
	}

	// 用于执行返回多个结果集、多个更新计数或二者组合的语句
	public boolean getEt(String interfaceMethodName) throws ClassNotFoundException, SQLException {
		String sql = JdbcDao.getSql(interfaceMethodName);
		st = JdbcDao.getSt();
		boolean flag = st.execute(sql);
		st.close();
		conn.close();
		return flag;
	}

}
