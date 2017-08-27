package com.gang.learn.LearnSLF4J;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Logger logger = LoggerFactory.getLogger(App.class);
		logger.trace("msg trace");
		logger.debug("msg degug");
		logger.info("msg info");
		logger.warn("msg warn");
		logger.error("msg error");

		Worker worker = new Worker();
		worker.init();

	}
}
