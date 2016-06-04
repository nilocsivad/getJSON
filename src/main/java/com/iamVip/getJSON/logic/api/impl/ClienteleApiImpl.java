/**
 * 
 */
package com.iamVip.getJSON.logic.api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iamVip.getJSON.database.access.layout.IClienteleDBApi;
import com.iamVip.getJSON.database.access.layout.__IDBAPI;
import com.iamVip.getJSON.logic.iapi.IClienteleApi;
import com.iamVip.getJSON.logic.model.Clientele;

/**
 * @author Colin
 */
@Service
public class ClienteleApiImpl extends __APIDefaultImpl<Clientele> implements IClienteleApi {

	@Autowired
	private IClienteleDBApi clienteleDBApi;

	/**
	 * 
	 */
	public ClienteleApiImpl() {
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.api.impl.__APIDefaultImpl#getDBApi()
	 */
	@Override
	protected __IDBAPI<Clientele> getDBApi() {
		return clienteleDBApi;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#insert(java.lang.Object)
	 */
	@Override
	public int insert(Clientele one) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#inserts(java.util.List)
	 */
	@Override
	public int inserts(List<Clientele> list) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#deleteByKey(java.lang.Object)
	 */
	@Override
	public int deleteByKey(Object primaryKey) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#deleteEq(java.lang.Object)
	 */
	@Override
	public int deleteEq(Clientele param) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#updateByKey(java.lang.Object,
	 * java.lang.Object)
	 */
	@Override
	public int updateByKey(Object primaryKey, Clientele param) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#queryCount(java.lang.Object)
	 */
	@Override
	public long queryCount(Clientele param) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#queryCountEq(java.lang.Object)
	 */
	@Override
	public long queryCountEq(Clientele param) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#queryByKey(java.lang.Object)
	 */
	@Override
	public Clientele queryByKey(Object primaryKey) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#queryEq(java.lang.Object)
	 */
	@Override
	public Clientele queryEq(Clientele param) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#queryMulti(java.lang.Object)
	 */
	@Override
	public List<Clientele> queryMulti(Clientele param) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.iapi.__IAPI#queryMultiEq(java.lang.Object)
	 */
	@Override
	public List<Clientele> queryMultiEq(Clientele param) {
		// TODO Auto-generated method stub
		return null;
	}

}
