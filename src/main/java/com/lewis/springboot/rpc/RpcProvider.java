package com.lewis.springboot.rpc;

/**
 * Created by zcy on 2017/7/20.
 */
public class RpcProvider {
    public static void main(String[] args) throws Exception {
        HelloService helloService = new HelloServiceImpl();
        RpcFramework.export(helloService,1234);
    }
}
