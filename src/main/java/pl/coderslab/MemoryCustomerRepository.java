package pl.coderslab;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Data
public class MemoryCustomerRepository implements CustomerRepository {
    ArrayList<Customer> list = new ArrayList<>();
    private CustomerLogger customerLogger;


    @Autowired
    public MemoryCustomerRepository(CustomerLogger customerLogger) {
        this.customerLogger = customerLogger;
    }

    @Override
    public void addClient(Customer customer) {
        customerLogger.log();
        this.list.add(customer);
    }

    @Override
    public void deleteClient(Customer customer) {
        customerLogger.log();
        this.list.remove(customer);
    }

    @Override
    public void listClients() {
        customerLogger.log();
        this.list.forEach(System.out::println);
    }
}
