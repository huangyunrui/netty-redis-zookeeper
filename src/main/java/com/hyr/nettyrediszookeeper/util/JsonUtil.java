package com.hyr.nettyrediszookeeper.util;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/*
 * @author hyr
 * @date 19-11-5-下午3:41
 * */
public class JsonUtil {
    //谷歌GsonBuilder构造器
    static GsonBuilder gsonBuilder = new GsonBuilder();
    static {
        gsonBuilder.disableHtmlEscaping();
    }
    //序列化，使用谷歌Gson 将Pojo转换成字符串
    public static String PojoToJson(Object object){
//        String json =new Gson().toJson(object);
        String json = gsonBuilder.create().toJson(object);
        return json;
    }

    // 反序列化： 使用阿里Fastjson将字符串转换成Pojo对象
    public static <T>T josnToPojo(String json,Class<T> tClass){
        T t = JSONObject.parseObject(json,tClass);
        return t;
    }

}
