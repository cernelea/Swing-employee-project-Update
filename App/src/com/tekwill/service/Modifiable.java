package com.tekwill.service;

import com.tekwill.Model.Address;
import com.tekwill.Model.ContactInfo;
import com.tekwill.Model.Employee;
import java.time.LocalDate;
import java.util.Map;

public interface Modifiable {

    Employee createEmployee(Integer key, ContactInfo contact, LocalDate birthday, String job, double salary);

    ContactInfo create(String name, String phoneNumber, Address adress);
    
    Integer getKey(Employee employee);

    Address create(String country, String postCode, String street);

    Employee find(int key);

    Employee find(String name);

    Employee update(int key, String name);

    Employee update(int key, String counry, String postcode, String street);

    void delete(int key);

    void delete(String name);

    void showEmployeeMap();

    Map<Integer, Employee> getEmployeeMap();

}
