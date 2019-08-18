package com.grace.it.advice;

import com.alibaba.fastjson.JSON;
import com.grace.it.model.ResponseTemplete;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;


/**
 * @description:
 * @project: grace
 * @date: 2019/8/17
 * @author: Wenxin
 * @version: 1.0
 */
@ControllerAdvice
public class DataResponseBodyAdvice implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
       if (body instanceof ResponseTemplete){
           return body;
       }
        ResponseTemplete<Object> responseTemplete = new ResponseTemplete<>();
       responseTemplete.setData(body);

       if (body instanceof String ){
           return JSON.toJSONString(responseTemplete);
       }
        return responseTemplete;
    }
}
