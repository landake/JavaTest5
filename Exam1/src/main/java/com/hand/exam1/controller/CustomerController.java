package com.hand.exam1.controller;

import com.hand.exam1.model.Address;
import com.hand.exam1.model.Customer;
import com.hand.exam1.service.AddressService;
import com.hand.exam1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    @Autowired
    @Qualifier(value = "addressService")
    private AddressService addressService;
    @Autowired
    @Qualifier(value = "customerService")
    private CustomerService customerService;

    @RequestMapping(value = "/insert")
    public String submit(String firstName , String lastName , String  email , String addressId , Model model){
        Customer customer  = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        int addressIds = Integer.parseInt(addressId);
        customer.setAddressId(addressIds);
        Address address = addressService.selectByAddressId(addressIds);
        if(address != null){
            customerService.insert(customer);
            Customer customer1 = customerService.selectById(customerService.selectId());
            customer1.setAddress(address.getAddress());
            model.addAttribute("customer",customer1);
            return "info";
        }else {
            return "error";
        }
    }


    public AddressService getAddressService() {
        return addressService;
    }

    public void setAddressService(AddressService addressService) {
        this.addressService = addressService;
    }

    public CustomerService getCustomerService() {
        return customerService;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }
}
