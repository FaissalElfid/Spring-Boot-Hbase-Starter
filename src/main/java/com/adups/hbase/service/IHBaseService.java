package com.adups.hbase.service;

import org.apache.hadoop.hbase.Cell;

import java.io.IOException;
import java.util.List;
import java.util.Map;
public interface IHBaseService {

	/**
	 * @param tableName
	 * @param families
	 */
	void createTable(String tableName,String... families) throws IOException;

	/**
	 * @param tableName
	 */
	void deleteTable(String tableName);

	/**
	 * @param rowKey
	 * @param tableName
	 * @param familyColumn
	 * @param columnName
	 * @param value
	 */
	void putRowValue(String tableName,String rowKey,String familyColumn,String columnName,String value);

	/**
	 * @param tableName
	 * @param rowKey
	 * @param familyColumn
	 * @param columnNames
	 * @param values
	 */
	void putRowValueBatch(String tableName, String rowKey, String familyColumn, List<String> columnNames, List<String> values);

	/**
	 * @param tableName
	 * @param rowKey
	 * @param familyColumn
	 * @param columnValues
	 */
	void putRowValueBatch(String tableName, String rowKey, String familyColumn, Map<String,String> columnValues);

	/**
	 * @param tableName
	 * @param regexKey
	 * @return
	 */
	List<Cell> scanRegexRowKey(String tableName, String regexKey);

	/**
	 * @param tableName
	 * @param rowKey
	 */
	void deleteAllColumn(String tableName,String rowKey);

	/**
	 * @param tableName
	 * @param rowKey
	 * @param familyName
	 * @param columnName
	 */
	void deleteColumn(String tableName,String rowKey,String familyName,String columnName);
}
