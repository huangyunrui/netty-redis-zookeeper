package com.hyr.nettyrediszookeeper.zookeeper;

import org.apache.curator.framework.CuratorFramework;
import org.apache.zookeeper.CreateMode;

/*
 * @author hyr
 * @date 19-11-6-下午1:16
 * @desc 利用zk生成分布式id
 * */
public class IDMaker {

    private CuratorFramework client;

    /**
     * 创建临时顺序节点
     * @param pathPrefix
     * @return
     */
    private String createSeqNode(String pathPrefix) {

        String destPath = null;
        try {
            destPath = client.create()
                    .creatingParentsIfNeeded()
                    .withMode(CreateMode.EPHEMERAL_SEQUENTIAL)
                    .forPath(pathPrefix);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return destPath;
    }

    public String  makeId(String nodeName){
        String str = createSeqNode(nodeName);
        if (null == str){
            return null;
        }
        int index = str.lastIndexOf(nodeName);
        if (index >= 0){
            index += nodeName.length();
            return index <= str.length() ? str.substring(index) : "";
        }
        return str;
    }

    public void destory() {
        client.close();
    }

    public void init() {
        client = ClientFactory.createSimple("127.0.0.1:2181");
        client.start();
    }
}
