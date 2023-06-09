package cn.zealon.readingcloud.gateway.controller;

import cn.zealon.readingcloud.common.result.Result;
import cn.zealon.readingcloud.common.result.ResultUtil;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 快速失败接口
 */
public class FallbackController {

    @GetMapping("/fallback")
    public Result fallback() {
        return ResultUtil.fail();
    }
}
