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

        while (true){
            logger.info( "Hello World!" );
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
