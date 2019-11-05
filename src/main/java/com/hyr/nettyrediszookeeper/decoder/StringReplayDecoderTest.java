package com.hyr.nettyrediszookeeper.decoder;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.embedded.EmbeddedChannel;

import java.nio.charset.Charset;
import java.util.Random;

/*
 * @author hyr
 * @date 19-11-4-下午10:06
 * */
public class StringReplayDecoderTest {
    public static void main(String[] args) throws InterruptedException {
        new StringReplayDecoderTest().testByteToIntegerDecoder();
    }

    private void testByteToIntegerDecoder() throws InterruptedException {
        ChannelInitializer initializer = new ChannelInitializer<EmbeddedChannel>() {
            @Override
            protected void initChannel(EmbeddedChannel channel) throws Exception {
                channel.pipeline().addLast(new StringReplayDecoder());
                channel.pipeline().addLast(new StringProcessHandler());
            }
        };
        EmbeddedChannel channel = new EmbeddedChannel(initializer);
        String content = "这是一个字符串解析，你好呀";
        byte[] bytes = content.getBytes(Charset.forName("utf-8"));
        Random random = new Random();
        for (int j=0; j<10;j++){
            int num = random.nextInt(3);
            ByteBuf buf = Unpooled.buffer();
            buf.writeInt(bytes.length * num);
            for (int k=0;k<num;k++){
                buf.writeBytes(bytes);
            }
            channel.writeInbound(buf);
        }

        Thread.sleep(50000);
    }

}
