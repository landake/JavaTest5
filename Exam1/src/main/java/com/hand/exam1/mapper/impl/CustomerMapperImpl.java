package com.hand.exam1.mapper.impl;


import com.hand.exam1.mapper.BaseMapper;
import com.hand.exam1.mapper.CustomerMapper;
import com.hand.exam1.model.Customer;
import org.springframework.stereotype.Repository;

@Repository(value = "customerMapper")
public class CustomerMapperImpl extends BaseMapper implements CustomerMapper {

    @Override
    public Boolean insert(Customer customer) {
        try {
            this.getSqlSession().insert("customer.insert" , customer);
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Customer selectById(int id) {
        Customer customer = null;
        try {
           customer = this.getSqlSession().selectOne("customer.selectById" , id);
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
            maxId = this.getSqlSession().selectOne("customer.selectId");
        }catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return maxId;
    }

    @Override
    public void deleteCustomer(int deleteCustomer) {
        try {
            this.getSqlSession().selectOne("customer.deleteCustomer");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
