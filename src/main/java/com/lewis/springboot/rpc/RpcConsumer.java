package com.lewis.springboot.rpc;

/**
 * Created by zcy on 2017/7/20.
 */
public class RpcConsumer {
    public static void main(String[] args) throws Exception {
        HelloService helloService = RpcFramework.refer(HelloService.class, "127.0.0.1", 1234);
        for (int i = 0; i < 10; i++) {
            String helloWorld = helloService.hello("lewis");

            System.out.println(helloWorld);
            Thread.sleep(1000);
        }
    }
}
