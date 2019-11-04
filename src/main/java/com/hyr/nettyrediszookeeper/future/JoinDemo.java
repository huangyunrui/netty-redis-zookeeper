package com.hyr.nettyrediszookeeper.future;

/*
 * @author hyr
 * @date 19-11-4-下午2:19
 * */
public class JoinDemo {
    public static final int SLEEP_GAP = 500;

    public static String getCurThreadName(){
        return Thread.currentThread().getName();
    }

    static class HotWaterThread extends Thread{
        public HotWaterThread(){
            super("** 烧水线程**");
        }

        public void run(){
            try {
                System.out.println("洗好水壶");
                System.out.println("灌上凉水");
                System.out.println("放在火上");
                Thread.sleep(SLEEP_GAP);
                System.out.println("水开了");
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(" 发生异常");
            }
            System.out.println(" 运行结束");
        }
    }

    static class WashThread extends Thread{
        public WashThread(){
            super("** 清洗茶具**");
        }

        public void run(){
            try {
                System.out.println("洗茶壶");
                System.out.println("洗茶杯");
                System.out.println("那茶叶");
                Thread.sleep(SLEEP_GAP);
                System.out.println("洗完了");
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(" 发生异常");
            }
            System.out.println(" 运行结束");
        }
    }

    public static void main(String[] args) {
        Thread hThread = new HotWaterThread();
        Thread wThread = new WashThread();
        hThread.start();
        wThread.start();

        try {
            hThread.join();
            wThread.join();
            Thread.currentThread().setName("主线程");
            System.out.println("泡茶喝");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getCurThreadName()+"运行结束");
    }

}
