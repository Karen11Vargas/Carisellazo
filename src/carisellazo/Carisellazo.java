package carisellazo;

import java.util.Scanner;

/**
 *
 * @author Karen Vargas
 */
public class Carisellazo {

    public static void main(String[] args) {

        //Definir Variables
        int rondas = 0, total_apuesta = 0, apuesta, continuar = 0, opcion, maquina;
        String nombre;

        //Scanner
        Scanner leer = new Scanner(System.in);

        //Títulos Iniciales
        System.out.println("////////-------JUEGO DEL CARISELLAZO--------///////");
        System.out.println("Por favor ingrese su nombre, para empezar :)");
        nombre = leer.next();
        System.out.println("Bienvenid@" + ""+ nombre);
   
        System.out.println("///////-------¡¡¡AHORA SI, A JUGAR!!!-------////////");

        //Ciclo do/while
        do {

            System.out.println(nombre  + "" + ",Por favor ingrese la cantidad que desea apostar");
            apuesta = leer.nextInt();

            //Metodo para que el sistema de un numero aleatorio
            maquina = (int) (Math.random() * 2) + 1;

            System.out.println(nombre  + "" + "Por favor, seleccione:  \n1. Cara \n2. Sello");
            opcion = leer.nextInt();

            System.out.println("********LA MONEDA SE ESTÁ LANZANDO*********");

            System.out.println("*********TAMBORESSSSSSS*********");

            //Resultado de metodo aleatorio
            System.out.println("Y el resultado fue: " + maquina);

            //Condicion
            if (opcion == maquina) {
                //Contador de rondas
                rondas = rondas + 1;
                System.out.println("---- ¡HAS GANADO ESTA RONDA!------");

                //Sumar el valor aposta
                total_apuesta += apuesta + apuesta;
                System.out.println("Has acumulado:"+ "" + total_apuesta);

            } else {
                //Contador de rondas
                rondas = rondas + 1;
                System.out.println("---- ¡HAS PERDIDO ESTA RONDA :(, ÁNIMO!------");

                //Restar el valor de la apuesta
                total_apuesta = total_apuesta - total_apuesta;
                System.out.println("Has perdido tu apuesta:" +" "+ total_apuesta);

            }

            System.out.println("Si deseas continuar digite 1, si desea finalizar el juego digite 2");
            continuar = leer.nextInt();

        } while (continuar != 2);

        System.out.println(nombre  + " "+ "Acumulaste: " + total_apuesta);
        System.out.println("Jugaste: " + rondas + " "+"rondas");

        System.out.println ("/////----------!GRACIAS POR JUGAR!------------//////////");

    }

}
