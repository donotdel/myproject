package com.zcit.utils;


import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author ZWT
 * @date 2019/5/8
 */
public class RequestUtils {

    public static JSONObject getJson(HttpServletRequest request){
        String param= null;
        JSONObject jsonObject = null;
        try {
            BufferedReader streamReader = new BufferedReader( new InputStreamReader(request.getInputStream(), "UTF-8"));
            StringBuilder responseStrBuilder = new StringBuilder();
            String inputStr;
            while ((inputStr = streamReader.readLine()) != null)
                responseStrBuilder.append(inputStr);

            jsonObject = JSONObject.parseObject(responseStrBuilder.toString());
            param= jsonObject.toJSONString();
            System.out.println(param);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

}
