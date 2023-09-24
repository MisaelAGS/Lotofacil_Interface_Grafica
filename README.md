# # Programa de Apostas "Lotofácil"

## Descrição
O programa "Lotofácil" é uma aplicação gráfica que oferece três tipos diferentes de apostas para o usuário escolher. Cada aposta possui um critério específico e retorna um prêmio em dinheiro caso o usuário acerte.

## Requisitos
- Java Development Kit (JDK) instalado. O JDK utilizado no desenvolvimento foi o JDK 20.0.2.
- Ambiente de desenvolvimento Java (como Eclipse, IntelliJ, etc.). A IDE utilizada para o desenvolvimento foi IntelliJ IDEA.
- Biblioteca Swing para interface gráfica

## Bibliotecas Utilizadas
- `javax.swing`: Utilizada para a construção da interface gráfica.
- `java.awt`: Utilizada para elementos gráficos e eventos de interface.
- `java.awt.event.ActionEvent`: Utilizada para lidar com eventos de botão.
- `java.util.Random`: Utilizada para gerar números aleatórios.
- `java.util.Scanner`: Utilizada para a entrada de dados pelo usuário.
- `java.util.concurrent.TimeUnit`: Utilizada para controlar o tempo de espera no programa.

## Estrutura do Projeto
- `Main.java`: Contém o método principal que inicializa o programa, criando uma instância da classe `Screen`.
- `Screen.java`: Representa a interface gráfica do programa. Exibe botões para escolher o tipo de aposta.
- `Aposta1a100.java`: Representa a aposta onde o usuário escolhe um número de 0 a 100. Retorna um prêmio se o número escolhido for sorteado.
- `ApostaAaZ.java`: Representa a aposta onde o usuário escolhe uma letra de A a Z. Retorna um prêmio se a letra escolhida for sorteada.
- `ApostaParouImpar.java`: Representa a aposta onde o usuário escolhe um número inteiro e recebe um prêmio se for par.

## Opções de Apostas
- **Apostar de 0 a 100**: O jogador faz uma aposta em um número de 0 a 100. Se acertar, ganha R$ 1.000,00.
- **Apostar de A à Z**: O jogador faz uma aposta em uma letra de A a Z. Se acertar a letra 'M', ganha R$ 500,00.
- **Apostar em par ou ímpar**: O jogador faz uma aposta em um número inteiro e ganha R$ 100,00 se o número for par.
- **Sair**: O jogador pode escolher sair do programa.

## Executando o Programa
1. Certifique-se de ter o JDK instalado em seu sistema.
2. Abra um ambiente de desenvolvimento Java (como Eclipse, IntelliJ, etc.).
3. Crie um novo projeto Java e adicione os arquivos fornecidos.
4. Execute o arquivo `Main.java` para iniciar o programa.

## Utilizando o Programa
- Ao executar o programa, uma janela será exibida com opções de apostas.
- Escolha o tipo de aposta desejada clicando nos botões correspondentes.
- Siga as instruções apresentadas na tela para inserir os dados necessários.
- Aguarde o resultado da aposta, que será exibido em uma caixa de diálogo.

## Observações
- Certifique-se de ter as bibliotecas Swing e AWT disponíveis em seu ambiente de desenvolvimento Java.
- Este programa foi desenvolvido utilizando a biblioteca Swing para a construção da interface gráfica.
