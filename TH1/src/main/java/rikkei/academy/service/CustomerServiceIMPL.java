package rikkei.academy.service;

import rikkei.academy.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceIMPL implements ICustomerService {
    private static final Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "John", "john@rikkei.academy", "Hanoi"));
        customers.put(2, new Customer(2, "Bill", "bill@rikkei.academy", "Danang"));
        customers.put(3, new Customer(3, "Alex", "alex@rikkei.academy", "Saigon"));
        customers.put(4, new Customer(4, "Adam", "adam@rikkei.academy", "Beijin"));
        customers.put(5, new Customer(5, "Sophia", "sophia@rikkei.academy", "Miami"));
        customers.put(6, new Customer(6, "Rose", "rose@rikkei.academy", "Newyork"));
    }

    @Override
    public List<Customer> finAll() {
        return new ArrayList<>(customers.values());
    }

    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.get(id);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
