/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrofinder;
import java.util.Scanner;
/**
 *
 * @author sahil
 */
public class Metrofinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        databse db = new databse();
        
        System.out.println("enter destination station");
         Scanner sc=new Scanner(System.in);
        String destination_st = sc.nextLine();
        double cost=  Util.showfare(destination_st, db.getD());//destination_details.fare(destination_st, d);
        System.out.print(cost);
		
        
    
}}
