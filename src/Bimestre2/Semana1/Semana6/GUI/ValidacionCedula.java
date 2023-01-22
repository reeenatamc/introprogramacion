package Bimestre2.Semana1.Semana6.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ValidacionCedula {

    private JPanel panelPrincipal1;
    private JTextField num_cedula; //cedulafield
    private JButton validar_c; // boton
    private JTextField valid;

    public ValidacionCedula() {

        validar_c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cedula = num_cedula.getText();
                if (validar(cedula)) {
                    valid.setText("Cedula correcta.");
                } else {
                    valid.setText("Cedula incorrecta.");
                }
            }

            public boolean validar(String cedula) {
                if (cedula.length() != 10) {
                    return false;
                }

                int suma = 0;
                for (int i = 0; i < cedula.length() - 1; i++) {
                    int digito = Integer.parseInt(cedula.substring(i, i + 1));
                    if (i % 2 == 0) {
                        digito *= 2;
                        if (digito > 9) {
                            digito -= 9;
                        }
                    }
                    suma = suma + digito;
                }
                int ultimoDigito = Integer.parseInt(cedula.substring(9, 10));
                int verificador = 10 - (suma % 10);
                if (verificador == 10) {
                    verificador = 0;
                }
                return ultimoDigito == verificador;
            }

        });
    }
    public static void main(String[] args) {
        JFrame inicio = new JFrame("ValidacionCedula");
        inicio.pack();
        inicio.setContentPane(new ValidacionCedula().panelPrincipal1);
        inicio.setVisible(true);

    }
}
