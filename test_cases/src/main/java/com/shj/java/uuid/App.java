package com.shj.java.uuid;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.UUID;

/**
 * @description:
 * @author: sunhaojie
 * @create: 2019/08/29 17:36
 */
public class App {
    public static void main(String[] args) {
        UUID.randomUUID();
        System.out.println(UUID.randomUUID());
        String ss = RandomStringUtils.random(6);
        System.out.println(ss);

    }
}
