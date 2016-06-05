/**
 * 
 */
package com.iamVip.getJSON.logic.api.impl;

import java.util.List;

import com.iamVip.getJSON.database.access.layout.__IDBAPI;
import com.iamVip.getJSON.logic.iapi.__IAPI;
import com.iamVip.getJSON.rs.ref.PageParam;

/**
 * @author Colin
 * @param <T>
 */
public abstract class __APIDefaultImpl<T> implements __IAPI<T> {

	/**
	 * 
	 */
	public __APIDefaultImpl() {
	}

	protected abstract __IDBAPI<T> getDBApi();

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#insert(java.lang.Object)
	 */
	@Override
	public int insert(T one) {
		return this.getDBApi().insert(one);
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#inserts(java.util.List)
	 */
	@Override
	public int inserts(List<T> list) {
		return this.getDBApi().inserts(list);
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#deleteByKey(java.lang.Object)
	 */
	@Override
	public int deleteByKey(Object primaryKey) {
		return this.getDBApi().deleteByKey(primaryKey);
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#deleteEq(java.lang.Object)
	 */
	@Override
	public int deleteEq(T param) {
		return this.getDBApi().deleteEq(param);
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#updateByKey(java.lang.Object,
	 * java.lang.Object)
	 */
	@Override
	public int updateByKey(Object primaryKey, T param) {
		return this.getDBApi().updateByKey(primaryKey, param);
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#queryCount(java.lang.Object)
	 */
	@Override
	public long queryCount(T param) {
		return this.getDBApi().queryCount(param);
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#queryCountEq(java.lang.Object)
	 */
	@Override
	public long queryCountEq(T param) {
		return this.getDBApi().queryCountEq(param);
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#queryByKey(java.lang.Object)
	 */
	@Override
	public T queryByKey(Object primaryKey) {
		return this.getDBApi().queryByKey(primaryKey);
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#queryEq(java.lang.Object)
	 */
	@Override
	public T queryEq(T param) {
		return this.getDBApi().queryEq(param);
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#queryMulti(java.lang.Object)
	 */
	@Override
	public List<T> queryMulti(T param) {
		return this.getDBApi().queryMulti(param);
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#queryMultiEq(java.lang.Object)
	 */
	@Override
	public List<T> queryMultiEq(T param) {
		return this.getDBApi().queryMultiEq(param);
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.iamVip.getJSON.logic.iapi.__IAPI#queryLimit(com.iamVip.getJSON.logic.
	 * model.PageParam, java.lang.Object)
	 */
	@Override
	public List<T> queryLimit(PageParam page, T param) {

		long count = this.getDBApi().queryCount(param);
		System.out.println(count + "-------------------------------------");

		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.iamVip.getJSON.logic.iapi.__IAPI#queryLimitEq(com.iamVip.getJSON.
	 * logic.model.PageParam, java.lang.Object)
	 */
	@Override
	public List<T> queryLimitEq(PageParam page, T param) {
		// TODO Auto-generated method stub
		return null;
	}

}
