
package classes;

public class Vendedor {
    public static void main(String[] args) {
        Carro toyotaCarro = new Carro("novo", "Toyota", CorEnum.LILAS, "2014", 4, 1);
        System.out.println(toyotaCarro);
        
        Carro fiat = new Carro("novo", "fiat", CorEnum.AZUL, "2023", 4, 5);
        System.out.println(fiat);
        
    }
}
