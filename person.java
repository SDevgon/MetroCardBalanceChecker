/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrofinder;
import java.util.*;
import java.io.File;

 import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;  
import java.io.BufferedReader;


public class person {
      int balance;
      String cardno;
     

    public  int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public  String getCardNo() {
        return cardno;
    }

    public void setCardNo(String no) {
        this.cardno = no;
    }
    
    

     
   
public static void printPersonalDetails(ArrayList<person> p)
{
 for(person p1:p)
 {
     System.out.println(p1.balance);
      System.out.println(p1.cardno);
     
    
  
}    
}
    public int available_balance(int balance, int cost)
    {   
        int availablebalance=balance-cost;
        this.balance=availablebalance;
        System.out.println("Remaining Balance ->");
        return availablebalance;
    
    }
}