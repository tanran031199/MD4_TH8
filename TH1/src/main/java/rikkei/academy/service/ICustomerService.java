package rikkei.academy.service;

import rikkei.academy.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> finAll();

    Customer findById(int id);

    void save(Customer customer);

    void update(int id, Customer customer);

    void remove(int id);
}
