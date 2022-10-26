import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Janela extends JFrame {

    /* Configurar a Janela do Programa*/
    public Janela(){
        setTitle("Cadastro de Tarefas");
        setSize(500,500);
        setLocation(600, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        configurarJanela();
        setVisible(true);
    }

    public void configurarJanela(){
        JPanel p = new JPanel();
        GroupLayout JanelaLayout = new GroupLayout(p);
        p.setLayout(JanelaLayout);
        JanelaLayout.setAutoCreateGaps(true);
        JanelaLayout.setAutoCreateContainerGaps(true);

        /* Confirgurar a parte de tarefas do programa */
        JLabel CaixaTarefa = new JLabel("Tarefa");
        JTextArea CaixaTextoTarefa = new JTextArea(5,5);
        CaixaTextoTarefa.setLayout(new BorderLayout(10,10));
        CaixaTextoTarefa.setBorder(BorderFactory.createLineBorder(Color.black));
        CaixaTextoTarefa.setLineWrap(true);

        /*Configurar a parte de Prioridade do Programa*/
        JLabel Prioridade = new JLabel("Prioridade");
        String[] nivelPrioridade = {"Alta", "Baixa"};
        JComboBox ComboBoxPrioridade = new JComboBox(nivelPrioridade);

        /*Configurar os botões e checkbox do Programa*/
        JCheckBox CaixaFinalizar = new JCheckBox("Finalizado");
        JButton BotaoCancelar = new JButton("Cancelar");
        JButton BotaoSalvar = new JButton("Salvar");

        //* Configurar posição dos aspectos do programa*/
        JanelaLayout.setVerticalGroup(
                JanelaLayout.createSequentialGroup()
                        .addComponent(CaixaTarefa)
                        .addComponent(CaixaTextoTarefa)
                        .addComponent(Prioridade)
                        .addComponent(ComboBoxPrioridade)
                        .addComponent(CaixaFinalizar)
                        .addGroup(JanelaLayout.createParallelGroup()
                                .addComponent(BotaoCancelar)
                                .addComponent(BotaoSalvar))
        );
        JanelaLayout.setHorizontalGroup(
                JanelaLayout.createParallelGroup()
                        .addComponent(CaixaTarefa)
                        .addComponent(CaixaTextoTarefa)
                        .addComponent(Prioridade)
                        .addComponent(ComboBoxPrioridade)
                        .addComponent(CaixaFinalizar)
                        .addGroup(JanelaLayout.createSequentialGroup().addContainerGap(300,300)
                                .addComponent(BotaoCancelar)
                                .addComponent(BotaoSalvar))
        );
        add(p);
    }
}
