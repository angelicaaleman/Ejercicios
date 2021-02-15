package com.company;

public class Banco2 {

    public static void substring(String cadena)
    {


       String subcadena1= cadena.substring(0,4);
       String subcadena2= cadena.substring(12,16);
        System.out.println("El numero de la targeta enmascarado es:");
        System.out.print("       ");
       System.out.println(subcadena1 +" XXXX XXXX "+subcadena2);


    }



}
