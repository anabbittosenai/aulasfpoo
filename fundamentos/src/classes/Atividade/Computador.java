/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.Atividade;

/**
 *
 * @author Aluno
 */
public class Computador {
    private String memoria;
    private String processador;
    private int capacidadeDoDiscoRigido;
    private String sistemaOperacional;

    public Computador(String memoria, String processador, int capacidadeDoDiscoRigido, String sistemaOperacional) {
        this.memoria = memoria;
        this.processador = processador;
        this.capacidadeDoDiscoRigido = capacidadeDoDiscoRigido;
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String toString() {
        return "Computador{" + "memoria=" + memoria + ", processador=" + processador + ", capacidadeDoDiscoRigido=" + capacidadeDoDiscoRigido + ", sistemaOperacional=" + sistemaOperacional + '}';
    }
    
}
