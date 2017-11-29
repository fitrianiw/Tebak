/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangka;

/**
 *
 * @author user
 */
public class SwitchVariable {
    public static void main(String[] args) {
       int x = 5;
       String nama = "john";
       switch (nama) { //int, byte, short, char
           case "smith" :
               System.out.println("You are not john");
               break;
           case "smuth" :
               System.out.println("welcome john");
               break;
               
           default :
                    break;
       }
    }
    
}
