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
public class ternary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // int x;
       //int y = 50;
       //if(y%5==0){
       //     x = 10;
       // } else {
       //     x = 20;
       // }
            
       int y = 57;
       int x = y%5==0? 10 : 20; // ? : ternary operator
       System.out.println("Nilai x = " + x);
    }
    
}
