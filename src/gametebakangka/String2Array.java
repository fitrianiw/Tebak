package gametebakangka;

import java.util.Arrays;

public class String2Array {
    public static void main(String[] args) {
       String artis = "Chelsea Islan";
       artis = artis.toUpperCase();// Jadi huruf kapital semua
       char[] hurufMall = artis.toCharArray(); //string jd array char
        for (int i = 0; i < hurufMall.length; i++) {
            char c = hurufMall[i];
            System.out.print(c + ",");
        }
        
        Arrays.sort(hurufMall); //array char diurutkan dari A-Z
        for (int i = 0; i < hurufMall.length; i++) {
            char c = hurufMall[i];
            System.out.println(c + ",");
        }
        
        //array char dikembalikan jd string
        String kataAcak = new String(hurufMall);
        System.out.println("Kata baru : " + kataAcak);
    }
    
}
