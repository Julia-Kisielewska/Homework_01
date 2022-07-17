package pl.coderslab;

public interface CustomerRepository {

    void addClient(Customer customer);

    void deleteClient(Customer customer);

    void listClients();

}
