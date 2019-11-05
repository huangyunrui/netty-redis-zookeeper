package com.hyr.nettyrediszookeeper.encoder;

import com.hyr.nettyrediszookeeper.decoder.Byte2IntegerDecoder;
import com.hyr.nettyrediszookeeper.decoder.Integer2StringDecoder;
import com.hyr.nettyrediszookeeper.decoder.StringProcessHandler;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.embedded.EmbeddedChannel;

/*
 * @author hyr
 * @date 19-11-5-下午2:32
 * */
public class Integer2ByteEncoderTest {
    public static void main(String[] args) {
        new Integer2ByteEncoderTest().test();
    }

    public void test() {
        ChannelInitializer i = new ChannelInitializer<EmbeddedChannel>() {
            protected void initChannel(EmbeddedChannel ch) {
                ch.pipeline().addLast(new Byte2IntegerCodec());
            }
        };
        EmbeddedChannel channel = new EmbeddedChannel(i);
        // 数据写入
        for (int j = 0; j < 100; j++) {
            channel.write(j);
        }
        channel.flush();

        //获取通道出站数据包
        ByteBuf buf = channel.readOutbound();
        while (null != buf){
            System.out.println(buf.readInt());
            buf = channel.readOutbound();
        }
    }
}
