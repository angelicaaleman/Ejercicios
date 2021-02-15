package com.company;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {

    public static void main(String[] args) {


        llamarMetodos();

    }

    public static void llamarMetodos()
        {
            String cadena ="";



                 cadena = DataCollection.ingreso();

              condicional(cadena);


        }
        public static void condicional  (String cadena) {

            int respuesta2 = 0;
            while (respuesta2 != 3) {
                try {
                int respuesta = 0;



                    System.out.println("Si desea usar el programa con ciclos digite 1");
                    System.out.println("Si desea usar el programa con subString digite otro numero");
                    Scanner entrada = new Scanner(System.in);
                    respuesta = entrada.nextInt();



                    if (respuesta == 1) {

                        ValidacionNumero.validarDatos(cadena);
                    }

                    else {
                        Banco2.substring(cadena);
                    }


                   while (respuesta2 != 1 || respuesta2 != 3){
                       System.out.println("***   Si desea continuar marque 1 ***");

                       System.out.println(" ***  Si desea salir digite 3  ***");

                       respuesta2 = entrada.nextInt();
                    if(respuesta2 == 1)
                    {
                        System.out.println("***   Si desea ingresar una nueva  tarjeta marque 1 ***");
                        System.out.println("***   Si desea validar por otro metodo la misma tarjeta marque 2 ***");
                        respuesta2 = entrada.nextInt();
                        if(respuesta2 ==1)
                        {
                            llamarMetodos();
                        }else
                            {
                            condicional(cadena);
                        }
                    }
                    if(respuesta2 == 3)
                    {
                        System.out.println(" ****   Vuelva Pronto :(   **** ");
                        System.exit(0);

                    }
                   }

                }

                catch(InputMismatchException ex){
                   System.out.println(" por favor digite un numero valido" );
                }



            }

        }
}
