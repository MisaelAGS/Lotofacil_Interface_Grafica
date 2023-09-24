import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ApostaParouImpar extends JFrame {
    JTextField texto;

    public ApostaParouImpar(){
        setTitle("Aposta Par ou Ímpar");
        setVisible(true);
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel titulo = new JLabel("Escreva um número inteiro:");
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
        int num = Integer.parseInt(texto.getText());
        num = num % 2;
        if (num == 0) {
            JOptionPane.showMessageDialog(null,
                    "Parabéns! Você ganhou R$ 100,00",
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null,
                    "Que pena!\n" +
                            "O número digitado é ímpar e a premiação foi para números pares.",
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }
}
