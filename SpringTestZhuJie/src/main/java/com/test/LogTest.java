package com.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogTest {

	 private static Log logger = LogFactory.getLog(LogTest.class);

	    public static void main(String[] args) {
	        logger.trace("LogTest Called");
	        logger.debug("我是debug信息");
	        logger.info("LogTest Called");
	        logger.warn("我是warn信息");
	        logger.error("我是error信息");
	        logger.fatal("我是fatal信息");
	    }
}
