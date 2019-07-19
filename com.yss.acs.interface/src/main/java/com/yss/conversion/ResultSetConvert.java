package com.yss.conversion;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 数据库查询结果集转换器
 * 
 * @author Administrator
 *
 */
public class ResultSetConvert {
	public List<Map<String, Object>> convertList(ResultSet rs) throws SQLException {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		ResultSetMetaData md = rs.getMetaData();
		int columnCount = md.getColumnCount();
		while (rs.next()) {
			Map<String, Object> rowData = new HashMap<String, Object>();
			for (int i = 1; i <= columnCount; i++) {
				rowData.put(md.getColumnName(i), rs.getObject(i));
			}
			list.add(rowData);
		}
		return list;
	}

	public Map<String, Object> convertMap(ResultSet rs) throws SQLException {
		Map<String, Object> map = new HashMap<String, Object>();
		ResultSetMetaData md = rs.getMetaData();
		int columnCount = md.getColumnCount();
		while (rs.next()) {
			for (int i = 1; i <= columnCount; i++) {
				map.put(md.getColumnName(i), rs.getObject(i));
			}
		}
		return map;
	}

	public List<String> convertArrayList(ResultSet rs) throws SQLException {
		List<String> list = new ArrayList<String>();
		ResultSetMetaData md = rs.getMetaData();
		int columnCount = md.getColumnCount();
		while (rs.next()) {
			for (int i = 1; i <= columnCount; i++) {
				list.add((String) rs.getObject(i));
			}
		}
		return list;
	}
}