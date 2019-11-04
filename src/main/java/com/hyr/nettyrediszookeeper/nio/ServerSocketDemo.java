package com.hyr.nettyrediszookeeper.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;

/*
 * @author hyr
 * @date 19-11-4-上午11:34
 * */
public class ServerSocketDemo {
    public static void main(String[] args) throws IOException {
        new ServerSocketDemo().startServer();
    }

    public  void startServer() throws IOException {
        Selector selector = Selector.open();

        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.bind(new InetSocketAddress(8000));
        System.err.println("服务器启动成功！");
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (selector.select() > 0){
            Iterator<SelectionKey> selectionKeys = selector.selectedKeys().iterator();
            SelectionKey selectionKey = selectionKeys.next();

            if (selectionKey.isAcceptable()){
                SocketChannel socketChannel = serverSocketChannel.accept();
                socketChannel.configureBlocking(false);
                socketChannel.register(selector,SelectionKey.OP_READ);
            }else if (selectionKey.isReadable()){
                SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                int length = 0;
                while ((length = socketChannel.read(byteBuffer)) > 0){
                    byteBuffer.flip();
                    System.out.println(new String(byteBuffer.array(),0,length));
                    byteBuffer.clear();
                }
                socketChannel.close();
            }

            selectionKeys.remove();
        }
        serverSocketChannel.close();
    }
}
