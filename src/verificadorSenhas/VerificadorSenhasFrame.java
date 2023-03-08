package verificadorSenhas;

import javax.swing.*;

 public class VerificadorSenhasFrame {

    public static void main(String[] args) {

        VerificadorSenhas verificador = new VerificadorSenhas();
        JFrame frame = new JFrame();

        frame.setContentPane(verificador.getPnlPrincipal());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}
