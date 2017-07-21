package com.lewis.springboot.rpc;

/**
 * Created by zcy on 2017/7/20.
 */
public class HelloServiceImpl implements HelloService{
    @Override
    public String hello(String name) {
        return "Hello "+name;
    }
}
