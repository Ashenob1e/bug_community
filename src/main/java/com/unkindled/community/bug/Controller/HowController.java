package com.unkindled.community.bug.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
/**
 * @controller
 * 允许当前的类接受 同目录 和 上级目录的请求（具体啥没懂）
 */
public class HowController {

    @GetMapping("/How")
    public String How(@RequestParam(name = "name",defaultValue = "690") String name, Model model){

        model.addAttribute("name",name);
        return "How";
    }
}
