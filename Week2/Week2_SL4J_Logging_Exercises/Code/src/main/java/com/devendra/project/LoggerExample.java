package com.devendra.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class LoggerExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggerExample.class);

    public static void main(String[] args) {
        logger.info("Application started.......");
        try {
            int res = divide(10, 0);
        } catch (ArithmeticException e) {
            logger.error("An error occurred while dividing: {}", e.getMessage());
        }
        logger.warn("This is a warning level message");
        logger.info("Application finished.........");
    }

    private static int divide(int i, int i1) {
        return i / i1;
    }
}
