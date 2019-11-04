package com.hyr.nettyrediszookeeper.decoder;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.embedded.EmbeddedChannel;

/*
 * @author hyr
 * @date 19-11-4-下午10:06
 * */
public class Byte2IntegerDecoderTest {
    public static void main(String[] args) throws InterruptedException {
        new Byte2IntegerDecoderTest().testByteToIntegerDecoder();
    }

    private void testByteToIntegerDecoder() throws InterruptedException {
        ChannelInitializer initializer = new ChannelInitializer<EmbeddedChannel>() {
            @Override
            protected void initChannel(EmbeddedChannel channel) throws Exception {
                channel.pipeline().addLast(new Byte2IntegerDecoder());
                channel.pipeline().addLast(new IntegerProcessHandler());
            }
        };
        EmbeddedChannel channel = new EmbeddedChannel(initializer);
        for (int j=0; j<10;j++){
            ByteBuf buf = Unpooled.buffer();
            buf.writeInt(j);
            channel.writeInbound(buf);
        }

        Thread.sleep(50000);
    }

}
