package com.yada.controller;

import com.yada.common.ResultData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

/**
 * @author zexuan.Li
 * @date 2021/6/1
 */
@RestController
public class SessionShareController {

    @GetMapping("/set")
    public ResultData<String> set(HttpServletRequest request) {
        request.getSession().setAttribute("foo", "bar");
        return ResultData.success("添加成功");
    }

    @GetMapping("/get")
    public ResultData<String> get(HttpServletRequest request) {
        Object data = Optional.ofNullable(request.getSession().getAttribute("foo")).orElse("添加失败");
        return ResultData.success(data.toString());
    }
}
