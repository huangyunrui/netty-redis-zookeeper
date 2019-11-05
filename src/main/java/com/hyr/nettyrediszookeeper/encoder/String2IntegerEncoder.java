package com.hyr.nettyrediszookeeper.encoder;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.handler.codec.MessageToMessageDecoder;

import java.util.List;

/*
 * @author hyr
 * @date 19-11-5-下午2:30
 * */
public class String2IntegerEncoder extends MessageToMessageDecoder<String> {


    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, String s, List<Object> list) throws Exception {
        char[] chars = s.toCharArray();
        for (char c:chars){
            if(c>=48 && c <=57){
                list.add(new Integer(c));
            }
        }
    }
}
