package Estructura;

import javax.swing.*;
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
        colaprio.add(new );
    }

    public void pop() {
        if (colaprio.isEmpty()) {
            JOptionPane.showInputDialog("Cola vacia, no se puede eliminar");
            return;
        }
        colaprio.poll();
    }




}
