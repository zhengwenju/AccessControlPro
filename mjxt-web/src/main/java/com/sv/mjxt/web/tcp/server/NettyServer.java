package com.sv.mjxt.web.tcp.server;

import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class NettyServer {

	@Value("${business.tcp.port}")
	private int port;
	
	@Autowired
	private NettyServerInitializer serverInitializer;
	
	@PostConstruct
	public void init() {
		try {
			start();
		} catch(Exception e) {
			log.error(NettyConstants.SERVER_LOG_PRE+"启动发生异常，服务退出！", e);
			System.exit(-1);
		}
	}
	
	
	private EventLoopGroup bossGroup;
	private EventLoopGroup workerGroup;
	private void start() throws InterruptedException {
		bossGroup = new NioEventLoopGroup(1);
        workerGroup = new NioEventLoopGroup();

        ServerBootstrap bootstrap = new ServerBootstrap();
        bootstrap.group(bossGroup, workerGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(serverInitializer);
        ChannelFuture cf = bootstrap.bind(port).sync();
        cf.addListener((ChannelFutureListener) future -> {
            if (cf.isSuccess()) {
            	log.info("{}监听端口{}成功", NettyConstants.SERVER_LOG_PRE, port);
            } else {
            	log.info("{}监听端口{}失败，系统关闭。", NettyConstants.SERVER_LOG_PRE, port);
            	System.exit(-2);
            }
        });
        cf.syncUninterruptibly();
	}

	@PreDestroy
	public void close() {
		if(bossGroup != null) bossGroup.shutdownGracefully();
		if(workerGroup != null)	workerGroup.shutdownGracefully(20, 35, TimeUnit.SECONDS);
	}
}
