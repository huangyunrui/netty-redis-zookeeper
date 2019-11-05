package com.hyr.nettyrediszookeeper.common.codec;



import com.hyr.nettyrediszookeeper.common.bean.msg.ProtoMsg;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


/**
 * 编码器
 */

public class ProtobufEncoder extends MessageToByteEncoder<ProtoMsg.Message>
{

    @Override
    protected void encode(ChannelHandlerContext ctx,
                          ProtoMsg.Message msg, ByteBuf out)
            throws Exception
    {

        byte[] bytes = msg.toByteArray();// 将对象转换为byte

        // 加密消息体
        /*ThreeDES des = channel.channel().attr(AppAttrKeys.ENCRYPT).get();
        byte[] encryptByte = des.encrypt(bytes);*/
        int length = bytes.length;// 读取消息的长度

        ByteBuf buf = ctx.alloc().buffer(2 + length);

        // 先将消息长度写入，也就是消息头
        buf.writeShort(length);
        // 消息体中包含我们要发送的数据
        buf.writeBytes(bytes);
        out.writeBytes(buf);

        System.out.println("send "
                + "[remote ip:" + ctx.channel().remoteAddress()
                + "][total length:" + length
                + "][bare length:" + msg.getSerializedSize() + "]");

        if(buf.refCnt()>0)
        {
            System.out.println("释放临时缓冲");
            buf.release();
        }

    }

}
