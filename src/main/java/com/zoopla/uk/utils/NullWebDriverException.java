package com.zoopla.uk.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NullWebDriverException extends Exception {
	/**
	 * This class is to throw custom null webDriver exception
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger log = LogManager.getLogger(NullWebDriverException.class);

	public NullWebDriverException(String userMessage) {
		super(userMessage);
		log.error(userMessage);
	}
}
