package inetBankingv1.inetBankingv1;

import org.testng.log4testng.Logger;

public class LoggerExample {
	
	
	public static  Logger logger = Logger.getLogger(LoggerExample.class);
	
	propertyconfigurator.configure("log4j.properties");

	public void testLoggerDebug() {
		logger.debug("Hello.. im in Debug method");
	}

	public void testLoggerInfo() {
		logger.info("Hello.. im in Info method");
	}

	public void testLoggerWarn() {
		logger.warn("Hello.. im in Warn method");
	}

	public void testLoggerError() {
		logger.error("Hello.. im in Error method");
	}

	public void testLoggerFatal() {
		logger.fatal("Hello.. im in Fatal method");
	}

	public static void main(String[] args) {
		LoggerExample example = new LoggerExample();
		example.testLoggerDebug();
		example.testLoggerInfo();
		example.testLoggerWarn();
		example.testLoggerError();
		example.testLoggerFatal();
	}


}
