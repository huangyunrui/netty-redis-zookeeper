package com.hyr.nettyrediszookeeper.decoder;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageCodec;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.ReplayingDecoder;

import java.util.List;

/*
 * @author hyr
 * @date 19-11-4-下午10:02
 * ByteToMessageDecoder,
 * */
public class Byte2IntegerDecoder extends ReplayingDecoder {

    //继承ByteToMessageDecoder会出现数据长度不够问题
    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List list) throws Exception {
//        while (byteBuf.readableBytes()>4){
            int i = byteBuf.readInt();
            System.out.println("解码出一个整数:"+i);
            list.add(i);
//        }
    }
}
