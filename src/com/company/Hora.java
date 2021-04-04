package com.company;

public class Hora
{
    private int hora;
    private int minutos;
    private int segundos;



    //Constructor////////////////////////////////////////////////////////////
    public Hora(int hora, int minutos, int segundos)
    {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;

    }

    //Métodos/////////////////////////////////////

    public void verLaHora()
    {
        System.out.println("\t[Hora actual]");


        if (this.hora < 10)
        {
            System.out.print("0"+this.hora+":");
        }
        else
            System.out.print(this.hora + ":");

        if (this.minutos < 10)
        {
            System.out.print("0"+this.minutos+":");
        }
        else
            System.out.print(this.minutos + ":");

        if (this.segundos < 10)
        {
            System.out.print("0"+this.segundos+"\n");
        }
        else
            System.out.print(this.segundos+"\n");

    }

    public Hora avanzarUnSegundo()
    {
        System.out.println("Avanzando un segundo...\n\n");
        if (this.segundos == 59)
        {
            this.segundos = 0;

            if (this.minutos == 59)
            {
                this.minutos = 0;

                if (this.hora == 23)
                {
                    this.hora = 0;
                }
                else
                    this.hora = (this.hora) + 1;

            }
            else
                this.minutos = (this.minutos) + 1;

        }
        else
            this.segundos = (this.segundos) + 1;

        return this;
    }

    public Hora retrocederUnSegundo()
    {
        System.out.println("Retrocediendo un segundo...\n\n");

        if (this.segundos == 0)
        {
            this.segundos = 59;

            if (this.minutos == 0)
            {
                this.minutos = 59;

                if (this.hora == 0)
                {
                    this.hora = 23;

                }
                else
                    this.hora = (this.hora) - 1;

            }
            else
                this.minutos = (this.minutos) - 1;


        }
        else
            this.segundos = (this.segundos) - 1;

        return this;
    }






}
