package com.sv.mjxt.web.tcp.server.session;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * Tcp session处理
 */
//@Slf4j
@Sharable
@Component
public class SessionHandler extends ChannelInboundHandlerAdapter {

	@Autowired
	private SessionManager sessionManager;

    @Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		sessionManager.addChannel(ctx);
		super.channelActive(ctx);
	}
    
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
//        log.info(ctx.channel().remoteAddress() + "通道关闭");
        sessionManager.closeChannel(ctx);
        super.channelInactive(ctx);
    }
}