package fundamentos;

public class multiplasNotas {
    public static void main(String[] args) {
        int resultado = somar(4,8,2,6);
        System.out.println("Resultado");
    }
    public static int somar(int...valores){
        int resultados = 0;
        for (int i = 0; i < valores.length; i++) {
            int valor = valores[i];
            resultados += valor;
        }
        return resultados;
    }
    
}
