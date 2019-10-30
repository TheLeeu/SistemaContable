
package sistema_contable;

import Vista.Principal;

public class SISTEMA_CONTABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //aca llamamos el primer form de todo el programa
        Principal principal = new Principal();
        
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
    }
    
}
