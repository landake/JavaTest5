package com.hand.exam1.controller;

import com.hand.exam1.model.Customer;
import com.hand.exam1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class IndexController {

    @Autowired
    CustomerService customerService;
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<Customer> login(@RequestBody Map<String,Object> params) {
        String name = params.get("name").toString();
        String password = params.get("password").toString();
        List<Customer> customers =  customerService.findCustomerByName(name, password);
        if (customers.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Customer>(customers.get(0), HttpStatus.OK);
    }
}