package Negocio;

public class Tratamiento {
    private int idTratamiento;
    private String tipoTratamiento;
    private String fechaTratamiento;
    private String productoUtilizado;
    private double dosisAplicada;

    public Tratamiento(int idTratamiento, String tipoTratamiento, String fechaTratamiento, String productoUtilizado, double dosisAplicada) {
        this.idTratamiento = idTratamiento;
        this.tipoTratamiento = tipoTratamiento;
        this.fechaTratamiento = fechaTratamiento;
        this.productoUtilizado = productoUtilizado;
        this.dosisAplicada = dosisAplicada;
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }
    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getTipoTratamiento() {
        return tipoTratamiento;
    }
    public void setTipoTratamiento(String tipoTratamiento) {
        this.tipoTratamiento = tipoTratamiento;
    }

    public String getFechaTratamiento() {
        return fechaTratamiento;
    }
    public void setFechaTratamiento(String fechaTratamiento) {
        this.fechaTratamiento = fechaTratamiento;
    }

    public String getProductoUtilizado() {
        return productoUtilizado;
    }
    public void setProductoUtilizado(String productoUtilizado) {
        this.productoUtilizado = productoUtilizado;
    }

    public double getDosisAplicada() {
        return dosisAplicada;
    }
    public void setDosisAplicada(double dosisAplicada) {
        this.dosisAplicada = dosisAplicada;
    }

    @Override
    public String toString() {
        return "Tratamiento{" +
                "idTratamiento= "       + idTratamiento         + "\n" +
                "tipoTratamiento= "     + tipoTratamiento       + "\n" +
                "fechaTratamiento= "    + fechaTratamiento      + "\n" +
                "productoUtilizado= "   + productoUtilizado     + "\n" +
                "dosisAplicada="        + dosisAplicada ;
    }
}