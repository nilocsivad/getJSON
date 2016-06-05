/**
 * 
 */
package com.iamVip.getJSON.logic.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iamVip.getJSON.database.access.layout.ILoginDBApi;
import com.iamVip.getJSON.database.access.layout.__IDBAPI;
import com.iamVip.getJSON.logic.iapi.ILoginApi;
import com.iamVip.getJSON.logic.model.Login;

/**
 * @author Colin
 */
@Service
public class LoginApiImpl extends __APIDefaultImpl<Login> implements ILoginApi {

	@Autowired
	private ILoginDBApi loginDBApi;

	/**
	 * 
	 */
	public LoginApiImpl() {
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.api.impl.__APIDefaultImpl#getDBApi()
	 */
	@Override
	protected __IDBAPI<Login> getDBApi() {
		return loginDBApi;
	}

}
