package com.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author LiTeng
 * @Date 2023/11/16 14:10
 * Version 1.0
 * @Description
 */
public class test {
    static ch.qos.logback.classic.Logger logger =
            (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.aa");
    public static void main(String[] args) {

//        System.out.println("获取设置的根记录器的日志级别："+ logger.getEffectiveLevel());
        System.out.println("获取设置的创建的记录器的日志级别："+ logger.getEffectiveLevel());

    }

}
