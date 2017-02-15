package cn.clgate.atlas.controller;

import cn.clgate.atlas.domain.User;
import cn.clgate.atlas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangbin on 17/2/13.
 */
@Controller
public class MyController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "test")
    public String test(Model model){
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        model.addAttribute("list",list);
        return "test";
    }
    @RequestMapping(value = "index")
    public User index(){
        User user = new User();
        user.setAge(20);
        user.setName("张三");
        return user;
    }

    @RequestMapping(value = "/ser")
    public String testService(){
        User u = userService.doSomeBusinessStuff(1);
        System.out.println(u.getName());
        return "test";
    }
}
