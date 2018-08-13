package com.hand.exam1;

import com.hand.exam1.model.Customer;
import com.hand.exam1.service.impl.CustomerServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Exam1Application {

    public static void main(String[] args) {
        SpringApplication.run(Exam1Application.class, args);

        Customer customer = new Customer();
        CustomerServiceImpl customerService=new CustomerServiceImpl();
        Scanner scanner = new Scanner(System.in);

        String username;
        String lastname;
        String email;
        int address_id;
        String create_date;
        int delete_id;

        System.out.println("请输入firstname");
        username = scanner.next();

        System.out.println("请输入lastname");
        lastname = scanner.next();

        System.out.println("请输入email");
        email = scanner.next();

        System.out.println("请输入address_id");
        address_id = scanner.nextInt();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); //设置日期格式
        create_date = df.format(new Date());
        customer.setStoreId(1);
        customer.setFirstName(username);
        customer.setLastName(lastname);
        customer.setEmail(email);
        customer.setAddressId(address_id);

        customer.setCreateDate(create_date);
        customerService.insert(customer);


        System.out.println("请输入要删除的Customer的ID");
        delete_id = scanner.nextInt();
        customerService.deleteCustomer(delete_id);
        System.out.println("你输入的ID已经删除");

    }
}

