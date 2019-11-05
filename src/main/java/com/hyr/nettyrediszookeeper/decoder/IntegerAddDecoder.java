package com.hyr.nettyrediszookeeper.decoder;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;

import java.util.List;

/*
 * @author hyr
 * @date 19-11-4-下午10:46
 * */
public class IntegerAddDecoder extends ReplayingDecoder<IntegerAddDecoder.Status> {
    enum Status {
        Parse_1, Parse_2
    }

    private int first;
    private int second;

    public IntegerAddDecoder() {
        super(Status.Parse_1);
    }

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        switch (state()) {
            case Parse_1:
                //从byteBuf中读取数据
                first = byteBuf.readInt();
                //第一步解析成功，
                // 进入第二步，并且设置“读断点指针”为当前读取指针
                checkpoint(Status.Parse_2);
                break;
            case Parse_2:
                second = byteBuf.readInt();
                Integer sum = first+second;
                list.add(sum);
                checkpoint(Status.Parse_1);
                break;
            default:
                break;
        }
    }
}
