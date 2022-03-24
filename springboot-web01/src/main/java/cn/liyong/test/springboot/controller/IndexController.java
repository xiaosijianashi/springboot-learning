package cn.liyong.test.springboot.controller;

import cn.liyong.test.springboot.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    /**
     * 登录页
     * @return
     */
    @GetMapping(value = {"/", "/login"})
    public String loginPage() {
        return "login";
    }

    /**
     * 主页
     * @param user
     * @param session
     * @return
     */
    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model) {
        // 登录成功重定向到main.html
        if(!StringUtils.isEmpty(user.getUserName()) && StringUtils.hasLength(user.getPassword())) {
            session.setAttribute("loginUser", user);
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "账号密码错误！");
            //回到登录页面
            return "login";
        }
    }

    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model) {
        if(session.getAttribute("loginUser") != null) {
            return "main";
        } else {
            model.addAttribute("msg", "当前未登录！");
            //回到登录页面
            return "login";
        }
    }
}
