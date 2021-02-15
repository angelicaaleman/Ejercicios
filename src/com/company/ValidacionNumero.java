package com.company;

public class ValidacionNumero
{

    public static void validarDatos  ( String cadena) {
        int i = 0;
        System.out.println("El numero de la tarjeta enmascarado es:");
        System.out.print("       ");


        while (i < 15)
        {

            while (i < 4 || i > 11 && i < 16 )
            {

                System.out.print(cadena.charAt(i));

                i++;
            }

                if(i == 4 || i == 8 ) {
                System.out.print(" ");
               }

                 if(i <= 11)
                {
                  System.out.print("X");
                }
                  if(i == 11) {
                  System.out.print(" ");
                  }
                  i++;

        }
        System.out.println(" ");
    }


}
