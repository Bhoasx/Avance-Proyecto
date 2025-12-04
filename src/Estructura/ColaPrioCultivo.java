package Estructura;
import Negocio.Cultivo;

import java.util.*;

public class ColaPrioCultivo {
    private PriorityQueue<Cultivo> colaPrio;

    public PriorityQueue<Cultivo> getColaPrio() {
        return colaPrio;
    }

    public ColaPrioCultivo(){
        colaPrio = new PriorityQueue<>();
    }

    public void encolar (String tipoCultivo){
        colaPrio.offer(new Cultivo(tipoCultivo));
    }

    public String mostrarCultivo() {
        StringBuilder sb = new StringBuilder();
        for (Cultivo c : colaPrio) {
            sb.append(c.toString());
        }
        return sb.toString();
    }

    public Cultivo desencolar(String tipoCultivo) throws Exception {
        if (colaPrio.isEmpty()) throw new Exception("No hay elementos en la cola");
        return colaPrio.poll();
    }

    public List<Cultivo> listarCultivo(){
        return new ArrayList<Cultivo>(colaPrio);
    }

    public Cultivo buscarCultivoBin(int id){
        Cultivo c = null;
        int izq = 0;
        int der = 0;

        while (izq <= id){
            int medio = (izq + der)/2;
            if (colaPrio.size() == id ){
                c = colaPrio.element();

            }
            if (colaPrio.size() < id){}
        }
        return c;
    }
}

/*public static void main(String[] args) {
        ColaPrioCultivo colaprio = new ColaPrioCultivo();
        Scanner sc = new Scanner(System.in);
        int opcion = 1;


        do {
            System.out.println("Ingrese el tipo de cultivo");
            String tipoCultivo = sc.next();

            colaprio.encolar(colaprio.mostrarCultivo());
            colaprio.mostrarCultivo();
            System.out.println(tipoCultivo);
            System.out.println(colaprio.mostrarCultivo());

            System.out.println("Desea repetir el algoritmo:");
            opcion = sc.nextInt();
        } while(opcion == 1);
}*/