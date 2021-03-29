package com.company;

public class itemDeVenta
{

    private int idItem;
    private String descripcionItem;
    private int cantidadItem;
    private float precioUnitItem;
    private float precioTotal;

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {

        this.idItem = idItem;
    }


    public String getDescripcionItem() {
        return descripcionItem;
    }

    public void setDescripcionItem(String descripcionItem) {
        this.descripcionItem = descripcionItem;
    }



    public int getCantidadItem() {
        return cantidadItem;
    }

    public void setCantidadItem(int cantidadItem) {
        this.cantidadItem = cantidadItem;
    }



    public float getPrecioUnitItem() {
        return precioUnitItem;
    }

    public void setPrecioUnitItem(float precioUnitItem) {
        this.precioUnitItem = precioUnitItem;
    }



    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal() {
        this.precioTotal = calcularPrecioTotal();
    }


    //Métodos////////////////////////////////////////////////////////////////

    float calcularPrecioTotal()
    {
        return this.cantidadItem * this.precioUnitItem;
    }

    void verItem()
    {
        System.out.println("ItemVenta[ID: "+this.idItem+"| Descripción: "+this.descripcionItem+"| Cantidad: "+this.cantidadItem+"| pUnitario: $"+this.precioUnitItem+"| pTotal: $"+this.precioTotal);
    }




}
