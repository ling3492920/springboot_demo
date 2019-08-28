package cn.jhd.springboot_demo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author jianghd
 * @create 2019/8/28-16:12
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name="name") String name, Model model){
        model.addAttribute("name",name);
        model.addAttribute("sayhi","~~~~测试修改~~~~");
        return "hello";
    }
}
