package com.company;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


    public class DataCollection {

        public static String ingreso()  {
           int i=0,j=0;
           long dato = 0; ;
            String cadena = "";

            while (j != 16) {

               j=0;
               System.out.print(" Por favor ingrese el numero de su targeta:  ");

               try {
                   Scanner entrada = new Scanner(System.in);

                   cadena = entrada.nextLine();

                 // dato = int.parseInt(cadena);
                    dato = Long.parseLong(cadena);


               } catch (Exception e) {
                   System.out.println("****    por favor ingrese un numero valido  :(    ****");
                   Main.llamarMetodos();
               }

               while (dato != 0){
                 dato = dato/10;
                   j++;
               }
               if(j != 16)
               {
                   System.out.print("***    Por favor ingrese 16 numeros exactamente:   ****");
               }
           }
            System.out.println("****************************************");

            return cadena;
        }
    }







