package orderservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.*;
import java.util.Calendar;

@RestController
public class HelloWildFlyController {


    @RequestMapping("order")
    public String sayHello(){
        return ("This is the ACME order service"); 
    }


    @RequestMapping("hello123")
    public String sayHello123(){
        return ("Hello123, from orderservice");
    }
}
