package com.sxh.server;

import com.sxh.server.im.NettyServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author sxh
 * @date 2020/6/24
 */
@SpringBootApplication
public class JfxServerApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(JfxServerApplication.class, args);

        NettyServer nettyServer = applicationContext.getBean(NettyServer.class);
        nettyServer.start();
    }
}
