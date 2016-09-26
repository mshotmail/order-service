package orderservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {


    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello, from orderservice");
    }


    @RequestMapping("hello123")
    public String sayHello123(){
        return ("Hello123, from orderservice");
    }
}
