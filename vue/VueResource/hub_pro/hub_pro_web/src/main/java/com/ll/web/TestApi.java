package com.ll.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: gll
 * @Description:
 * @Data: Create in 10:36 2019/7/23
 * @Modified By:
 */
@Controller
@RequestMapping("/test")
@Api(value = "TestApi", tags={"测试模块"})
public class TestApi {
    @RequestMapping(value = "/get/data", method=RequestMethod.GET)
    @ApiOperation(value = "测试用接口",notes = "测试用接口",httpMethod = "GET")
    public @ResponseBody Map<String,String> testFun(){
        Map<String,String> retMap = new HashMap<>();
        retMap.put("key","value");
        return  retMap;
    }


    @RequestMapping(value = "/post/data", method=RequestMethod.POST)
    @ApiOperation(value = "测试用接口",notes = "测试用接口",httpMethod = "POST")
    public @ResponseBody Map<String,String> testFun2(@RequestParam(value = "key") String key,
                                                     @RequestParam(value = "value") String value){
        Map<String,String> retMap = new HashMap<>();
        retMap.put(key,value);
        return  retMap;
    }
}
