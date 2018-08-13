/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tekwill.service;

import com.tekwill.Model.Address;
import com.tekwill.Model.ContactInfo;
import com.tekwill.Model.Employee;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Service implements Modifiable {

    private Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

    @Override
    public Employee createEmployee(Integer key, ContactInfo contact, LocalDate birthday, String job, double salary) {

        Employee employee = new Employee(contact, birthday, job, salary);
        employeeMap.put(key, employee);
        return employee;

    }

    public Integer getKey(Employee employee) {
        Set<Entry<Integer, Employee>> entries = employeeMap.entrySet();
        for (Entry<Integer, Employee> entry : entries) {
            Employee employee2 = entry.getValue();
            Integer key = entry.getKey();
            if (employee2.equals(employee)) {

                return key;
            }

        }
        return null;

    }

    public Map<Integer, Employee> getEmployeeMap() {
        return employeeMap;

    }

    @Override
    public ContactInfo create(String name, String phoneNumber, Address address) {
        if (name != null && phoneNumber != null && address != null) {

            ContactInfo contact = new ContactInfo(name, phoneNumber, address);
            return contact;

        }

        return null;

    }

    @Override
    public Address create(String country, String postCode, String street) {
        if (country != null && postCode != null && street != null) {

            Address address = new Address(country, postCode, street);
            return address;
        }

        return null;
    }

    @Override
    public Employee find(int key) {
        Employee foundByKey = employeeMap.get(key);
        return foundByKey;

    }

    @Override
    public Employee find(String name) {
        Set<Entry<Integer, Employee>> entries = employeeMap.entrySet();
        for (Map.Entry<Integer, Employee> entry : entries) {
            Employee employee = entry.getValue();
            String employeeName = employee.getContact().getName();

            if (employee != null && employeeName.equals(name)) {
                return employee;

            }

        }
        return null;

    }

    @Override
    public Employee update(int key, String name) {
        Employee foundByKey = employeeMap.get(key);
        if (foundByKey != null) {

            foundByKey.getContact().setName(name);

            return foundByKey;

        }

        return null;
    }

    @Override
    public Employee update(int key, String counry, String postcode, String street) {

        Employee foundBykey = employeeMap.get(key);
        if (foundBykey != null) {

            foundBykey.getContact().getAdress().setContry(counry);
            foundBykey.getContact().getAdress().setPostCode(postcode);
            foundBykey.getContact().getAdress().setStreet(street);
            return foundBykey;
        }

        return null;

    }

    @Override
    public void delete(int key) {
        employeeMap.remove(key);

    }

    @Override
    public void delete(String name) {
        Set<Entry<Integer, Employee>> entries = employeeMap.entrySet();
        for (Entry<Integer, Employee> entry : entries) {
            Employee employee = entry.getValue();
            Integer key = entry.getKey();
            String employeeName = employee.getContact().getName();
            if (employee != null && employeeName.equals(name)) {

                employeeMap.remove(key);
                break;

            }

        }

    }

    public void showEmployeeMap() {
        Set<Entry<Integer, Employee>> entries = employeeMap.entrySet();
        for (Entry<Integer, Employee> entry : entries) {

            Employee employee = entry.getValue();
            Integer key = entry.getKey();

            System.out.println(employee);

        }

    }
}
