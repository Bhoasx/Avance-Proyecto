package Interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal {

    private JPanel principalPanel;
    private JButton parcelaButton;
    private JButton cultivosButton;
    private JButton cerrarSesionButton;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    public VentanaPrincipal() {
        JFrame frame = new JFrame("VentanaPrincipal");
        frame.setContentPane(this.principalPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        parcelaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == parcelaButton) {
                    VentanaParcela ventanaParcela = new VentanaParcela();
                    frame.setVisible(false);
                }
            }
        });

        cultivosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == cultivosButton) {
                    VentanaCultivo ventanaCultivo = new VentanaCultivo();
                    frame.setVisible(false);
                }
            }
        });
    }
}
