
package classes;

public class Carro {
    private String modelo;
    private String marca;
    private CorEnum cor;
    private String ano;
    private int rodas;
    private int marcha;

    public Carro(String modelo, String marca, CorEnum cor, String ano, int rodas, int marcha) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.rodas = rodas;
        this.marcha = marcha;   
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", rodas=" + rodas + ", marcha=" + marcha + '}';
    }
    
    public void trocarDeMarcha(MarchaEnum novaMarcha) {
     int diferenca = novaMarcha.getNumeroMarcha();
    
    if (diferenca == 1) {
        this.marcha = novaMarcha.getNumeroMarcha();
    } else {
        System.out.println("voce nao pode mudar marcha");
     }
    }
    
   
    
}
