
package classes.Atividade;
public class Sala {
    private int qtdeCadeiras;
    private int qtdeMesas;
    private String Sala;
    private String temprojetor;
    private int qtdeComputadores;

    public Sala(int qtdeCadeiras, int qtdeMesas, String Sala, String temprojetor, int qtdeComputadores) {
        this.qtdeCadeiras = qtdeCadeiras;
        this.qtdeMesas = qtdeMesas;
        this.Sala = Sala;
        this.temprojetor = temprojetor;
        this.qtdeComputadores = qtdeComputadores;
    }

    @Override
    public String toString() {
        return "Sala{" + "qtdeCadeiras=" + qtdeCadeiras + ", qtdeMesas=" + qtdeMesas + ", Sala=" + Sala + ", temprojetor=" + temprojetor + ", qtdeComputadores=" + qtdeComputadores + '}';
    }
    
    
    
}
