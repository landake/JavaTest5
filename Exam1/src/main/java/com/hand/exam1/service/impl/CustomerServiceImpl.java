package com.hand.exam1.service.impl;

import com.hand.exam1.mapper.CustomerMapper;
import com.hand.exam1.model.Customer;
import com.hand.exam1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value="customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    @Qualifier(value = "customerMapper")
    private CustomerMapper customerMapper;

    @Override
    public Boolean insert(Customer customer) {
        try{
            customerMapper.insert(customer);
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Customer selectById(int id) {
        Customer customer = null;
        try{
            customer = customerMapper.selectById(id);
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return customer;
    }

    @Override
    public int selectId() {
        int maxId = 0;
        try {
            maxId = customerMapper.selectId();
        }catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return maxId;
    }
    @Override
    public void deleteCustomer(int deleteCustomer) {
        try {
            customerMapper.deleteCustomer(deleteCustomer);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> findCustomerByName(String firstname, String lastname) {
        return null;
    }

    public CustomerMapper getCustomerMapper() {
        return customerMapper;
    }

    public void setCustomerMapper(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }
}
