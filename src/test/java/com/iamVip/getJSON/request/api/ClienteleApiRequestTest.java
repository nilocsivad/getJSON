/**
 * 
 */
package com.iamVip.getJSON.request.api;

import org.junit.Test;

import com.iamVip.getJSON.request.__RequestTest;

/**
 * @author Colin
 */
public class ClienteleApiRequestTest extends __RequestTest {

	/**
	 * 
	 */
	public ClienteleApiRequestTest() {
		super();
	}

	@Test
	public void queryCount() throws Exception {
		this.executeHttp("/api/clientele/query/count");
	}

	@Test
	public void queryLimit() throws Exception {
		this.executeHttp("/api/clientele/query");
	}


















}
