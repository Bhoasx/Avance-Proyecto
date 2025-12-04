package Negocio;

import Negocio.Parcela;
import java.time.LocalDate;

public class Cultivo implements  Comparable<Cultivo>{
    private static int numeroCultivo;
    private int IDcultivo;
    private String tipoCultivo;
    private LocalDate fechaSiembra;
    private LocalDate fechaCultivo;

    public Cultivo(String tipoCultivo) {
        this.IDcultivo = ++numeroCultivo;            //probar con el ++ de otro lado.
        this.tipoCultivo = tipoCultivo;
        fechaSiembra = LocalDate.now();
        fechaCultivo = LocalDate.now();             //reparar para que se ingrese
    }


    @Override
    public String toString() {
        return "  Cultivos "             + IDcultivo  +
                "\nTipo Cultivo: "      + tipoCultivo    +
                "\nFecha Siembra: "     + fechaSiembra   +
                "\nFecha Cosecha: "     + fechaCultivo   +
                "\n\n";
    }

    public int compareTo(Cultivo c) {
        return Integer.compare(this.numeroCultivo , c.numeroCultivo);
    }
}