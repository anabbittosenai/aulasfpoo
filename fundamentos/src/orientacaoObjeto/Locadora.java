
package orientacaoObjeto;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Locadora {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        Cliente c1 = new Cliente("José Antonio Santos");
        System.out.println("c1");
        
        Cliente c2 = new Cliente("Marilza", "marilsa@gmail.com");
    }
 
}
