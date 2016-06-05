/**
 * 
 */
package com.iamVip.getJSON.logic.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iamVip.getJSON.database.access.layout.ITokenDBApi;
import com.iamVip.getJSON.database.access.layout.__IDBAPI;
import com.iamVip.getJSON.logic.iapi.ITokenApi;
import com.iamVip.getJSON.logic.model.Token;

/**
 * @author Colin
 */
@Service
public class TokenApiImpl extends __APIDefaultImpl<Token> implements ITokenApi {

	@Autowired
	private ITokenDBApi tokenDBApi;

	/**
	 * 
	 */
	public TokenApiImpl() {
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.api.impl.__APIDefaultImpl#getDBApi()
	 */
	@Override
	protected __IDBAPI<Token> getDBApi() {
		return tokenDBApi;
	}

}
