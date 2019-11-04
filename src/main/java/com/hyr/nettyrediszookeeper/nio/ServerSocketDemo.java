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

    public void startServer() throws IOException {
        // 创建选择器
        Selector selector = Selector.open();
        // 创建socket并配置信息
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.bind(new InetSocketAddress(8000));
        System.err.println("服务器启动成功！");
        // 将socket注册到选择器
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        // 轮询IO就绪事件
        while (selector.select() > 0) {
            // 得到选择键集合
            Iterator<SelectionKey> selectionKeys = selector.selectedKeys().iterator();
            while (selectionKeys.hasNext()) {
                //获取单个选择键
                SelectionKey selectionKey = selectionKeys.next();
                //判断不同事件类型
                if (selectionKey.isAcceptable()) {
                    //客户端连接，就绪
                    SocketChannel socketChannel = serverSocketChannel.accept();
                    socketChannel.configureBlocking(false);
                    //注册到选择器
                    socketChannel.register(selector, SelectionKey.OP_READ);
                } else if (selectionKey.isReadable()) {
                    // 可读事件，读取数据
                    SocketChannel socketChannel = (SocketChannel) selectionKey.channel();

                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                    int length = 0;
                    while ((length = socketChannel.read(byteBuffer)) > 0) {
                        byteBuffer.flip();
                        System.out.println(new String(byteBuffer.array(), 0, length));
                        byteBuffer.clear();
                    }
                    socketChannel.close();
                }
                selectionKeys.remove();
            }
        }
        serverSocketChannel.close();
    }

    /*
     * @author hyr
     * @date 19-11-4-上午11:44
     * */
    public static class ClientSocketDemo {
        public static void main(String[] args) throws IOException {
            new ClientSocketDemo().startClient();
        }

        public void startClient() throws IOException {
            // 配置连接地址
            InetSocketAddress address = new InetSocketAddress("127.0.0.1",8000);
            // 创建socket连接,
            SocketChannel socketChannel = SocketChannel.open(address);
            // 设置为非阻塞模式
            socketChannel.configureBlocking(false);
            //轮询到创建连接成功
            while (!socketChannel.finishConnect()){

            }
            System.out.println("连接成功");
            //分配缓冲区
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            byteBuffer.put("hello world".getBytes());
            byteBuffer.flip();
            //发送数据
            socketChannel.write(byteBuffer);
            socketChannel.shutdownOutput();
            socketChannel.close();
        }
    }
}
