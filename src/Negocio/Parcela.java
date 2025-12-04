package Negocio;

import Estructura.ColaPrioCultivo;
import Negocio.Cultivo;

public class Parcela implements Comparable<Parcela>{
    private static int numeroDeParcela;
    private int idParcela;
    private String nombreParcela;
    private String ubicacionParcela;
    //Donde x es el ancho y y la antura
    private double[] dimensionesParcela =  new double[2];
    //Lista Cultivos
    ColaPrioCultivo cultivos;


    public Parcela(String nombreParcela, String ubicacionParcela, double x, double y) {
        this.idParcela = ++numeroDeParcela;
        this.nombreParcela = nombreParcela;
        this.ubicacionParcela = ubicacionParcela;
        this.dimensionesParcela[0] = x;
        this.dimensionesParcela[1] = y;
        this.cultivos = new ColaPrioCultivo();
    }



    public static int getNumeroDeParcela() {
        return numeroDeParcela;
    }

    public static void setNumeroDeParcela(int numeroDeParcela) {
        Parcela.numeroDeParcela = numeroDeParcela;
    }

    public int getIdParcela() {
        return idParcela;
    }

    public String getNombreParcela() {
        return nombreParcela;
    }

    public void setNombreParcela(String nombreParcela) {
        this.nombreParcela = nombreParcela;
    }

    public double getDimensionesParcelaX() {
        return dimensionesParcela[0];
    }

    public double getDimensionesParcelaY() {
        return dimensionesParcela[1];
    }

    public void setDimensionesParcelaX(double x) {
        this.dimensionesParcela[0] = x;
    }

    public void setDimensionesParcelaY(double y) {
        this.dimensionesParcela[1] = y;
    }

    public String getUbicacionParcela() {
        return ubicacionParcela;
    }

    public void setUbicacionParcela(String ubicacionParcela) {
        this.ubicacionParcela = ubicacionParcela;
    }

    @Override
    public String toString() {
        return "Parcela  "             +   idParcela               +
                "\nNombre Parcela: "    + nombreParcela           +
                "\nArea Parcela: "      + dimensionesParcela[0] + " x " + dimensionesParcela[1] + " m2" +
                "\nUbicacion Parcela: " + ubicacionParcela        +
                "\n\n";
    }
    public int compareTo(Parcela p) {
        return Double.compare(this.idParcela, p.idParcela);
    }
}