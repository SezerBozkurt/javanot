
package com.mycompany.notortalamasi;

import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int matematik, tarih, fizik, kimya, turkce, muzik;
        System.out.println("Matematik notunuz: ");
        matematik = s.nextInt();
        System.out.println("Tarih notunuz: ");
        tarih = s.nextInt();
        System.out.println("Fizik notunuz: ");
        fizik = s.nextInt();
        System.out.println("Kimya notunuz: ");
        kimya = s.nextInt();
        System.out.println("Turkce notunuz: ");
        turkce = s.nextInt();
        System.out.println("Muzik notunuz: ");
        muzik = s.nextInt();
        
        int toplam = (matematik+tarih+fizik+kimya+turkce+muzik);
        double sonuc= (toplam)/6;
        
        String gectiMi = (sonuc >=60) ? "Sınıfı Gecti":"Sınıfta Kaldı";
        System.out.println(gecti);
    }
}
