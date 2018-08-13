package com.hand.exam1.mapper.impl;


import com.hand.exam1.mapper.AddressMapper;
import com.hand.exam1.mapper.BaseMapper;
import com.hand.exam1.model.Address;
import org.springframework.stereotype.Service;

@Service(value = "addressMapper")
public class AddressMapperImpl extends BaseMapper implements AddressMapper {

    public Address selectByAddressId(int addressId){
        Address address = null;
        try{
            address = this.getSqlSession().selectOne("address.selectByAddressId",addressId);
        }catch (Exception e){
          e.printStackTrace();
            return null;
        }
        return address;
    }
}
