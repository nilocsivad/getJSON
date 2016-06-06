/**
 * 
 */
package com.iamVip.getJSON.logic.api.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

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
	@Transactional(rollbackFor = Exception.class)
	public int insert(T one) {
		try {
			return this.getDBApi().insert(one);
		} catch (Exception e) {
			e.printStackTrace();

			if (TransactionAspectSupport.currentTransactionStatus().isNewTransaction()) {
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			} else {
				throw e;
			}
		}
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#inserts(java.util.List)
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public int inserts(List<T> list) {
		try {
			return this.getDBApi().inserts(list);
		} catch (Exception e) {
			e.printStackTrace();

			if (TransactionAspectSupport.currentTransactionStatus().isNewTransaction()) {
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			} else {
				throw e;
			}
		}
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#deleteByKey(java.lang.Object)
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteByKey(Object primaryKey) {
		try {
			return this.getDBApi().deleteByKey(primaryKey);
		} catch (Exception e) {
			e.printStackTrace();

			if (TransactionAspectSupport.currentTransactionStatus().isNewTransaction()) {
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			} else {
				throw e;
			}
		}
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#deleteEq(java.lang.Object)
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteEq(T param) {
		try {
			return this.getDBApi().deleteEq(param);
		} catch (Exception e) {
			e.printStackTrace();

			if (TransactionAspectSupport.currentTransactionStatus().isNewTransaction()) {
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			} else {
				throw e;
			}
		}
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#updateByKey(java.lang.Object,
	 * java.lang.Object)
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public int updateByKey(Object primaryKey, T param) {
		try {
			return this.getDBApi().updateByKey(primaryKey, param);
		} catch (Exception e) {
			e.printStackTrace();

			if (TransactionAspectSupport.currentTransactionStatus().isNewTransaction()) {
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			} else {
				throw e;
			}
		}
		return 0;
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
