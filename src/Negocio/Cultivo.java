package Negocio;

public class Cultivo {
    private int idCultivo;
    private String tipoCultivo;
    private String fechaSiembra;
    private String fechaCultivo;

    public Cultivo(int idCultivo, String tipoCultivo, String fechaSiembra, String fechaCultivo) {
        this.idCultivo = idCultivo;
        this.tipoCultivo = tipoCultivo;
        this.fechaSiembra = fechaSiembra;
        this.fechaCultivo = fechaCultivo;
    }

    public int getIdCultivo() {
        return idCultivo;
    }
    public void setIdCultivo(int idCultivo) {
        this.idCultivo = idCultivo;
    }

    public String getTipoCultivo() {
        return tipoCultivo;
    }
    public void setTipoCultivo(String tipoCultivo) {
        this.tipoCultivo = tipoCultivo;
    }

    public String getFechaSiembra() {
        return fechaSiembra;
    }
    public void setFechaSiembra(String fechaSiembra) {
        this.fechaSiembra = fechaSiembra;
    }

    public String getFechaCultivo() {
        return fechaCultivo;
    }
    public void setFechaCultivo(String fechaCultivo) {
        this.fechaCultivo = fechaCultivo;
    }

    @Override
    public String toString() {
        return "Cultivo " +
                "idCultivo= "       + idCultivo     + "\n" +
                "tipoCultivo= "     + tipoCultivo   + "\n" +
                "fechaSiembra= "    + fechaSiembra  + "\n" +
                "fechaCultivo= "    + fechaCultivo;
    }
}