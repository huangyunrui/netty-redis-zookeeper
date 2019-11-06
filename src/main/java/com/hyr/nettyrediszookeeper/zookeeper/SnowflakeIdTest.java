package com.hyr.nettyrediszookeeper.zookeeper;



import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * create by 尼恩 @ 疯狂创客圈
 **/

public class SnowflakeIdTest {

    @Test
    public void snowflakeIdTest() throws InterruptedException {
        long workid = PeerNode.getInstance().getId();
        SnowflakeIdGenerator.instance.init(workid);
        ExecutorService es = Executors.newFixedThreadPool(10);
        final HashSet idSed = new HashSet();
        Collections.synchronizedSet(idSed);
        long startTime = System.currentTimeMillis();
        for (int i=0;i<10;i++){
            es.execute(()->{
                for (long j=0; j<5000000;j++){
                    long id = SnowflakeIdGenerator.instance.nextId();
                    synchronized (idSed){
                        idSed.add(id);
                    }
                }
            });
        }
        es.shutdown();
        es.awaitTermination(10,TimeUnit.SECONDS);
        long end = System.currentTimeMillis();
        System.out.println(end-startTime);
    }
}
