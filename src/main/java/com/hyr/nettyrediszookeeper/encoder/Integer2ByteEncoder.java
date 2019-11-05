package com.hyr.nettyrediszookeeper.encoder;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.springframework.boot.env.YamlPropertySourceLoader;

/*
 * @author hyr
 * @date 19-11-5-下午2:30
 * */
public class Integer2ByteEncoder extends MessageToByteEncoder<Integer> {

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Integer integer, ByteBuf byteBuf) throws Exception {
        byteBuf.writeInt(integer);
        System.out.println("encoder Integer = " + integer);
    }
}
