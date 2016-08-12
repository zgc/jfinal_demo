package com.hxgsn.demo;

import com.jfinal.core.JFinal;

/**
 * Created by zgc on 16-7-13.
 */
public class Start {

    public static void main(String[] args) {
        JFinal.start("src/main/webapp", 8080, "/jfinal_demo.txt", 5);
    }
}
