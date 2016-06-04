/**
 * 
 */
package com.iamVip.getJSON.database.access.layout;

import java.util.List;

/**
 * @author Colin
 */
public interface __IDBAPI<T> {

	int insert(T one);

	int inserts(List<T> list);

	int deleteByKey(Object primaryKey);

	/**
	 * 删除多个 String = ${String}
	 */
	int deleteEq(T param);

	int updateByKey(Object primaryKey, T param);

	/**
	 * 查询数目 String LIKE CONCAT( '%', '${String}', '%' )
	 */
	long queryCount(T param);

	/**
	 * 查询数目 String = ${String}
	 */
	long queryCountEq(T param);

	T queryByKey(Object primaryKey);

	/**
	 * 查询单个 String = ${String}
	 */
	T queryEq(T param);

	/**
	 * 查询多个 String LIKE CONCAT( '%', '${String}', '%' )
	 */
	List<T> queryMulti(T param);

	/**
	 * 查询多个 String = ${String}
	 */
	List<T> queryMultiEq(T param);

}
