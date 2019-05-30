/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrofinder;
import java.util.Scanner;


public class Metrofinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        databse db = new databse();
        System.out.println("Set Threshold Balance Value ");
        Scanner s = new Scanner(System.in); 
        double threshold = s.nextInt();
        person p1=  new person();
        person p2=  new person();
        p1.setName("Sanya");
        p1.setBalance(200);
        while(true)
        {
          System.out.println("enter destination station");
          Scanner sc=new Scanner(System.in);
        
          String destination_st = sc.nextLine();
          double cost=  Util.showfare(destination_st, db.getD());//destination_details.fare(destination_st, d);
          
           //Initial balance is already set assuming previously entered
          double remainBalance=p1.available_balance(p1.getBalance(), cost);
          if(p1.getBalance()>threshold)
           {
              System.out.println(remainBalance);
           }
          else
           { 
              System.out.println("Alert! Recharge Required");
              break;
           }
          System.out.println("Enter details of another journey, Enter 1 if yes,0 for no");
          double status2=sc.nextDouble();
            if(status2==1)
               continue;
            else
                break;
         
          
        }
        
        
        
        
        
        
		
        
    
}}
