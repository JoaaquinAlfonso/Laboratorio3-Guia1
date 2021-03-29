package com.company;
import java.util.Scanner;

public class cuentaDeBanco {

    private int idUsuario;
    private String apellidoUsuario;
    private String nombreUsuario;
    private double balanceUsuario;


    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario() {

        this.idUsuario = this.idRandom();
    }


    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }


    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }


    public double getBalanceUsuario() {
        return balanceUsuario;
    }

    public void setBalanceUsuario(double balanceUsuario) {
        this.balanceUsuario = balanceUsuario;
    }

    //Métodos///////////////////////////////////

    int idRandom()
    {
        int numeroRandom = (int) (Math.random() * 11); //Genera un nro. random entre el 0 y el 10

        return numeroRandom; //lo retorno

    }

    double depositarDinero()
    {
        Scanner scanDepo = new Scanner(System.in);
        double montoDepositado;
        char control = 's';

        do
         {

            System.out.println("¿ Que monto desea depositar en su cuenta ?");
            System.out.print("Ingrese aqui: ");
            montoDepositado = scanDepo.nextDouble();

            if (montoDepositado <= 0)
            {
                System.out.println("Ese monto no es valido ");
            }
            else
            {
                this.setBalanceUsuario(this.balanceUsuario + montoDepositado);
                System.out.println("Depositado con exito. \n ¿ Desea hacer otro deposito ? s/n");
                control = scanDepo.next().charAt(0);

            }

             /* System("cls"); */


        }while (montoDepositado <= 0 && control == 's');

            return this.balanceUsuario; //No uso el getBalance porque estoy dentro de la clase.
    }

    double retirarDinero ()
    {
        Scanner scanRetirar = new Scanner(System.in);
        double montoRetirado;
        char control = 's';

        do
        {
            System.out.println("¿ Que monto desea retirar en su cuenta ?");
            System.out.print("Ingrese aqui: ");
            montoRetirado = scanRetirar.nextDouble();

            if (montoRetirado > this.balanceUsuario || montoRetirado < 0)
            {
                System.out.println("No posee suficiente saldo en su cuenta o ha ingresado un monto negativo");
            }
            else
            {
                this.balanceUsuario = (this.balanceUsuario - montoRetirado);
                System.out.println("$"+montoRetirado + " retirado con exito \n ¿ Quiere retirar dinero nuevamente ? s/n ");
                control = scanRetirar.next().charAt(0);

            }


        }while (montoRetirado <= this.balanceUsuario && control == 's');

        
        return this.balanceUsuario;
    }


    void observarCuenta()
    {
        System.out.println("============================ \n");

        System.out.println("ID Cuenta: "+this.idUsuario);
        System.out.println("Apellido: "+this.apellidoUsuario);
        System.out.println("Nombre: "+this.nombreUsuario);
        System.out.println("Balance: $"+this.balanceUsuario+"\n");

        System.out.println("============================ \n");

    }




}
