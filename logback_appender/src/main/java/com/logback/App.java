package com.logback;

import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    static ch.qos.logback.classic.Logger logger =
            (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.aa");
    public static void main(String[] args) {
        logger.info( "Hello World!" );

    }
}
