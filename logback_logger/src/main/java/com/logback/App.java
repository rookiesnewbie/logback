package com.logback;


import ch.qos.logback.classic.Level;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ch.qos.logback.classic.Logger logger =
                (ch.qos.logback.classic. Logger) LoggerFactory.getLogger(App .class); //LoggerFactory.getLogger("com.logback.App");
        ch.qos.logback.classic.Logger logger1 = (ch.qos.logback.classic. Logger) LoggerFactory.getLogger("com");
        ch.qos.logback.classic.Logger logger2 = (ch.qos.logback.classic. Logger) LoggerFactory.getLogger("com.logback");
        //设置日志级别
        logger.setLevel(Level.ERROR);

        //获取设置的日志级别
        Level level = logger.getLevel();
        System.out.println(level);

        logger1.setLevel(Level.INFO);

        //获取日志级别，如果没有设置，则获取默认的日志级别，否则获取设置的日志级别
        Level effectiveLevel = logger.getEffectiveLevel();
        System.out.println(effectiveLevel);

        //继承logger1的日志级别
        Level logger21 = logger2.getEffectiveLevel();
        System.out.println("logger2没有设置日志级别，则继承logger1的日志级别->"+logger21);

        logger2.warn("hello, world");
    }
}
