package prog2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MudaCor {
    private JPanel pnlPrincipal;
    private JButton pretoButton;
    private JButton brancoButton;
    private JButton azulButton;
    private JButton verdeButton;
    private JButton vermelhoButton;
    private JPanel pnlCor;
    private JCheckBox ativarModoSemCliqueCheckBox;
    private boolean semClique = false;

    public MudaCor() {
        vermelhoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlCor.setBackground(Color.RED);
            }
        });
        verdeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlCor.setBackground(Color.GREEN);
            }
        });
        azulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlCor.setBackground(Color.BLUE);
            }
        });
        brancoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlCor.setBackground(Color.WHITE);
            }
        });
        pretoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlCor.setBackground(Color.BLACK);
            }
        });

        ativarModoSemCliqueCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                semClique = semClique ? false : true;

            }
        });

        vermelhoButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (semClique) {
                    pnlCor.setBackground(Color.RED);
                }
            }
        });
        verdeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (semClique) {
                    pnlCor.setBackground(Color.GREEN);
                }
            }
        });
        azulButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (semClique) {
                    pnlCor.setBackground(Color.BLUE);
                }
            }
        });
        brancoButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (semClique) {
                    pnlCor.setBackground(Color.WHITE);
                }
            }
        });
        pretoButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (semClique) {
                    pnlCor.setBackground(Color.BLACK);
                }
            }
        });

    }

    public JPanel getPnlPrincipal() {
        return pnlPrincipal;
    }
}
