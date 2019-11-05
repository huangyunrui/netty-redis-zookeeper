package com.hyr.nettyrediszookeeper.protocol;

import org.junit.Test;

/*
 * @author hyr
 * @date 19-11-5-下午3:50
 * */
public class JsomMsgDemo {

    @Test
    public void serAndDesr(){
        JsonMsg jsonMsg = new JsonMsg();
        jsonMsg.setContent("hello world");
        jsonMsg.setId(1);

        String message = jsonMsg.convertToJson();
        System.out.println(message);

        JsonMsg jsonMsg1 = JsonMsg.parseFromJson(message);
        System.out.println(jsonMsg1.getContent());
    }
}
