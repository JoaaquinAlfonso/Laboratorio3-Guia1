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
                      ejercicio2();
                      break;
                  case 3:
                      ejercicio3();
                      break;
                  case 4:
                      ejercicio4();
                      break;
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

    public static void ejercicio2()

    {
        //Scanner scanEmpleado = new Scanner(System.in);

        Empleado empleado1= new Empleado(); //Creo el 1er empleado

        empleado1.setApellidoEmpleado("Gutierrez");
        empleado1.setNombreEmpleado("Carlos");
        empleado1.setDniEmpleado(23456345);      //Le asigno los datos pertinentes
        empleado1.setSalarioEmpleado(25000);


        Empleado empleado2= new Empleado(); //Creo el 2do empleado

        empleado2.setApellidoEmpleado("Sanchez");
        empleado2.setNombreEmpleado("Ana");
        empleado2.setDniEmpleado(34234123);            //Le asigno los datos pertinentes
        empleado2.setSalarioEmpleado(27500);

        empleado1.mostrarDatosEmpleado(); //Muestro los empleados
        empleado2.mostrarDatosEmpleado(); //Muestro los empleados

        int salarioAnual = empleado1.salarioAnual(); //Variable donde almaceno el salario anual (previo a aumentar)

        System.out.println("Salario anual previo al aumento "+ salarioAnual);


        empleado1.aumentarSalarioPorcentualmente(15); //Le envío el porcentaje a aumentar (15%)

        empleado1.mostrarDatosEmpleado(); //Lo muestro actualizado

        salarioAnual = empleado1.salarioAnual(); //Guardo el nuevo salario anual aumentado

        System.out.println("Salario anual "+salarioAnual); //Muestreo

    }


    public static void ejercicio3()
    {
        itemDeVenta itemNuevo = new itemDeVenta(); //Instancio el objeto en "itemNuevo"

        itemNuevo.setCantidadItem(13);
        itemNuevo.setDescripcionItem("Cortina de baño 2 x 3 mts");
        itemNuevo.setIdItem(77851);                                    //Le asigno datos pertinentes
        itemNuevo.setPrecioUnitItem(350);
        itemNuevo.setPrecioTotal(); //Calculado como precio unitario * cantidad

        itemNuevo.verItem(); //Muestro el item


    }


    public static void ejercicio4()
    {
        //Scanner scanDatos = new Scanner(System.in);
        cuentaDeBanco cuentaPrueba = new cuentaDeBanco();

        cuentaPrueba.setBalanceUsuario(15000);
        cuentaPrueba.setIdUsuario();
        cuentaPrueba.setNombreUsuario("Joaquin");
        cuentaPrueba.setApellidoUsuario("Alfonso");

        cuentaPrueba.observarCuenta();

        cuentaPrueba.depositarDinero();

        cuentaPrueba.observarCuenta();


        cuentaPrueba.retirarDinero();

        cuentaPrueba.observarCuenta();





    }
}


