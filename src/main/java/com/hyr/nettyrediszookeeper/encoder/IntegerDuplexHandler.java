package com.hyr.nettyrediszookeeper.encoder;


import io.netty.channel.CombinedChannelDuplexHandler;

/**
 * create by 尼恩 @ 疯狂创客圈
 **/
public class IntegerDuplexHandler extends CombinedChannelDuplexHandler<
        Byte2IntegerCodec,
        Integer2ByteEncoder>
{
    public IntegerDuplexHandler() {
        super(new Byte2IntegerCodec(), new Integer2ByteEncoder());
    }
}
