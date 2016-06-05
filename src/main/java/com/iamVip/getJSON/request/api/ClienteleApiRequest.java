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

import com.iamVip.getJSON.logic.iapi.IClienteleApi;
import com.iamVip.getJSON.logic.model.Clientele;
import com.iamVip.getJSON.request.__Request;
import com.iamVip.getJSON.rs.c.IAPP;

/**
 * @author Colin
 */
@Controller
@RequestMapping(value = { "api/clientele" })
public class ClienteleApiRequest extends __Request implements IAPP {

	@Autowired
	private IClienteleApi clienteleApi;

	/**
	 * 
	 */
	public ClienteleApiRequest() {
	}

	@ResponseBody
	@RequestMapping(value = { "query" })
	public Map<String, Object> queryLimit(HttpServletRequest request, HttpSession session, HttpServletResponse response) throws Exception {
		return super.queryLimit(request, response);
	}

	@ResponseBody
	@RequestMapping(value = { "query/count" })
	public long queryCount(HttpServletRequest request, HttpSession session, HttpServletResponse response) throws Exception {
		clienteleApi.queryLimit(null, null);
		return System.currentTimeMillis();
	}

	@ResponseBody
	@RequestMapping(value = { "more" })
	public Map<String, Object> moreClientele(HttpServletRequest request, HttpSession session, HttpServletResponse response) throws Exception {

		Clientele one = Clientele.testOne();
		int len = clienteleApi.insert(one);

		Map<String, Object> map = new HashMap<String, Object>(3);
		map.put("len", len);
		map.put("one", one);
		return map;
	}

}
