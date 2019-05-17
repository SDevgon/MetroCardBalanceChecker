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
public class databse {
   destination_details[] d = new destination_details[2];

    public destination_details[] getD() {
        return d;
    }

    public void setD(destination_details[] d) {
        this.d = d;
    }
   
    public databse() {
                 d[0]= new destination_details();
		d[1]= new destination_details();
        d[0].set_dest_name("Rajiv Chowk");
		d[0].set_fare(30);
                
		d[1].set_dest_name("RK Ashram");
		d[1].set_fare(40);
    }
    		

}
