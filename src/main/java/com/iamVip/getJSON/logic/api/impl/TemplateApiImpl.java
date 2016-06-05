/**
 * 
 */
package com.iamVip.getJSON.logic.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iamVip.getJSON.database.access.layout.ITemplateDBApi;
import com.iamVip.getJSON.database.access.layout.__IDBAPI;
import com.iamVip.getJSON.logic.iapi.ITemplateApi;
import com.iamVip.getJSON.logic.model.Template;

/**
 * @author Colin
 */
@Service
public class TemplateApiImpl extends __APIDefaultImpl<Template> implements ITemplateApi {

	@Autowired
	private ITemplateDBApi templateDBApi;

	/**
	 * 
	 */
	public TemplateApiImpl() {
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.getJSON.logic.api.impl.__APIDefaultImpl#getDBApi()
	 */
	@Override
	protected __IDBAPI<Template> getDBApi() {
		return templateDBApi;
	}

}
