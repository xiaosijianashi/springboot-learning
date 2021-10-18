package cn.liyong.test.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewTestController {


    @GetMapping("/atguigu")
    public String atguigu(Model model) {
        model.addAttribute("msg", " i am a cat");
        model.addAttribute("link", "https://www.baidu.com");
        return "success";
    }
}
