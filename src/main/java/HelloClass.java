package main.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloClass {

	static {
		System.setProperty("logback.configurationFile", "./src/main/java/logback.xml");
	}
	private static final Logger logger = LoggerFactory.getLogger(HelloClass.class);

	public static void main(String[] args) {

		logger.info("Hello Info");
		logger.debug("Hello Debug");
		logger.error("Hello Error");

	}
}
