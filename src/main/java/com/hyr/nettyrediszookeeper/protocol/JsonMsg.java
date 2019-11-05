package com.hyr.nettyrediszookeeper.protocol;

import com.hyr.nettyrediszookeeper.util.JsonUtil;

/*
 * @author hyr
 * @date 19-11-5-下午3:48
 * */
public class JsonMsg {
    private int id;

    private String content;

    public String convertToJson(){
        return JsonUtil.PojoToJson(this);
    }

    public static JsonMsg parseFromJson(String json){
        return JsonUtil.josnToPojo(json,JsonMsg.class);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
