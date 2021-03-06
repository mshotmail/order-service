package orderservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.*;
import java.util.Calendar;

@RestController
public class HelloWildFlyController {


    @RequestMapping("order")
    public String sayHello(){
        String dbName = System.getenv("DB_NAME");
        return ("This is the ACME order service for " + dbName);
    }


    @RequestMapping("hello123")
    public String sayHello123(){
        return ("Hello123, from orderservice");
    }
}
