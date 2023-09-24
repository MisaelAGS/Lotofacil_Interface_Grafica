import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Aposta1a100 extends JFrame {

    JTextField texto;

    public Aposta1a100(){
        setTitle("Aposta 1 a 100");
        setVisible(true);
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel titulo = new JLabel("Escreva um número de 0 a 100:");
        titulo.setBounds(200, 50, 400, 100);
        titulo.setFont(new Font("Arial", Font.BOLD, 25));
        add(titulo);

        JButton botaoApostar = new JButton("Apostar");
        botaoApostar.setBounds(260, 300, 200, 70);
        botaoApostar.setFont(new Font("Arial", Font.ITALIC, 20 ));
        botaoApostar.setForeground(new Color(10, 10, 10));
        botaoApostar.setBackground(new Color(250, 250, 150));
        add(botaoApostar);

        texto = new JTextField();
        texto.setBounds(300, 170, 100, 70);
        texto.setFont(new Font("Arial", Font.BOLD, 25));
        add(texto);

        botaoApostar.addActionListener(this::apostar);
    }

    private void apostar(ActionEvent actionEvent) {

        int number_random;
        int num1 = Integer.parseInt(texto.getText());

        if (num1 >= 0 && num1 <= 100) {
            Random random = new Random();
            number_random = random.nextInt(100 + 1);
            if (number_random == num1) {
                JOptionPane.showMessageDialog(null,
                        "Parabéns! Você ganhou R$ 1.000,00",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, String.format("Que pena! " +
                                "O número sorteado foi %d", number_random),
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Aposta inválida!",
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }
}
