/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangka;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class TestWhileDo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Angka 10 = ");
        String angka = scan.next();
        int inputAngka = Integer.parseInt(angka);
        System.out.println("Angka yang diinput : " + inputAngka);
        boolean success = false;
        while(!success){
            if(inputAngka==10)
                success = true;
            else {
                System.out.println("Inputkan Angka 10 : ");
                angka = scan.next();
                inputAngka = Integer.parseInt(angka);
            }
        }
    }
    
}
