package com.hyr.nettyrediszookeeper.zookeeper;

import org.junit.Test;

/*
 * @author hyr
 * @date 19-11-6-下午1:24
 * */
public class IDMarkerTest {
    @Test
    public void testMakerId(){
        IDMaker idMarker = new IDMaker();
        idMarker.init();
        String nodeName = "/test/IDMaker/ID-";
        for (int i=0;i<10;i++){
            String id = idMarker.makeId(nodeName);
            System.out.println(id);
        }
        idMarker.destory();
    }

    @Test
    public void testTmie(){
        System.out.println(System.currentTimeMillis());
    }
}
