package br.lista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ListaForm extends JFrame {

    ArrayList<String> tarefas = new ArrayList<String>();
    private JPanel painel = new JPanel();
    private JButton jButtonMostrarLista = new JButton("Itens que contem na lista");
    private JButton jButtonAdicionarTarefa = new JButton("Adicionar Tarefa");
    private JButton jButtonRemoverTarefa = new JButton("Remover Tarefa");

    public ListaForm (){
        this.setTitle("== Aplicativo de Lista de Tarefas ==");
        this.setSize(400, 200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255, 255, 255));
        painel.add(jButtonMostrarLista);
        jButtonMostrarLista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JOptionPane.showMessageDialog(null, "Itens que contem na lista: %s".formatted(tarefas));


            }
        });
        painel.add(jButtonAdicionarTarefa);
        jButtonAdicionarTarefa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lista = JOptionPane.showInputDialog(null, "Digite o que deseja adicionar na lista:");
                tarefas.add(lista);
                JOptionPane.showMessageDialog(null, "Tarefa Adicionada!");

            }
        });
        painel.add(jButtonRemoverTarefa);
        jButtonRemoverTarefa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String removerTarefa = JOptionPane.showInputDialog(null, "O que deseja remover da lista:");
                tarefas.remove(removerTarefa);
                JOptionPane.showMessageDialog(null, "Tarefa removida!");
            }
        });
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new ListaForm();
    }
}
