package Interfaz;

import javax.swing.*;

public class Ventana {
    private JPanel Ventana;
    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane2;
    private JTextField txtingresarparcela;
    private JSpinner spinubicacionX;
    private JSpinner spinubicacionY;
    private JTextField txtingrsarareaparcela;
    private JButton btnIngresarParcela;
    private JTextField textField1;
    private JButton btnEliminarParcela;
    private JTabbedPane tabbedPane3;
    private JTextField txtingresaridcultivo;
    private JTextField txtingresartipocultivo;
    private JButton btnIngresarCultivo;
    private JTextField txtSembrarCosecharcultivo;
    private JButton btnSembrarCultivo;
    private JTextField txtIngresarfechasiembra;
    private JTextField txtfechacosecha;
    private JButton btnEliminarCultivo;
    private JTextField txtEliminarCultivo;
    private JTabbedPane tabbedPane4;

    public Ventana(){}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().Ventana);
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
