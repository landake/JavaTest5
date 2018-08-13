package com.hand.exam1.mapper;

import com.hand.exam1.model.Customer;

public interface CustomerMapper {
    public Boolean insert(Customer customer);
    public Customer selectById(int id);
    public int selectId();
    public void deleteCustomer(int deleteCustomer);
}
