package com.company;

public class Empleado
{
    private int dniEmpleado;
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private int salarioEmpleado;

    public int getDniEmpleado() {
        return dniEmpleado;
    }

    public void setDniEmpleado(int dniEmpleado) {
        this.dniEmpleado = dniEmpleado;
    }



    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }



    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }



    public int getSalarioEmpleado() {
        return salarioEmpleado;
    }

    public void setSalarioEmpleado(int salarioEmpleado) {
        this.salarioEmpleado = salarioEmpleado;
    }


    //Metodos/////////////////////////////

    int salarioAnual()
    {
        return (this.salarioEmpleado * 12);
    }

    void aumentarSalarioPorcentualmente(int porcentaje)
    {
        this.salarioEmpleado = (this.salarioEmpleado) + (this.salarioEmpleado * porcentaje / 100);
    }

    void mostrarDatosEmpleado ()//Empleado empleadoMostrado
    {
        System.out.println("Empleado:["+this.nombreEmpleado +" " +this.apellidoEmpleado+ "] ");
        System.out.println("Dni: ["+this.dniEmpleado+"] Salario: [" +this.salarioEmpleado+"] \n");
    }

}
