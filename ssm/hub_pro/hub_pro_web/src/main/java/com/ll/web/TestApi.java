package com.ll.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public @ResponseBody String testFun(){
        return "success";
    }
}
