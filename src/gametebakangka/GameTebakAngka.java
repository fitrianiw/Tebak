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
public class GameTebakAngka {
    public static void main(String[] args) {
        System.out.println("Mulai Permainan Menebak Angka : ");
        int angkaYangDitebak = 0;
        double generateNumber = Math.random() * 100;
        double nilaiAtas = Math.ceil(generateNumber);
        angkaYangDitebak = (int) nilaiAtas;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        String userInput = scan.next();
        int angkaUser = Integer.parseInt(userInput);
        
        //bandingkan angkaUser dan angkaYangDitebak sampai sukses
        
        if(angkaUser==angkaYangDitebak)
            System.out.println("Hebat");
    }
    
}
