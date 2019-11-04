package com.hyr.nettyrediszookeeper.reactor;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/*
 * @author hyr
 * @date 19-11-4-下午1:10
 * */
public class EchoServerReactor implements Runnable{
    Selector selector;
    ServerSocketChannel serverSocket;

    EchoServerReactor() throws IOException {
        selector = Selector.open();
        serverSocket = ServerSocketChannel.open();
        serverSocket.configureBlocking(false);
        serverSocket.bind(new InetSocketAddress(8000));
        SelectionKey sk = serverSocket.register(selector, SelectionKey.OP_ACCEPT);
        sk.attach(new AcceptorHander());
    }

    public static void main(String[] args) throws IOException {
        new Thread(new EchoServerReactor()).start();
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()){
                selector.select();
                Set<SelectionKey> selected= selector.selectedKeys();
                Iterator<SelectionKey> iterator = selected.iterator();
                while (iterator.hasNext()){
                    SelectionKey sk = iterator.next();
                    dispatch(sk);
                }
                selected.clear();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void dispatch(SelectionKey sk) {
        Runnable handler = (Runnable) sk.attachment();
        if (handler != null){
            handler.run();
        }
    }

    private class AcceptorHander implements Runnable{
        @Override
        public void run() {
            try {
                SocketChannel channel = serverSocket.accept();
                if (channel != null){
                    new EchoHandler(selector,channel);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
