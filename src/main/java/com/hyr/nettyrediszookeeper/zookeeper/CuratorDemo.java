package com.hyr.nettyrediszookeeper.zookeeper;

import org.apache.curator.framework.CuratorFramework;
import org.apache.zookeeper.AsyncCallback;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.data.Stat;
import org.junit.Test;

import java.util.List;

/*
 * @author hyr
 * @date 19-11-5-下午10:04
 * */
public class CuratorDemo {
    @Test
    public void createNode(){
        //创建客户端
        CuratorFramework client = ClientFactory.createSimple("127.0.0.1:2181");
        try {
            //启动客户端节点
            client.start();
            //创建一个Znode节点
            //节点数据为playload
            String data = "hello";
            byte[] playload = data.getBytes("UTF-8");
            String zkPath = "/test/CURD/node-1";
            client.create()
                    .creatingParentContainersIfNeeded()
                    .withMode(CreateMode.PERSISTENT)
                    .forPath(zkPath,playload);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            client.close();
        }
    }


    @Test
    public void readNode(){
        //创建客户端
        CuratorFramework client = ClientFactory.createSimple("127.0.0.1:2181");
        try {
            //启动客户端节点
            client.start();
            String zkPath = "/test/CURD/node-1";
            Stat stat = client.checkExists().forPath(zkPath);
           if (null != stat){
               //读取检点数据
               byte[] payload = client.getData().forPath(zkPath);
               String data = new String(payload,"UTF-8");
               System.out.println("节点数据："+data);
                String parentPath = "/test";
                List<String> children = client.getChildren().forPath(parentPath);
                for (String string:children){
                    System.out.println(string);
                }
           }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            client.close();
        }
    }


    @Test
    public void updateNode(){
        //创建客户端
        CuratorFramework client = ClientFactory.createSimple("127.0.0.1:2181");
        try {
            //启动客户端节点
            client.start();
            //修改一个Znode节点
            //节点数据为playload
            String data = "hello world";
            byte[] playload = data.getBytes("UTF-8");
            String zkPath = "/test/CURD/node-1";
            client.setData().forPath(zkPath,playload);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            client.close();
        }
    }

    @Test
    public void updateNodeAsync(){
        //创建客户端
        CuratorFramework client = ClientFactory.createSimple("127.0.0.1:2181");
        try {
            AsyncCallback.StringCallback stringCallback = new AsyncCallback.StringCallback() {
                @Override
                public void processResult(int i, String s, Object o, String s1) {
                    System.out.println("i:"+i);
                    System.out.println("s:"+s);
                    System.out.println("o:"+o);
                    System.out.println("s1:"+s1);
                }
            };
            //启动客户端节点
            client.start();
            //修改一个Znode节点
            //节点数据为playload
            String data = "hello ,every body";
            byte[] playload = data.getBytes("UTF-8");
            String zkPath = "/test/CURD/remoteNode-1";
            client.setData()
                    .inBackground(stringCallback)
                    .forPath(zkPath,playload);
            Thread.sleep(10000);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            client.close();
        }
    }


    @Test
    public void deleteNode(){
        //创建客户端
        CuratorFramework client = ClientFactory.createSimple("127.0.0.1:2181");
        try {
            //启动客户端节点
            client.start();
            //修改一个Znode节点
            //节点数据为playload
            String data = "hello world";
            byte[] playload = data.getBytes("UTF-8");
            String zkPath = "/test/CURD/node-1";
            client.delete().forPath(zkPath);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            client.close();
        }
    }
}
