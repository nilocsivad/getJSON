/**
 * 
 */
package com.iamVip.getJSON.logic.iapi;

import java.util.List;

import com.iamVip.getJSON.rs.ref.PageParam;

/**
 * @author Colin
 */
public interface __IAPI<T> {

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

	/**
	 * 分页查询 String LIKE CONCAT( '%', '${String}', '%' )
	 */
	List<T> queryLimit(PageParam page, T param);

	/**
	 * 分页查询 String = ${String}
	 */
	List<T> queryLimitEq(PageParam page, T param);

}
