/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package g.arraylist_demo;

import java.util.ArrayList;

/**
 *
 * @author zafer
 */
public class ArrayList_demo {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "zafer", "erkan"));
        customers.add(new Customer(2, "deneme", "123"));
        customers.add(new Customer(3, "123", "deneme"));
        
        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}
