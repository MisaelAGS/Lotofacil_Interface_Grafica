import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ApostaAaZ extends JFrame {

    JTextField texto;

    public ApostaAaZ(){
        setTitle("Aposta A a Z");
        setVisible(true);
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton botaoApostar = new JButton("Apostar");
        botaoApostar.setBounds(260, 300, 200, 70);
        botaoApostar.setFont(new Font("Arial", Font.ITALIC, 20 ));
        botaoApostar.setForeground(new Color(10, 10, 10));
        botaoApostar.setBackground(new Color(250, 250, 150));
        add(botaoApostar);

        JLabel titulo = new JLabel("Escolha uma letra de A a Z:");
        titulo.setBounds(200, 50, 400, 100);
        titulo.setFont(new Font("Arial", Font.BOLD, 25));
        add(titulo);

        texto = new JTextField();
        texto.setBounds(300, 170, 100, 70);
        texto.setFont(new Font("Arial", Font.BOLD, 25));
        add(texto);

        botaoApostar.addActionListener(this::apostar);
    }

    private void apostar(ActionEvent actionEvent) {
        String letra = texto.getText();
        char letter = letra.charAt(0);
        boolean x = Character.isLetter(letter);
        if (x) {
            letter = Character.toUpperCase(letter);
            if (letter == 'M') {
                JOptionPane.showMessageDialog(null,
                        "Parabéns! Você ganhou R$ 500,00",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null,
                        "Que pena! A letra sorteada foi M!",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Aposta inválida!",
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }
}
