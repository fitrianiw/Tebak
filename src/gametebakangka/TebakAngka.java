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
public class TebakAngka {
    public static void main(String[] args) {
        Scanner bc = new Scanner (System.in);
        int soal = (int) Math.ceil(Math.random() * 100);
        int tebak, coTbk = 1;
        System.out.println("Coba Masukkan Angka : ");
        tebak = bc.nextInt();
        
        while ( tebak != soal){
            if( tebak < soal ){
                System.out.println("Nilai lebih kecil dari soal \n Masukkan angka : ");
                tebak = bc.nextInt();
                coTbk++;
            }
            else if ( tebak > soal ){
                System.out.println("Nilai lebih besar dari soal \n suksesss ");
                tebak = bc.nextInt();
                coTbk++;
            }
        }
    }
    
}
