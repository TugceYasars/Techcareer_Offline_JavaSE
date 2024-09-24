package org.example;


public class _5_DataTypesWrapper{
    public static void main(String[] args) {
/*
        //Tam sayılar
        //Wrapper
        Byte b1=127;
        byte bytePrimitive=1;
        Byte b2=new Byte(bytePrimitive);
        System.out.println(b2);
        Short s1=32767;
        Integer i1=2147483647;
        Integer i2=new Integer(41);
        Long l1=32768L;


        Float f2=14.53;
        Double d2=14.53;

        //boolean

        Boolean b3=true;
        boolean b3Data=3>1;

        //char
        Character c3='a';
        System.out.println(c3);
*/

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("kadir");
        Boolean b3 = new Boolean("tRue");
        Boolean b4 = new Boolean("tRUe");
        Boolean b5 = new Boolean("FalSe");
        System.out.println("---Boolean---");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);

        //Boxing Primitive bir türü wrappera çevirmek
        int primitiveNumber=44;
        Integer wrapperNumber=primitiveNumber;


    }

}

