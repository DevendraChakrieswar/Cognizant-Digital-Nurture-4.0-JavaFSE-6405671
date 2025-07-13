package com.cognizant.spring_learn.Hands_on_1_Exercise_4;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        loggerContext.getLogger("com.cognizant").setLevel(Level.DEBUG);

        LOGGER.debug("TEST DEBUG MESSAGE");

        LOGGER.info("START");
        displayCountry();
        LOGGER.info("END");
    }


    public static void displayCountry() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        System.out.println("Bean Loaded: " + country.getName());

        LOGGER.debug("Country : {}", country.toString());
    }
}
