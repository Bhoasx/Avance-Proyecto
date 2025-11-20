package Negocio;

public class Diagnostico {
    private int idDiagnostico;
    private String fechaDiagnostico;
    private String enfermedadDetectada; //Si existe
    private String nivelAfectacion;

    public Diagnostico(int idDiagnostico, String fechaDiagnostico, String enfermedadDetectada, String nivelAfectacion) {
        this.idDiagnostico = idDiagnostico;
        this.fechaDiagnostico = fechaDiagnostico;
        this.enfermedadDetectada = enfermedadDetectada;
        this.nivelAfectacion = nivelAfectacion;
    }

    public int getIdDiagnostico() {
        return idDiagnostico;
    }
    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public String getFechaDiagnostico() {
        return fechaDiagnostico;
    }
    public void setFechaDiagnostico(String fechaDiagnostico) {
        this.fechaDiagnostico = fechaDiagnostico;
    }

    public String getEnfermedadDetectada() {
        return enfermedadDetectada;
    }
    public void setEnfermedadDetectada(String enfermedadDetectada) {
        this.enfermedadDetectada = enfermedadDetectada;
    }

    public String getNivelAfectacion() {
        return nivelAfectacion;
    }
    public void setNivelAfectacion(String nivelAfectacion) {
        this.nivelAfectacion = nivelAfectacion;
    }

    @Override
    public String toString() {
        return "Diagnostico " +
                "idDiagnostico= "       + idDiagnostico         + "\n" +
                "fechaDiagnostico= "    + fechaDiagnostico      + "\n" +
                "enfermedadDetectada= " + enfermedadDetectada   + "\n" +
                "nivelAfectacion= "     + nivelAfectacion ;
    }
}
