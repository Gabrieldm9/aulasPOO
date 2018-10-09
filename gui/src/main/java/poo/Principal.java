package poo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Principal {
    private JPanel painelPrincipal;
    private JLabel nomeLabel;
    private JTextField nomeTF;
    private JButton confirmarButton;
    private JLabel resultadoLabel;
    private JRadioButton femininoRadioButton;
    private JRadioButton masculinoRadioButton;

    public Principal(){

        public void caixaTexto(){
            String mensagem;
            if (femininoRadioButton.isSelected()){
                mensagem = "Bom dia Senhora ";
            }
            mensagem += nomeTF.getText();
            resultadoLabel.setText(mensagem);

        }



        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        nomeTF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               caixaTexto();

            }

            
        });

        nomeTF.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Principal");
        frame.setContentPane(new Principal().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
