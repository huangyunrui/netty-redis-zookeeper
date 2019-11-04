package com.hyr.nettyrediszookeeper.netty.handler;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.embedded.EmbeddedChannel;

/*
 * @author hyr
 * @date 19-11-4-下午8:24
 * */
public class InHandlerDemoTest {
    public static void main(String[] args) throws InterruptedException {
        new InHandlerDemoTest().testInHandlerLifeCircle();
    }

    public void testInHandlerLifeCircle() throws InterruptedException {
        final NettyDiscardHander hander = new NettyDiscardHander();
        //初始化处理器
        ChannelInitializer channelInitializer= new ChannelInitializer<EmbeddedChannel>(){

            @Override
            protected void initChannel(EmbeddedChannel channel) throws Exception {
                channel.pipeline().addLast(hander);
            }
        };
        // 创建嵌入式通道
        EmbeddedChannel channel = new EmbeddedChannel(channelInitializer);
        ByteBuf buf = Unpooled.buffer();
        // 模拟入站，写入数据包
        buf.writeInt(1);
        channel.writeInbound(buf);
        channel.flush();
        // 模拟入站，写入数据包
        channel.writeInbound(buf);
        channel.flush();

        channel.close();
        Thread.sleep(10000);
    }
}
