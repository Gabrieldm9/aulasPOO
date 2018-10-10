package jogo;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal {
    private JPanel painelPrincipal;
    private JLabel pos11;
    private JLabel pos12;
    private JLabel pos13;
    private JLabel pos21;
    private JLabel pos31;
    private JLabel pos22;
    private JLabel pos32;
    private JLabel pos23;
    private JLabel pos33;
    private JLabel vezLabel;
    private JLabel nomeLabel;
    private int jogadorvez;



    public Principal() {

        jogadorvez = 0;

        pos11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                String nome;

                if (jogadorvez == 0){
                    nome = "Player 01";
                    jogadorvez = 1;
                }else{
                    nome = "Player 02";
                    jogadorvez = 0;
                }



                nomeLabel.setText(nome);


            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Principal");
        frame.setContentPane(new Principal().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();


        frame.setLocationRelativeTo(null);

        frame.setResizable(false);


        frame.setVisible(true);
    }
}
