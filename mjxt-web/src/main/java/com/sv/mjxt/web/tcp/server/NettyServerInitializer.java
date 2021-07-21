package com.sv.mjxt.web.tcp.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.sv.mjxt.web.tcp.server.exception.ExceptionHandler;
import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.Command;
import com.sv.mjxt.web.tcp.server.session.SessionHandler;

import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import io.netty.handler.timeout.IdleStateHandler;

@Sharable
@Component
public class NettyServerInitializer extends ChannelInitializer<SocketChannel> {

	@Value("${business.tcp.idletimeout}")
	private int idletimeout;
	
	private SessionHandler sessionHandler;
	private ExceptionHandler exceptionHandler;
	private DispatcherHandler dispatcherHandler;
	
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline channelPipeline=socketChannel.pipeline();

        channelPipeline.addLast(new IdleStateHandler(idletimeout, 0, 0));
        
        channelPipeline.addLast(new ProtobufVarint32FrameDecoder());
        channelPipeline.addLast(new ProtobufDecoder(Command.getDefaultInstance()));
        channelPipeline.addLast(new ProtobufVarint32LengthFieldPrepender());
        channelPipeline.addLast(new ProtobufEncoder());
        
        channelPipeline.addLast(NettyConstants.HANDLER_NAME_SESSION, sessionHandler);
        channelPipeline.addLast(NettyConstants.HANDLER_NAME_EXCEPTION, exceptionHandler);
        channelPipeline.addLast(NettyConstants.HANDLER_NAME_BUSINESS, dispatcherHandler);

    }
}
