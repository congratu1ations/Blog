package cn.wmyskxz.blog.common.utils;

import com.alibaba.fastjson.JSONObject;

public class JsonUtil {


    public static JSONObject parseWrong(String wrongAnswer){

        String[] successes = wrongAnswer.split("success");
        String str = successes[0]+"\""+"success"+"\""+successes[1];
        JSONObject jsonObject = null;
        try{
            jsonObject = JSONObject.parseObject(str);
        }catch (Exception e){
            String[] results = str.split("result", 1);
            String result = results[0]+"\""+"result"+"\""+results[1];
            jsonObject = JSONObject.parseObject(result);
        }
        return jsonObject;



    }

    public static void main(String[] args) {
        String str = "{success:true,\"riskamnt\":{\"1\":[\"1.00\"],\"2\":[\"1.00\"],\"7\":[\"0.00\"]}}";
        JSONObject jsonObject = parseWrong(str);
        System.out.println(jsonObject.toJSONString());

    }

}
