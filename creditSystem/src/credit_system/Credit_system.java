/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credit_system;

import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author wilson
 */
public class Credit_system {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double credit=2500;
     String n="";
//     System.out.println("WELCOME TO WALLMAT MALL");
        while (! n.equals("n")) {            
            
            
            
            
             double cost=Double.parseDouble(JOptionPane.showInputDialog(null, "Input the cost value:","WELCOME TO WALLMAT MALL ",JOptionPane.DEFAULT_OPTION));
        if (cost<credit) {
            JOptionPane.showMessageDialog(null, "purchse was succesful \n" +"Total cost: "+ cost, "Success", JOptionPane.INFORMATION_MESSAGE);
           
            
        }
        
        else if(cost >credit){
        JOptionPane.showMessageDialog(null,"Sorry you cannot purchase goods worthy such a value on credit");

        }
            try {
               n=JOptionPane.showInputDialog(null, "Press y to re-enter purchase or n to quite.", "Process Failed!!! ", JOptionPane.WARNING_MESSAGE);  
            } catch (HeadlessException e) {
               
            }
       
       
        
        
        

        
    }
    JOptionPane.showMessageDialog(null, "Thank You for purchasing from us");
    
        }
}
