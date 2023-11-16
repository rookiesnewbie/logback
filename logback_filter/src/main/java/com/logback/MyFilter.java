package com.logback;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

/**
 * @Author LiTeng
 * @Date 2023/11/16 21:21
 * Version 1.0
 * @Description 自定义过滤器
 */
public class MyFilter extends Filter<ILoggingEvent> {

    private Level level;

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public FilterReply decide(ILoggingEvent iLoggingEvent) {
        if (iLoggingEvent.getLevel().equals(this.level)){
            return FilterReply.ACCEPT;
        }
        return FilterReply.DENY;
    }
}
