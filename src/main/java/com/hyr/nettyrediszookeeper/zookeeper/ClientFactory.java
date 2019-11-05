package com.hyr.nettyrediszookeeper.zookeeper;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

/*
 * @author hyr
 * @date 19-11-5-下午9:55
 * */
public class ClientFactory {
    public static CuratorFramework createSimple(String connectionString){
        //第一个参数，等待时间基础单位，毫秒
        // 最大重试次数
        ExponentialBackoffRetry retry =
                new ExponentialBackoffRetry(1000,3);
        return CuratorFrameworkFactory.newClient(connectionString,retry);
    }

    public static CuratorFramework createWithOptions(
            String connectionString, RetryPolicy retryPolicy,
            int connectionTimeoutMs,int sessionTimeoutMS
            ){
        return CuratorFrameworkFactory.builder()
                .connectString(connectionString)
                .retryPolicy(retryPolicy)
                .connectionTimeoutMs(connectionTimeoutMs)
                .sessionTimeoutMs(sessionTimeoutMS)
                .build();
    }
}
