package test_spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/hello")
public class TestController {
	@RequestMapping("/index")
    public String hello(){        
        return "hello";
    }
}
