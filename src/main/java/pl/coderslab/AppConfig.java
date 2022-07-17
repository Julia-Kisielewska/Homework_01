package pl.coderslab;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public SimpleCustomerLogger simpleCustomerLogger(){return new SimpleCustomerLogger();}
    @Bean
    @Primary
 public  FileCustomerLogger fileCustomerLogger() { return new  FileCustomerLogger("test.txt");}
}
