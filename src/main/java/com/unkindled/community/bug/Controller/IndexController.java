package com.unkindled.community.bug.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
/**
 * @controller
 * 允许当前的类接受 同目录 和 上级目录的请求（具体啥没懂）
 */
public class IndexController {

    @GetMapping("/")
    public String index(){return "Index";}

}
