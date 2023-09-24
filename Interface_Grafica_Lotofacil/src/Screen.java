import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Screen extends JFrame {
    public Screen() {

        setTitle("Lotofacil");
        setVisible(true);
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel titulo = new JLabel("Lotofácil");
        titulo.setBounds(300, 15, 250, 50);
        titulo.setFont(new Font("Arial", Font.BOLD, 40));
        add(titulo);

        JLabel fraseInicial = new JLabel("Escolha a sua aposta:");
        fraseInicial.setBounds(260, 80, 400, 50);
        fraseInicial.setFont(new Font("Arial", Font.BOLD, 25));
        add(fraseInicial);

        JButton botaoaposta1 = new JButton();
        botaoaposta1.setText("1 a 100");
        botaoaposta1.setBounds(100, 150, 200, 70);
        botaoaposta1.setFont(new Font("Arial", Font.ITALIC, 20 ));
        botaoaposta1.setForeground(new Color(10, 10, 10));
        botaoaposta1.setBackground(new Color(250, 250, 150));
        add(botaoaposta1);

        JButton botaoaposta2 = new JButton();
        botaoaposta2.setText("A a Z");
        botaoaposta2.setBounds(480, 150, 200, 70);
        botaoaposta2.setFont(new Font("Arial", Font.ITALIC, 20 ));
        botaoaposta2.setForeground(new Color(10, 10, 10));
        botaoaposta2.setBackground(new Color(250, 250, 150));
        add(botaoaposta2);

        JButton botaoaposta3 = new JButton();
        botaoaposta3.setText("Par ou Ímpar");
        botaoaposta3.setBounds(100, 300, 200, 70);
        botaoaposta3.setFont(new Font("Arial", Font.ITALIC, 20 ));
        botaoaposta3.setForeground(new Color(10, 10, 10));
        botaoaposta3.setBackground(new Color(250, 250, 150));
        add(botaoaposta3);

        JButton sair = new JButton();
        sair.setText("Sair");
        sair.setBounds(480, 300, 200, 70);
        sair.setFont(new Font("Arial", Font.ITALIC, 20 ));
        sair.setForeground(new Color(10, 10, 10));
        sair.setBackground(new Color(250, 250, 150));
        add(sair);

        JLabel nome = new JLabel("by misael alexandrino");
        nome.setBounds(460, 400, 400, 30);
        nome.setFont(new Font("Arial", Font.ITALIC, 25));
        add(nome);

        botaoaposta1.addActionListener(this::aposta1);
        botaoaposta2.addActionListener(this::aposta2);
        botaoaposta3.addActionListener(this::aposta3);
        sair.addActionListener(this::sair);


    }

    private void aposta1(ActionEvent actionEvent) {
        Aposta1a100 aba = new Aposta1a100();
    }

    private void aposta2(ActionEvent actionEvent) {
        ApostaAaZ aba = new ApostaAaZ();
    }

    private void aposta3(ActionEvent actionEvent) {
        ApostaParouImpar aba = new ApostaParouImpar();
    }

    private void sair(ActionEvent actionEvent) {dispose();}

}
