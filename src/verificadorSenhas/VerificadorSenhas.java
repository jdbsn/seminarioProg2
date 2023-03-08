package verificadorSenhas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificadorSenhas {
    private JPanel pnlPrincipal;
    private JPasswordField senhaField;
    private JButton enviarButton;
    private JTextField minimoMaximoTextField;
    private JTextField numeroTextField;
    private JTextField espacoTextField;

    private boolean[] verificado = {false, false, false};

    public JPanel getPnlPrincipal() {
        return pnlPrincipal;
    }

    public VerificadorSenhas() {

        senhaField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);

                if (((JTextField) e.getSource()).getText().isEmpty()) {
                    enviarButton.setEnabled(false);
                } else {
                    enviarButton.setEnabled(true);
                }

                String senha = new String(senhaField.getPassword());

                if(senha.length() >= 4 && senha.length() <= 8) {
                    minimoMaximoTextField.setBackground(Color.GREEN);
                    verificado[0] = true;
                } else {
                    minimoMaximoTextField.setBackground(Color.RED);
                    verificado[0] = false;
                }

                if(senha.matches("\\d+")) {
                    numeroTextField.setBackground(Color.GREEN);
                    verificado[1] = true;
                } else {
                    numeroTextField.setBackground(Color.RED);
                    verificado[1] = false;
                }

                final Pattern pattern = Pattern.compile("([0-9])\\1", Pattern.MULTILINE);
                final Matcher matcher = pattern.matcher(senha);

                if (!matcher.find()) {
                    espacoTextField.setBackground(Color.GREEN);
                    verificado[2] = true;
                } else {
                    espacoTextField.setBackground(Color.RED);
                    verificado[2] = false;
                }

            }

        });

        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(verificado[0] == verificado[1] == verificado[2] == true) {
                    JOptionPane.showMessageDialog(null, "Senha enviada.");
                }
            }
        });
    }
}
