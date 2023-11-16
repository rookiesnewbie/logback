package com.logback;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import ch.qos.logback.core.encoder.Encoder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * @Author LiTeng
 * @Date 2023/11/16 18:29
 * Version 1.0
 * @Description
 */
public class MyAppender<E> extends UnsynchronizedAppenderBase<E> {



    private Encoder encoder;

    private String fileName;

    public void setEncoder(Encoder encoder) {
        this.encoder = encoder;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    protected void append(E e) {
        ILoggingEvent event = (ILoggingEvent) e;
        byte[] byteArrary = this.encoder.encode(e);
        try {
            String s = new String(byteArrary, "utf-8");
            System.out.println(s);

            File file = new File(fileName);
            FileOutputStream fileOutputStream = new FileOutputStream(file,true);
            fileOutputStream.write(byteArrary);
            fileOutputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
