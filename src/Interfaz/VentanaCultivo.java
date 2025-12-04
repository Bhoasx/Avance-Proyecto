package Interfaz;

import Estructura.ColaPrioCultivo;

import javax.swing.*;

public class VentanaCultivo {
    private JPanel ventanaCultivo;

    ColaPrioCultivo cultivos = new ColaPrioCultivo();



    public VentanaCultivo() {
        JFrame frame = new JFrame("VentanaCultivo");
        frame.setContentPane(this.ventanaCultivo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}