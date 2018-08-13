package com.tekwill.Model;

import java.time.LocalDate;
import java.util.Date;

public class Employee {

    private ContactInfo contact;
    private String job;
    private double salary;
    private LocalDate birthday;

    public Employee(ContactInfo contact, LocalDate birthday, String job, double salary) {
        this.contact = contact;
        this.job = job;
        this.salary = salary;
        this.birthday = birthday;

    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public ContactInfo getContact() {
        return contact;
    }

    public void setContact(ContactInfo contact) {
        this.contact = contact;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return contact.toString() + "\nBirthday: " + this.birthday + "\nJob: " + this.job + "\nSalary: " + this.salary;

    }

}
