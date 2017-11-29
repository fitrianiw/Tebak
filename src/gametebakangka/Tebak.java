package gametebakangka;

import java.util.Arrays;
import java.util.Scanner;

public class Tebak {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in); //bikin scanner
        int x = (int) Math.floor(Math.random() * 10),countCoba=1; //insialisasi 
        String[] namaNamaa = {"Angelina Setiawati", "Demi Moore", "Dewi Sandra", "Chelsea Islan", "Raisa Andrew",
            "Sheina", "Titik Puspa", "Titik Sandora", "Rosa", "Belarusia"}; //isi array
        String soal1 = namaNamaa[x]; //soal yang sebenarnya
        String soal2 = soal1.toUpperCase(); //soal di jadikan huruf kapital
        char[] arrNama = soal2.toCharArray(); // dijadiin array
        Arrays.sort(arrNama); //array diurutin
        String soalNama = new String(arrNama), jwbn = ""; //variable penampung
        System.out.println("Soal = " +soalNama); //print soal
        System.out.println("_________________________"); //print
        System.out.print("Masukan Kata : "); //print 
        jwbn=inpt.nextLine(); //nampung inputan jawaban
        
        while(!(soal1.equalsIgnoreCase(jwbn))) //perbandingan kondisi (harus false utk jlnin statement)
        {
            System.out.print("Maaf Anda Salah :( \nMasukan Kata : "); //print
            jwbn=inpt.nextLine(); //nampung inputan
            countCoba++; //increment
        }
        if(jwbn.equalsIgnoreCase(soal1)) //kondisi
        {
            System.out.print("Jawaban Anda Benar \n Soal adalah "+soal1+"\n Anda mencoba sebanyak "+countCoba+" x"); //print
        }
    }
    
}
