/**
 * 
 */
package com.iamVip.getJSON.logic.iapi;

import java.util.Map;

import com.iamVip.getJSON.logic.model.Clientele;
import com.iamVip.getJSON.logic.model.Login;

/**
 * @author Colin
 */
public interface IClienteleApi extends __IAPI<Clientele> {

	/**
	 * @param client
	 * @param login
	 * @param refMap
	 * @return
	 */
	int moreClientele(Clientele client, Login login, Map<String, Object> refMap);

}
