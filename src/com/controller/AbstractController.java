package com.controller;

import java.nio.charset.Charset;
import java.util.Map;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;


/**
 * 控制器的抽象基类。
 * @author XingNing OU
 */
public abstract class AbstractController {
	
    
    /**
     * 返回JSON格式的响应内容。用于表单验证
     * @param resp 响应内容
     */
    protected ResponseEntity<Map<String, Object>> validatorResponse(Map<String, Object> result) {
        MediaType mediaType = new MediaType("application", "json", Charset.forName("UTF-8"));
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(mediaType);
        return new ResponseEntity<Map<String, Object>>(result, headers, HttpStatus.OK);
    }

   
}
