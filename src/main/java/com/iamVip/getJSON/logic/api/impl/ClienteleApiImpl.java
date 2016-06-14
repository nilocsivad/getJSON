/**
 * 
 */
package com.iamVip.getJSON.logic.api.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.iamVip.getJSON.database.access.layout.IClienteleDBApi;
import com.iamVip.getJSON.database.access.layout.__IDBAPI;
import com.iamVip.getJSON.logic.iapi.IClienteleApi;
import com.iamVip.getJSON.logic.iapi.ILoginApi;
import com.iamVip.getJSON.logic.iapi.ITokenApi;
import com.iamVip.getJSON.logic.model.Clientele;
import com.iamVip.getJSON.logic.model.Login;
import com.iamVip.getJSON.logic.model.Token;
import com.iamVip.getJSON.rs.util.ConfigUtil;
import com.iamVip.getJSON.rs.util.DTUtil;

/**
 * @author Colin
 */
@Service
public class ClienteleApiImpl extends __APIDefaultImpl<Clientele> implements IClienteleApi {

	@Autowired
	private ILoginApi loginApi;
	@Autowired
	private ITokenApi tokenApi;

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
	 * @see
	 * com.iamVip.getJSON.logic.iapi.IClienteleApi#moreClientele(com.iamVip.
	 * getJSON.logic.model.Clientele, com.iamVip.getJSON.logic.model.Login,
	 * java.util.Map)
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public int moreClientele(Clientele client, Login login, Map<String, Object> refMap) {
		try {

			String nowDT = DTUtil.nowDT();

			client.setMaxTemplate(ConfigUtil.getMaxTemplate()); // 拥有JSON模版数量
			client.setStatus(1); // 默认状态 1->normal
			client.setDateTime(nowDT);

			int c = this.insert(client); // 返回是否成功保存(非0即成功)
			if (c > 0) {

				login.password2md5(); // 注册时密码用MD5加密
				login.setClientID(client.getClientID());
				login.setStatus(1); // 默认状态 1->normal
				login.setDateTime(nowDT);
				loginApi.insert(login);

				Token token = Token.newOne(client.getClientID());
				tokenApi.insert(token);

				refMap.put("client", client);
				refMap.put("login", login);
				refMap.put("token", token);
			}
			return c;
		}
		catch (Exception e) {
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		}
		return 0;
	}

}
