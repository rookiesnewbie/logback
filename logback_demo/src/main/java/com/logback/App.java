package com.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Hello world!
 *   日志级别：TRACE < DEBUG < INFO < WARN < ERROR
 */
public class App {
    //创建日志记录器
    static Logger logger = LoggerFactory.getLogger(App.class); //"com.logback.App"
    public static void main( String[] args ) {
        logger.error("Hello World!");
    }
}
