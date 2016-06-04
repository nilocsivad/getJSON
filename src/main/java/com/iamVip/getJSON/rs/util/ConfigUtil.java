/**
 * 
 */
package com.iamVip.getJSON.rs.util;

/**
 * @author Colin
 */
public class ConfigUtil {

	private static String MESSAGE;
	private static String DEFAULTURL;
	private static String FORWARDURL;

	/**
	 * Keep in mind that to make this work out of the box your code must be
	 * compiled with the debug flag enabled so that Spring can look up the
	 * parameter name from the constructor. If you can’t compile your code with
	 * debug flag (or don’t want to) you can use @ConstructorProperties JDK
	 * annotation to explicitly name your constructor arguments.
	 */
	// @ConstructorProperties({...})
	public ConfigUtil(String message, String defaultURL, String forwardURL) {
		MESSAGE = message;
		DEFAULTURL = defaultURL;
		FORWARDURL = forwardURL;
	}

	/**
	 * @return the message
	 */
	public static String getMessage() {
		return MESSAGE;
	}

	/**
	 * @return the defaultURL
	 */
	public static String getDefaultURL() {
		return DEFAULTURL;
	}

	/**
	 * @return the forwardURL
	 */
	public static String getForwardURL() {
		return FORWARDURL;
	}

}
