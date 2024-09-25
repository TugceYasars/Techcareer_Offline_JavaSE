package org.example;

import javax.swing.text.StringContent;

public class _14_StringBuilder {
    public static void main(String[] args) {

        String tech1="java",tech2="jsp",tech3="servlet";

//      + opperant

        String allData= tech1+tech2+tech3;
        System.out.println(allData);

//        string concat

        String concatString = tech1+tech2+tech3;
        System.out.println(concatString);

//        StringBuilder

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(tech1).append(tech2).append(tech3);
        String toChange=stringBuilder.toString();
        System.out.println(toChange);




   }
}
