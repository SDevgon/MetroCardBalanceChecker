/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrofinder;


public class person {
     double balance;
     String name;
     double available;

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double available_balance(double balance, double cost)
    {   
        double availablebalance=balance-cost;
        this.balance=availablebalance;
        return availablebalance;
    
    }
}