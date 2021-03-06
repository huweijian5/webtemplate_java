package com.gosuncn.sdas.web;

import com.gosuncn.sdas.bean.ApiResult;
import com.gosuncn.sdas.service.TestService;
import com.gosuncn.sdas.utils.ApiResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    TestService testService;
    /**
     * @api {get} /sda/test/:content 测试
     * @apiName test
     * @apiGroup testGroup
     * @apiVersion 1.0.0
     * @apiDescription 测试
     * @apiParam {String}           content=hello   测试内容+默认值
     * @apiParam {String}           [optional]      可选项
     * @apiParam {String}           [optional2=123] 可选项+默认值
     * @apiParam {Boolean}          value1          布尔值
     * @apiParam {Number}           value2          数字
     * @apiParam {Object}           value3          对象
     * @apiParam {String[]}         value4          字符串数组
     * @apiParam {string{..5}}      value5          最大长度为5
     * @apiParam {string{2..5}}     value6          长度必须在2和5之间
     * @apiParam {number{100-999}}  value7          范围在100到999之间
     * @apiParam {number=1,2,3,99}  value8          只能在1,2,3,99中选择
     * @apiUse CODE_200
     */
    @GetMapping(value = "/{content}")
    public ApiResult<String> test(
            @PathVariable("content") String content
    ){

        return ApiResultUtil.success(testService.test(content));
    }
}
