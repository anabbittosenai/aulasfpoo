/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Bicicleta {
    //atributos, são as caracteristicas das bicicletas.
    private int qtdRodas;
    private boolean temarcha;
    private String modelo;
    private boolean temfreio;
    private String cor;
    private String situacao;
    private int velocidade;
    
    //construtor sem argumentos

    public Bicicleta() {
    }
    
    public Bicicleta(int qtdRodas, boolean temarcha, String modelo, boolean temfreio, String cor) {
        this.qtdRodas = qtdRodas;
        this.temarcha = temarcha;
        this.modelo = modelo;
        this.temfreio = temfreio;
        this.cor = cor;
        this.situacao = "Parada";
        this.velocidade = 0;
    }
    // Ações da Bike
    public void andar(int velocidade) {
        this.situacao = "andando";
        this.velocidade = velocidade;
    }
    
    public void freiar() {
    this.situacao = "Freiando";
    this.velocidade -= 1;
    }
    
    public boolean verificarSetemfreio() {
    return this.temfreio;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "qtdRodas=" + qtdRodas + ", temarcha=" + temarcha + ", modelo=" + modelo + ", temfreio=" + temfreio + ", cor=" + cor + ", situacao=" + situacao + ", velocidade=" + velocidade + '}';
    }

    
}
