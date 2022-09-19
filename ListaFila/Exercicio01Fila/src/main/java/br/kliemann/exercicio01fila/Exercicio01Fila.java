package br.kliemann.exercicio01fila;

import javax.swing.JOptionPane;

public class Exercicio01Fila {

    /*
    Uma clínica precisa de um sistema para organizar a fila de pacientes, para 
    cada dia é disponibilizado 20 senhas para consulta. Eles necessitam de um 
    sistema onde é informado o nome do paciente em ordem de chegada e uma opção 
    para chamar o próximo paciente. Desenvolva um algoritmo de Fila, contendo um
    menu com as opções: 1 - Adicionar paciente, 2 - Chamar próximo paciente. A 
    opção 1 deverá exibir um campo para informar o nome do paciente assim que
    ele chega no consultório, e a opção 2, ao selecionar deverá exibir o nome 
    do próximo paciente na fila.
    */
    
    public static Fila fila;
    
    public static void main(String[] args) {
        
        fila = new Fila(20);

        int opcao;
        
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções: " + 
                                        "\n1 - Adicionar paciente" +
                                        "\n2 - Chamar próximo paciente" +
                                        "\n0 - Encerrar programa"));
            
            switch(opcao) {
                case 1:
                    adicionaPaciente();
                    break;
                case 2:
                    chamarPaciente();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Programa encerrado!");
                    break;
                default:
                    JOptionPane.showInputDialog(null, "Opção inválida!");
                    break;
            }
        } while(opcao != 0);

    }
    
    private static void adicionaPaciente() {
        
        if(!fila.isFull()) {
            String nomePaciente = JOptionPane.showInputDialog("Digite o nome do paciente: ");
            fila.enqueue(nomePaciente);
            JOptionPane.showMessageDialog(null, "Paciente [" + nomePaciente + "] adicionado na fila!");
        } else {
            JOptionPane.showMessageDialog(null, "Fila cheia!");
        }
    
    }
    
    private static void chamarPaciente() {
        
        if(!fila.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Paciente [" + fila.dequeue() + "] foi chamado para ser atendido!");
        }
        
    }
    
}
