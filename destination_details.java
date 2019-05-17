/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrofinder;

/**
 *
 * @author sahil
 */
public class destination_details {
    
    String dest_name;
    double fare;
     String get_dest_name() {
        return dest_name; 
         
    }
    Double get_fare() {
        return fare;
    }
    void set_dest_name(String dname) {
        dest_name=dname;
    }
    void set_fare(double price) {
        fare=price;
    }
    static Double fare(String name, destination_details d[]){
        for(int i=0;i<d.length;i++){
            if(d[i].get_dest_name().equalsIgnoreCase( name.trim())){ 
               
                return( d[i].get_fare() );
               
            }
        }    
        
          return -1.0;        
    
    }
}