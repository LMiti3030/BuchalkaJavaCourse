package mititelu.laura.javamasterclass.exercises.banking;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public boolean newCustomer(String customerName, double amount){
        Customer customer = findCustomer(customerName);
        if(customer == null){
            customers.add(new Customer(customerName,amount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer customer = findCustomer(customerName);
        if(customer != null){
           customer.addTransaction(amount);
            return true;
        }
        return false;
    }

    public Customer findCustomer(String customerName){
        for(Customer customer : customers){
            if(customer.getName().equals(customerName)){
                return customer;
            }
        }
        return null;
    }


    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
