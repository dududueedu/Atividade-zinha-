package empresa;

/**
 *
 * @author drew
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        empregado e = new empregado("Edy");
        empregado e1 = new empregado("LUA", "Gerente de finanças", 5.605);
  
        System.out.println(e);
        System.out.println(e1);
    }
    
}
