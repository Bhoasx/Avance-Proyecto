package Estructura;

import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class ColaPrio extends Exception{
    private PriorityQueue<> colaprio;

    public ColaPrio(Comparator<> comparator) {
        colaprio = new PriorityQueue<>(comparator);
    }

    public void add( ) {
        colaprio.add();
    }

    public void pop() throws Exception{
        if (.isEmpty()) {
            throw new IllegalStateException("La cola de prioridad está vacía.");
        }
        return colaprio.poll();
    }




}
