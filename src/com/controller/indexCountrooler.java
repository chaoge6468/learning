package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class indexCountrooler extends AbstractController{

	
	
	@RequestMapping(value="index.html",method=RequestMethod.GET)//����ӳ��
	public String index(){
		return "index";
	}
	@RequestMapping(value="mobile",method=RequestMethod.POST)//����ӳ��
	public ResponseEntity<Map<String, Object>> login(HttpServletRequest request){
		String mobile = ServletRequestUtils.getStringParameter(request, "ajaxMobile", "");
        String password = ServletRequestUtils.getStringParameter(request, "ajaxPassword", "");
        Map<String, Object> result = new HashMap<String, Object>(); 
        if(mobile.equals("123")&&password.equals("123")){
        	  result.put("success", "true");
              result.put("message", "");
              return this.validatorResponse(result);
        }else{
        	result.put("success", "false");
            result.put("message", "请输入正确手机号。");
            return this.validatorResponse(result);
        }
	}
	
}
