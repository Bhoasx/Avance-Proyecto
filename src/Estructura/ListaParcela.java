package Estructura;

import Negocio.Cultivo;
import Negocio.Parcela;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListaParcela {
    private List<Parcela> parcelas;

    //Incicializamos la lista
    public ListaParcela() {
        parcelas = new ArrayList<Parcela>();
    }

    //Tomamos toda la lista
    public List<Parcela> getParcelas() {
        return parcelas;
    }

    //Metodo para adicionar nueva parcela
    public void adicionarParcela(String nombreParcela, String ubicacionParcela, double x, double y) {
        parcelas.add(new Parcela(nombreParcela, ubicacionParcela, x, y));
        Collections.sort(parcelas);
    }


    //Mostrar datos
    public String mostrarDatos() {
        StringBuilder resultado = new StringBuilder();

        for(Parcela p : parcelas) {
            resultado.append(p);
        }
        return String.valueOf(resultado);
    }

    //Buscar Parcela por id
    public Parcela buscarParcela(int idParcela) {
        Parcela resultado = null;
        int left = 0;
        int right = parcelas.size() - 1;

        while(left <= right) {
            int mid = (left + right) / 2;
            if(parcelas.get(mid).getIdParcela() == idParcela) {
                resultado = parcelas.get(mid);
            }
            if(parcelas.get(mid).getIdParcela() < idParcela) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return resultado;
    }

    //Eliminar Parcela
    public void eliminarParcela(Parcela p) {
        parcelas.remove(p);

    }

    public void modificarParcela(Parcela p, String nombre, double x, double y) {
        p.setNombreParcela(nombre);
        p.setDimensionesParcelaX(x);
        p.setDimensionesParcelaY(y);
    }
}
