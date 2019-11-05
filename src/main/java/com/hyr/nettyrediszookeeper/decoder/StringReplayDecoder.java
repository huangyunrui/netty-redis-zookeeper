package com.hyr.nettyrediszookeeper.decoder;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;

import java.util.List;

/*
 * @author hyr
 * @date 19-11-5-下午1:49
 * */
public class StringReplayDecoder extends ReplayingDecoder<StringReplayDecoder.Status> {
    private int length;
    private byte[] inBytes;
    enum Status {
        Parse_1, Parse_2
    }
    public StringReplayDecoder(){
        super(Status.Parse_1);
    }
    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        switch (state()){
            case Parse_1:
                length = byteBuf.readInt();
                inBytes = new byte[length];
                checkpoint(Status.Parse_2);
                break;
            case Parse_2:
                byteBuf.readBytes(inBytes,0,length);
                list.add(new String(inBytes,"UTF-8"));
                checkpoint(Status.Parse_1);
                break;
        }
    }
}
