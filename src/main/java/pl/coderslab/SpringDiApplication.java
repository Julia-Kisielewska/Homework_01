package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class SpringDiApplication {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SimpleCustomerLogger simpleCustomerLogger = context.getBean(SimpleCustomerLogger.class);
        simpleCustomerLogger.log();

        System.out.println("============================");

        MemoryCustomerRepository memoryCustomerRepository = context.getBean(MemoryCustomerRepository.class);

        Customer customer1 = new Customer(1, "Jan", "Kowalski");
        Customer customer2 = new Customer(2, "Anna", "Nowak");

        memoryCustomerRepository.addClient(customer2);
        memoryCustomerRepository.addClient(customer1);
        System.out.println("dodanie klientów");
        memoryCustomerRepository.listClients();
        memoryCustomerRepository.deleteClient(customer1);
        System.out.println("usunięcie klienta 1");
        memoryCustomerRepository.listClients();

        System.out.println("============================");

//        FileCustomerLogger fileCustomerLogger = context.getBean("fileCustomerLogger", FileCustomerLogger.class);
//        fileCustomerLogger.setFilename("test.txt");
//        fileCustomerLogger.log();

        context.close();
    }
}
