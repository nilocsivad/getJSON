/**
 * 
 */
package com.iamVip.getJSON.logic.api.impl;

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

}
