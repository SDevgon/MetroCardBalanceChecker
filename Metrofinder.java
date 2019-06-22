/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrofinder;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;  
import java.util.ArrayList;


public class Metrofinder {

    /**
     * @param args the command line arguments
     */
   // public static void main(String[] args) {
       public static void find(int thresh , String cardno, int balance) {
        databse db = new databse();
        System.out.println("Set Threshold Balance Value ");
        Scanner s = new Scanner(System.in); 
        int threshold = s.nextInt();
         ArrayList<person> person_details = new ArrayList<person>();
        person p1=  new person();
        System.out.println("enter metro card number");     //enter metrocard no
        Scanner sf=new Scanner(System.in);
        //String cardno = sf.nextLine();
        p1.setCardNo(cardno);
        
        System.out.println("enter card balance");     //enter metrocard no
        Scanner sj=new Scanner(System.in);
       // int balance = sj.nextInt();
        p1.setBalance(balance);
        person_details.add(p1);
        
        person.printPersonalDetails(person_details);
        //File file = new File("file.java");
        
        
        while(true)
        {
            
          System.out.println("enter destination station");
          Scanner sc=new Scanner(System.in);
          String destination_st = sc.nextLine();
          
          System.out.println("enter source station");
          Scanner st=new Scanner(System.in);
          String source_st = st.nextLine();
          int cost=  Util.showfare(destination_st,source_st, db.getD());//destination_details.fare(destination_st, d);
          
           //Initial balance is already set assuming previously entered
          int remainBalance=p1.available_balance(p1.getBalance(), cost);
          //p1.getPersonal_Details();
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
