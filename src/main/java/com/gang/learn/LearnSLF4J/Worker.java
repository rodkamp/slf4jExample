package com.gang.learn.LearnSLF4J;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Worker {
	public void init() {
		Logger logger = LoggerFactory.getLogger(Worker.class);
		logger.trace("worker msg trace");
		logger.debug("worker msg degug");
		logger.info("worker msg info");
		logger.warn("worker msg warn");
		logger.error("worker msg error");
	}
}
