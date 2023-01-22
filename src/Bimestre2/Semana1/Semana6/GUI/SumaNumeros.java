package Bimestre2.Semana1.Semana6.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumaNumeros {
    private JPanel panelPrincipal;
    private JTextField txt_n1;
    private JTextField txt_n2;
    private JButton btn_suma;
    private JLabel lbl_resultado;
    private JButton btn_resta;
    private JButton btn_multi;
    private JButton btn_divi;

    public SumaNumeros() {
        btn_suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int suma = Integer.parseInt(txt_n1.getText()) + Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText(String.valueOf(suma));

        btn_resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int resta = Integer.parseInt(txt_n1.getText()) - Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText(String.valueOf(resta));
                    }
                });
        btn_multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int multi = Integer.parseInt(txt_n1.getText()) * Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText(String.valueOf(multi));
            }
        });
        btn_divi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double divi = Integer.parseInt(txt_n1.getText()) / Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText(String.valueOf(divi));
            }
        });
            }
        });
    }

    public static void main(String[] args) {
        JFrame inicio = new JFrame("SumaNumeros");
        inicio.pack();
        inicio.setContentPane(new SumaNumeros().panelPrincipal);
        inicio.setVisible(true);
    }
}
