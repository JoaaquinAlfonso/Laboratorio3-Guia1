package com.company;

public class Rectangulo
{
    private  double alturaRectangulo = 1.0;
    private double anchoRectangulo = 1.0;

    public double getAlturaRectangulo()
    {
        return alturaRectangulo;
    }

    public void setAlturaRectangulo(double alturaRectangulo)
    {
        this.alturaRectangulo = alturaRectangulo;
    }



    public double getAnchoRectangulo()
    {
        return anchoRectangulo;
    }

    public void setAnchoRectangulo(double anchoRectangulo)
    {
        this.anchoRectangulo = anchoRectangulo;
    }

    ///Metodos/////////////////////////////////////////////////////////////

    double calcularPerimetroRectangulo()
    {
        return (2 * (this.alturaRectangulo + this.anchoRectangulo));
    }

    double calcularAreaRectangulo()
    {
        return (this.anchoRectangulo * this.alturaRectangulo);
    }


}
