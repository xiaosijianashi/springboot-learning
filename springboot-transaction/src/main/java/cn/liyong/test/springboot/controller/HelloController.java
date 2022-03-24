package cn.liyong.test.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is Description
 *
 * @author liyong
 * @date 2022/03/24
 */
@RestController
public class HelloController {

    @RequestMapping(path = "hi", method = RequestMethod.GET)
    public String hi() {
        return "hi boys!";
    }
}
