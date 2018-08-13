package com.hand.exam1.service;


import com.hand.exam1.model.Customer;

import java.util.List;

public interface CustomerService {
    public Boolean insert(Customer customer);
    public Customer selectById(int id);
    public int selectId();
    public void deleteCustomer(int deleteCustomer);
    public List<Customer> findCustomerByName(String firstname, String lastname);

}
