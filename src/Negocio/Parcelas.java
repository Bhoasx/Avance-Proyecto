package Negocio;

import java.lang.reflect.Array;

public class Parcelas {
    private int idParcela;
    private String nombreParcela;
    private float areaParcela;
    private Array ubicacionParcela;

    public Parcelas(int idParcela, String nombreParcela, float areaParcela, Array ubicacionParcela) {
        this.idParcela = idParcela;
        this.nombreParcela = nombreParcela;
        this.areaParcela = areaParcela;
        this.ubicacionParcela = ubicacionParcela;
    }

    public int getIdParcela() {
        return idParcela;
    }
    public void setIdParcela(int idParcela) {
        this.idParcela = idParcela;
    }

    public String getNombreParcela() {
        return nombreParcela;
    }
    public void setNombreParcela(String nombreParcela) {
        this.nombreParcela = nombreParcela;
    }

    public float getAreaParcela() {
        return areaParcela;
    }
    public void setAreaParcela(float areaParcela) {
        this.areaParcela = areaParcela;
    }

    public Array getUbicacionParcela() {
        return ubicacionParcela;
    }
    public void setUbicacionParcela(Array ubicacionParcela) {
        this.ubicacionParcela = ubicacionParcela;
    }

    @Override
    public String toString() {
        return "Parcelas  " +
                "idParcela= "        + idParcela        + "\n" +
                "nombreParcela= "    + nombreParcela    + "\n" +
                "areaParcela= "      + areaParcela      + "\n" +
                "ubicacionParcela= " + ubicacionParcela;
    }
}
