package org.example;


import javax.swing.*;

public class _8_JOptionalPane {
    public static void main(String[] args) {
        System.out.println("JOptionalPane ");
        //Ekran Çıktısı
        JOptionPane.showMessageDialog(null, "Nasılsıız");

        //Kullanıcıdan veri almak
        String name = JOptionPane.showInputDialog("Lütfen isminizi giriniz");
        JOptionPane.showMessageDialog(null, "Adınız: " + name);



    }
}
