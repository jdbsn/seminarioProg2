package mudaCor;

import javax.swing.*;

public class MudaCorFrame {

    public static void main(String[] args) {

        MudaCor mudacor = new MudaCor();
        JFrame frame = new JFrame();

        frame.setContentPane(mudacor.getPnlPrincipal());
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}
