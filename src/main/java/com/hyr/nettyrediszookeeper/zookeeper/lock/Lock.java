package com.hyr.nettyrediszookeeper.zookeeper.lock;

/*
 * @author hyr
 * @date 19-11-6-下午2:46
 * @desc 锁的接口
 * */
public interface Lock {

    /**
     * 加锁方法
     * @return
     */
    boolean lock();

    /**
     * 解锁
     * @return
     */
    boolean unlock();
}
