/**
 * 
 */
package com.iamVip.getJSON.request.api;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iamVip.getJSON.logic.iapi.ILoginApi;
import com.iamVip.getJSON.logic.model.Login;
import com.iamVip.getJSON.request.__Request;
import com.iamVip.getJSON.rs.c.IAPP;
import com.iamVip.getJSON.rs.ref.RandomString;
import com.iamVip.getJSON.rs.util.DTUtil;

/**
 * @author Colin
 */
@Controller
@RequestMapping(value = { "api/login" })
public class LoginApiRequest extends __Request implements IAPP {

	@Autowired
	private ILoginApi loginApi;

	/**
	 * 
	 */
	public LoginApiRequest() {
	}

	@ResponseBody
	@RequestMapping(value = { "add" })
	public Map<String, Object> add(HttpServletRequest request, HttpSession session, HttpServletResponse response, Login login) throws Exception {

		login.password2md5(); // 注册时密码用MD5加密
		login.setClientID(10000);
		login.setStatus(1); // 默认状态 1->normal
		login.setDateTime(DTUtil.nowDT());

		int r = loginApi.insert(login);

		login.setLoginName(RandomString.random());
		int r2 = loginApi.insert(login);

		Map<String, Object> map = new HashMap<String, Object>(3);
		map.put(JSON_KEY, r);
		map.put(JSON_RESULT_KEY, r2);
		return map;
	}

}
