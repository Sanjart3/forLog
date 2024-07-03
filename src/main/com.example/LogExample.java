package com.example;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LogExample {

    private static final Logger logger = LogManager.getLogger(LogExample.class);

    public static void main(String[] args) {
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
        logger.log(Level.DEBUG, "Another message");
        logger.log(Level.ERROR, "Another message");
    }
}