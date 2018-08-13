package com.hand.exam1.service.impl;


import com.hand.exam1.mapper.AddressMapper;
import com.hand.exam1.model.Address;
import com.hand.exam1.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value = "addressService")
public class AddressServiceImpl implements AddressService {

    @Autowired
    @Qualifier(value = "addressMapper")
    private AddressMapper addressMapper;

    public Address selectByAddressId(int addressId){
        Address address = null;
        try {
            address  = addressMapper.selectByAddressId(addressId);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return address;

    }

    public AddressMapper getAddressMapper() {
        return addressMapper;
    }

    public void setAddressMapper(AddressMapper addressDao) {
        this.addressMapper = addressMapper;
    }
}
