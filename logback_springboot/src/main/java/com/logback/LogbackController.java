package com.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author LiTeng
 * @Date 2023/11/16 21:55
 * Version 1.0
 * @Description 测试
 */

@Controller
@RequestMapping("/")
public class LogbackController {

    private Logger logger = LoggerFactory.getLogger(LogbackController.class);

    @RequestMapping("index")
    @ResponseBody
    public void logger(){

        logger.info("Hello World!!!");

    }

}
