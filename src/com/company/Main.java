package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
          int opcionSwitch;
          Scanner scanSwitch = new Scanner(System.in);

          do
          {
              System.out.println("Ingrese el numero del ejercicio que desee ejecutar ");
              System.out.println("1)Rectangulo. ");
              System.out.println("2)Empleado. ");
              System.out.println("3)Item de venta. ");
              System.out.println("4)Cuenta de banco. ");
              System.out.println("5)Hora. ");
              System.out.println("\n 0)Salir del programa. ");

              opcionSwitch = scanSwitch.nextInt();

              switch (opcionSwitch)
              {
                  case 1:
                      ejercicio1();
                      break;
                  case 2:
                  case 3:
                  case 4:
                  case 5:
                  case 0:
                      System.out.println("Adios !");
                      break;

              }



          }while (opcionSwitch != 0);

    }



    public static void ejercicio1()
    {
        Scanner scannerRec = new Scanner(System.in); //Declaro el scanner a utilizar

        Rectangulo rectanguloPrueba1 = new Rectangulo(); //Declaro el nuevo rectangulo


        System.out.println("Ingrese la altura del rectangulo nuevo");
        double nuevaAltura = scannerRec.nextDouble();
        rectanguloPrueba1.setAlturaRectangulo(nuevaAltura);


        System.out.println("Ingrese el ancho del rectangulo nuevo");
        double nuevoAncho = scannerRec.nextDouble();
        rectanguloPrueba1.setAnchoRectangulo(nuevoAncho);

        System.out.println("Altura -> ["+rectanguloPrueba1.getAlturaRectangulo()+"] \n Ancho ->["+rectanguloPrueba1.getAnchoRectangulo()+

                "]");

        double perimetroRec = rectanguloPrueba1.calcularPerimetroRectangulo();
        double areaRec = rectanguloPrueba1.calcularAreaRectangulo();

        System.out.println("Area -> ["+areaRec+"] \n Perimetro -> ["+perimetroRec+"]");

        Rectangulo rectanguloPrueba2 = new Rectangulo(); //Declaro el  2do nuevo rectangulo(por defecto)

        nuevaAltura = rectanguloPrueba2.getAlturaRectangulo();
        nuevoAncho = rectanguloPrueba2.getAnchoRectangulo();

        System.out.println("[Rectangulo nuevo con valores por defecto]. \n ALTURA ---> " +nuevaAltura+" ANCHO --> " +nuevoAncho);








    }
}


