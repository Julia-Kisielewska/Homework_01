package pl.coderslab;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public class SimpleCustomerLogger implements CustomerLogger{
    @Override
    public void log() {
        System.out.println(LocalDateTime.now() + " Customer operation");
    }
}
