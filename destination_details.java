/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrofinder;


public class destination_details {
    
    String dest_name;
    String source_name;
    int fare;
     String get_dest_name() {
        return dest_name; 
         
    }
     String get_source_name() {
        return source_name; 
         
    }
    int get_fare() {
        return fare;
    }
    void set_dest_name(String dname) {
        dest_name=dname;
    }
    void set_source_name(String sname) {
        source_name=sname;
    }
    void set_fare(int price) {
        fare=price;
    }
    static int fare(String dname,String sname, destination_details d[])
    {
        for(int i=0;i<d.length;i++)
        {
           
            if(d[i].get_dest_name().equalsIgnoreCase( dname.trim())&& d[i].get_source_name().equalsIgnoreCase( sname.trim())){ 
               
                return( d[i].get_fare() );
               
            }
        }    
          System.out.println("Data Doesnt exist, add data Y/N");
          
          return 0;        
    
    }
    
}