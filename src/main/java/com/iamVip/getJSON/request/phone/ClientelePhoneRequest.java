/**
 * 
 */
package com.iamVip.getJSON.request.phone;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iamVip.getJSON.request.__Request;
import com.iamVip.getJSON.rs.c.IAPP;

/**
 * @author Colin
 */
@Controller
@RequestMapping(value = { "phone/clientele" })
public class ClientelePhoneRequest extends __Request implements IAPP {

	/**
	 * 
	 */
	public ClientelePhoneRequest() {
	}

	@ResponseBody
	@RequestMapping(value = { "query" })
	public Map<String, Object> queryLimit(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return super.queryLimit(request, response);
	}

}
