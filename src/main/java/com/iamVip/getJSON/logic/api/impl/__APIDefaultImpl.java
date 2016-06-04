/**
 * 
 */
package com.iamVip.getJSON.logic.api.impl;

import java.util.List;

import com.iamVip.getJSON.database.access.layout.__IDBAPI;
import com.iamVip.getJSON.logic.iapi.__IAPI;
import com.iamVip.getJSON.logic.model.PageParam;

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
