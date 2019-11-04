package com.hyr.nettyrediszookeeper.netty.handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.SimpleUserEventChannelHandler;
import io.netty.util.concurrent.EventExecutorGroup;

import java.nio.ByteBuffer;

/*
 * @author hyr
 * @date 19-11-4-下午4:03
 * */
public  class NettyDiscardHander extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf in = (ByteBuf) msg;
        System.out.println("收到消息");
        while (in.isReadable()){
            System.out.println(in.readByte());
        }
        System.out.println();
        ((ByteBuf) msg).clear();
    }
}
