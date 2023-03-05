package conversor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Conversor {
    private JPanel pnlPrincipal;
    private JButton msButton;
    private JButton mphButton;
    private JButton nosButton;
    private JButton machButton;
    private JButton limparButton;
    private JTextField entrada;
    private JTextArea saida;
    private JTextField conversorDeVelocidadeTextField;
    private double resultado;
    private double valor;

    public static boolean validadorEntrada(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public Conversor() {
        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saida.setText("");
                entrada.setText("");
            }
        });
        msButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!validadorEntrada(entrada.getText())) {
                    saida.setText("Informe uma velocidade válida.");
                } else {
                    valor = Double.parseDouble(entrada.getText());
                    resultado = valor/3.6;
                    saida.setText("Resultado: \n " + String.format("%.3f", resultado) + " m/s");
                }

            }
        });
        mphButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!validadorEntrada(entrada.getText())) {
                    saida.setText("Informe uma velocidade válida.");
                } else {
                    valor = Double.parseDouble(entrada.getText());
                    resultado = valor / 1.609;
                    saida.setText("Resultado: \n " + String.format("%.3f", resultado) + " mph");
                }
            }
        });
        nosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!validadorEntrada(entrada.getText())) {
                    saida.setText("Informe uma velocidade válida.");
                } else {
                    valor = Double.parseDouble(entrada.getText());
                    resultado = valor / 1.852;
                    saida.setText("Resultado: \n " + String.format("%.3f", resultado) + " nos");
                }
            }
        });
        machButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!validadorEntrada(entrada.getText())) {
                    saida.setText("Informe uma velocidade válida.");
                } else {
                    valor = Double.parseDouble(entrada.getText());
                    resultado = valor / 1235;
                    saida.setText("Resultado: \n " + String.format("%.1f", resultado) + " machs");
                }
            }
        });
    }

    public JPanel getPnlPrincipal() {
        return pnlPrincipal;
    }

}
