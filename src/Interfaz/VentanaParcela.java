package Interfaz;


import Estructura.ListaParcela;
import Negocio.Parcela;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaParcela {
    private JPanel Ventana;
    private JTabbedPane parcelaPane;
    private JSpinner xParcelaSpin;
    private JSpinner yParcelaSpin;
    private JButton agregarParcelaButton;
    private JTextArea parcelaArea;
    private JTextField nombreParcelaField;
    private JComboBox ubicacionParcelaCombo;
    private JPanel ingresarParcelaPanel;
    private JLabel areaParcelaLabel;
    private JLabel ubicacionParcelaLabel;
    private JLabel nombreParcelaLabel;
    private JButton buscarParcelaButton;
    private JTextArea buscarParcelaArea;
    private JTextField buscarParcelaField;
    private JLabel buscarParcelaLabel;
    private JButton eliminarParcelaButton;
    private JPanel buscarParcelaPanel;
    private JScrollPane parcelasScroll;
    private JButton ingresarCultivoButton;
    private JTextField nuevoPropietarioField;
    private JSpinner xModificarSpiner;
    private JSpinner yModificarSpiner;
    private JButton modificarButton;
    private JTextArea modificarArea;
    private JPanel modificarPanel;
    private JLabel idModificarLabel;
    private JLabel idBuscadoLabel;
    private JLabel nuevoPropietarioLabel;
    private JLabel dimensionesModificarLabel;
    private JLabel xModificarLabel;
    private JLabel xLabel2;
    private JLabel anchoLabel1;
    private JLabel largoLabel1;
    private JLabel anchoLabel2;
    private JLabel largoLabel2;


    //Lista Parcela
    ListaParcela parcela = new ListaParcela();
    Parcela parcelaEncontrada = null;


    public VentanaParcela(){

        JFrame frame = new JFrame("Ventana");

        //Barra de Menus
        JMenuBar menu = new JMenuBar();
        frame.setJMenuBar(menu);

        //Menu Opciones
        JMenu opciones = new JMenu("Opciones");
        menu.add(opciones);

        //Opciones items
        JMenuItem regresarInicio = new JMenuItem("Regresar al Inicio");
        opciones.add(regresarInicio);

        JMenuItem cerrarSesion = new JMenuItem("Cerrar Sesion");
        opciones.add(cerrarSesion);

        //Como Se va a abrir la ventana
        frame.setContentPane(this.Ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //Opcion Salir
        regresarInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == regresarInicio) {
                    VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
                    frame.setVisible(false);
                }
            }
        });

        //Parcela
        agregarParcelaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource() == agregarParcelaButton) {
                        String nombre = nombreParcelaField.getText();
                        String ubicacion = ubicacionParcelaCombo.getSelectedItem().toString();
                        double x = Double.parseDouble(xParcelaSpin.getValue().toString());
                        double y = Double.parseDouble(yParcelaSpin.getValue().toString());
                        if(nombre.equalsIgnoreCase("") || ubicacion.equalsIgnoreCase("") || x == 0 || y == 0) {
                            JOptionPane.showMessageDialog(null, "Por favor ingresar todos los parametros");
                        } else {

                            parcela.adicionarParcela(nombre, ubicacion, x, y);


                            parcelaArea.setText(parcela.mostrarDatos());
                            borrarDatos();
                        }
                    }
                } catch(Exception r) {
                    JOptionPane.showMessageDialog(null, "Ingrese correctamente los parametros" , "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        //Parcela
        buscarParcelaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(e.getSource() == buscarParcelaButton) {
                        int id = Integer.parseInt(buscarParcelaField.getText());
                        if (buscarParcelaField.getText().equalsIgnoreCase("")) {
                            JOptionPane.showMessageDialog(null, "Debe ingresar un Id para buscar");
                        } else {
                            parcelaEncontrada = parcela.buscarParcela(id);
                            if (parcelaEncontrada != null) {
                                buscarParcelaArea.setText(parcelaEncontrada.toString());

                                //Se activa lo nesesario
                                parcelaArea.setText(parcela.mostrarDatos());
                                eliminarParcelaButton.setEnabled(true);
                                ingresarCultivoButton.setEnabled(true);
                                modificarButton.setEnabled(true);

                                //Ingresar los datos directamente para modificar
                                idBuscadoLabel.setText(String.valueOf(parcelaEncontrada.getIdParcela()));
                                nuevoPropietarioField.setText(parcelaEncontrada.getNombreParcela());
                                xModificarSpiner.setValue(parcelaEncontrada.getDimensionesParcelaX());
                                yModificarSpiner.setValue(parcelaEncontrada.getDimensionesParcelaY());

                                buscarParcelaField.setText("");


                            } else {
                                buscarParcelaArea.setText("La parcela " + id + " no exite en la lista");
                                eliminarParcelaButton.setEnabled(false);
                                ingresarCultivoButton.setEnabled(false);
                                modificarButton.setEnabled(false);
                                borrarDatos();
                            }
                        }
                    }
                } catch(Exception t) {
                    JOptionPane.showMessageDialog(null, "Ingrese el id correctamente", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        //Parcela
        eliminarParcelaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == eliminarParcelaButton) {
                    parcela.eliminarParcela(parcelaEncontrada);
                    parcelaArea.setText(parcela.mostrarDatos());
                    buscarParcelaArea.setText("===La Parcela fue eliminada con exito===");
                    borrarDatos();
                }
            }
        });

        ingresarCultivoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == ingresarCultivoButton) {
                    VentanaCultivo ventanaCultivo = new VentanaCultivo();
                    frame.setVisible(false);

                }
            }
        });

        modificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == modificarButton) {
                    try {
                        String nombre = nuevoPropietarioField.getText();
                        double x = Double.parseDouble(xModificarSpiner.getValue().toString());
                        double y = Double.parseDouble(yModificarSpiner.getValue().toString());

                        parcela.modificarParcela(parcelaEncontrada, nombre, x, y);

                        modificarArea.setText("===Parcela " + parcelaEncontrada.getIdParcela() + " modificada correctamente===" + "\n\n" + parcelaEncontrada);

                    } catch(Exception t) {
                        JOptionPane.showMessageDialog(null, "Ingresar correctamente los parametros", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
    }

    public void borrarDatos() {
        nombreParcelaField.setText("");
        ubicacionParcelaCombo.setSelectedIndex(0);
        xParcelaSpin.setValue(0);
        yParcelaSpin.setValue(0);



        idBuscadoLabel.setText("Por favor Primero busque una Parcela*");
        nuevoPropietarioField.setText("");
        xModificarSpiner.setValue(0);
        yModificarSpiner.setValue(0);
    }
}
