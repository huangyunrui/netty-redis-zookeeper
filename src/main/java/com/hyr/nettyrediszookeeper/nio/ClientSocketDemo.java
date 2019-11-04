package com.hyr.nettyrediszookeeper.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/*
 * @author hyr
 * @date 19-11-4-下午1:22
 * */
public class ClientSocketDemo {
    public static void main(String[] args) throws IOException {
        new ClientSocketDemo().startClient();
    }

    public void startClient() throws IOException {
        InetSocketAddress address = new InetSocketAddress("127.0.0.1",8000);
        SocketChannel socketChannel = SocketChannel.open(address);
        socketChannel.configureBlocking(false);
        while (!socketChannel.finishConnect()){

        }
        System.out.println("连接成功");
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put("hello world".getBytes());
        byteBuffer.flip();
        socketChannel.write(byteBuffer);
        socketChannel.shutdownOutput();
        socketChannel.close();
    }
}
