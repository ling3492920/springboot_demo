package cn.jhd.springboot_demo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jianghd
 * @create 2019/8/30-10:07
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public @ResponseBody String sayHello() {

        return "Hello test **";
    }
}
