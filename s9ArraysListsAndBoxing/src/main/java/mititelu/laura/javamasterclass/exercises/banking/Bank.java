package mititelu.laura.javamasterclass.exercises.banking;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;


    public Bank(String name){
        this.name = name;
        branches = new ArrayList<>();
    }


    private Branch findBranch(String branchName){
        for(Branch branch : branches){
            if(branch.getName().equals(branchName)){
                return  branch;
            }
        }
        return null;
    }

    public boolean addBranch(String branchName){
        Branch branch = findBranch(branchName);
        if(branch == null){
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if(branch == null){
            return false;
        }
        return branch.newCustomer(customerName,transaction);
    }

    public boolean addCustomerTransaction(String branchName, String customerName,  double transaction){
        Branch branch = findBranch(branchName);
        if(branch == null){
            return false;
        }
        Customer customer = branch.findCustomer(customerName);
        if(customer == null){
            return false;
        }
        branch.addCustomerTransaction(customerName,transaction);
        return true;
    }

    public boolean listCustomers(String branchName, boolean isPrintingTransactions){
        Branch branch = findBranch(branchName);
        if(branch == null){
            return false;
        }
        System.out.println("Customer details for branch "+ branchName);
        ArrayList<Customer> customers = branch.getCustomers();
        for(int i = 0; i < customers.size(); i++){
            Customer currentCustomer  = customers.get(i);
            System.out.println("Customer: "+ currentCustomer.getName()+ "[" + i + "]");
            if(isPrintingTransactions){
                System.out.println("Transactions");
                ArrayList<Double> transactions = currentCustomer.getTransactions();
                for(int j = 0; j < transactions.size(); j ++){
                    System.out.printf("[%d] Amount %.2f%n", j, transactions.get(j) );
                }
            }
        }

        return true;
    }

}
