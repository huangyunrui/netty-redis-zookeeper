package com.hyr.nettyrediszookeeper.zookeeper;

import org.apache.curator.framework.CuratorFramework;
import org.apache.zookeeper.CreateMode;

import javax.xml.soap.Node;

/*
 * @author hyr
 * @date 19-11-6-下午1:37
 * */
public class PeerNode {
    private CuratorFramework client = null;
    private String pathRegistered = null;
    private Node node;

    private static PeerNode singleInstance = null;

    public static PeerNode getInstance(){
        if (null == singleInstance){
            singleInstance = new PeerNode();
            singleInstance.client = ClientFactory.createSimple("127.0.0.1:2181");
            singleInstance.init();
        }
        return singleInstance;
    }

    public void init(){
        client.start();
        createParentIfNeeded("/manage");
        try {
            pathRegistered = client.create()
                    .creatingParentsIfNeeded()
                    .withMode(CreateMode.EPHEMERAL_SEQUENTIAL)
                    .forPath("/manage/node/service-");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public long getId(){
        String sid = null;
        if (null == pathRegistered){
            throw new RuntimeException("节点注册失败");
        }

        int index = pathRegistered.lastIndexOf("/manage/node/service-");
        if (index >= 0){
            index = "/manage/node/service-".length();
            sid = index <= pathRegistered.length()? pathRegistered.substring(index) : null;
        }
        if (null == sid){
            throw new RuntimeException("分布式节点错误");
        }
        return Long.parseLong(sid);
    }

    private void createParentIfNeeded(String s) {
        try {
            pathRegistered = client.create()
                    .creatingParentsIfNeeded()
                    .withMode(CreateMode.EPHEMERAL_SEQUENTIAL)
                    .forPath("/manage");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
