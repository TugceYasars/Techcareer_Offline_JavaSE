package org.example;

public class _9_Cast {
    public static void main(String[] args) {
        //Cast(Dönüşüm)
        float f1=14.53f;
        long l1=444444L;

        int number1=44;
        int number2=16;

        //Sayıyı stringe çevir

        String inToString=String.valueOf(number2);
        String inToString2=Integer.toString(number2);
        System.out.println(inToString);
        System.out.println((number1+number2));
        System.out.println((number1+inToString));

        //Stringi sayıya çevir

        String value="23";
        int stringToInt1=Integer.valueOf(value);
        int stringToInt2=Integer.parseInt(value);
        System.out.println(value+value);
        System.out.println(stringToInt1+stringToInt2);

        //Primitive Types
        int numberPrimitive=15;
        Integer numberWrapeer=numberPrimitive;
        System.out.println(numberWrapeer);

        //Unboxing
        Integer number2Wrapper=20;
        int number2Primitive=number2Wrapper;


    }
}
