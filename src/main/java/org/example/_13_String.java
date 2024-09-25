package org.example;

public class _13_String {
    public static void main(String[] args) {
//        String

        String vocabulary = "java ogRENiyorum java ";
        System.out.println(vocabulary);
        System.out.println("Harf sayısı:"+vocabulary.length());
        System.out.println("Traşlanmış:"+vocabulary.trim().length());
        System.out.println("Büyük karakter:"+vocabulary.toUpperCase());
        System.out.println("Küçük karakter:"+vocabulary.toLowerCase());
        System.out.println("Soldan arama:"+vocabulary.indexOf("java"));
        System.out.println("Sağdan arama:"+vocabulary.lastIndexOf("java"));


        System.out.println(vocabulary);
        System.out.println(vocabulary.concat("deneme"));
        vocabulary=vocabulary.concat("deneme");
        System.out.println(vocabulary);

        System.out.println(vocabulary.charAt(1));
        System.out.println(vocabulary.substring(1));
        System.out.println(vocabulary.substring(0,3)); //0<=x<=3-1
        System.out.println(vocabulary.contains("ogRENiyorum"));
        System.out.println(vocabulary.startsWith("java"));
        System.out.println(vocabulary.endsWith("deneme"));
        System.out.println("Eşit mi:"+vocabulary.equals("java ogRENiyorum java deneme"));

        System.out.println(vocabulary.replace(vocabulary, "değişti"));

        String[] allData=vocabulary.split(" ");


   }
}
