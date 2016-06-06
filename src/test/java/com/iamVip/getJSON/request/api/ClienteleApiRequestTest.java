/**
 * 
 */
package com.iamVip.getJSON.request.api;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author Colin
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/spring-listen.xml", "classpath:config/spring-servlet.xml" })
public class ClienteleApiRequestTest {

	@Autowired
	private WebApplicationContext wac;

	/**
	 * 
	 */
	public ClienteleApiRequestTest() {
	}

	private MockMvc mvc;

	@Before
	public void init() {
		mvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void queryCount() throws Exception {
		this.executeHttp("/api/clientele/query/count");
	}





















	public void executeHttp(String url) throws Exception {
		this.executeHttp(url, 0);
	}

	public void executeHttp(String url, int type) throws Exception {
		this.executeHttp(url, type, null);
	}

	public void executeHttp(String url, int type, Map<String, String> params) throws Exception {

		MockHttpServletRequestBuilder rb = type == 0 ? MockMvcRequestBuilders.get(url) : MockMvcRequestBuilders.post(url);
		if (params != null && !params.isEmpty()) {
			for (Map.Entry<String, String> item : params.entrySet())
				rb.param(item.getKey(), item.getValue());
		}

		MvcResult result = mvc.perform(rb).andReturn();
		int status = result.getResponse().getStatus();

		this.printOut("Response Status: " + status);
		this.printOut("Response: " + result.getResponse().getContentAsString());
	}

	public void printOut(String txt) {
		System.out.println(txt);
	}

	class LinkedMap<K, V> extends HashMap<K, V> {

		private static final long serialVersionUID = 6807015609143714394L;

		public LinkedMap<K, V> add(K key, V value) {
			this.put(key, value);
			return this;
		}

	}

}
