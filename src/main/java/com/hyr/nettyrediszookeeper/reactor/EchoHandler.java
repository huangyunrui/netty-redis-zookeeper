package com.hyr.nettyrediszookeeper.reactor;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

/*
 * @author hyr
 * @date 19-11-4-下午1:21
 * */
public class EchoHandler implements Runnable{
    final SocketChannel channel;
    final SelectionKey sk;
    final ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
    static final int RECIEVING = 0, SENDGING = 1;
    int state = RECIEVING;
    public EchoHandler(Selector selector, SocketChannel c) throws IOException {
        channel = c;
        c.configureBlocking(false);
        sk = c.register(selector,0);
        sk.attach(this);
        sk.interestOps(SelectionKey.OP_READ);
        selector.wakeup();
    }


    @Override
    public void run() {
        try {
            if (state == SENDGING){
                channel.write(byteBuffer);
                byteBuffer.clear();
                sk.interestOps(SelectionKey.OP_READ);
                state = RECIEVING;
            }else if (state ==RECIEVING){
                int length = 0;
                while ((length = channel.read(byteBuffer)) > 0){
                    System.out.println(new String(byteBuffer.array(),0,length));
                }
                byteBuffer.flip();
                sk.interestOps(SelectionKey.OP_WRITE);
                state = SENDGING;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
