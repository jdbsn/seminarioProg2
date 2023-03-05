package conversor;

import javax.swing.*;

public class FrameConversor {
    public static void main(String[] args) {

        Conversor conversor = new Conversor();
        JFrame frame = new JFrame();

        frame.setContentPane(conversor.getPnlPrincipal());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}