                  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author fguimara
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ValidadorCPF v = ValidadorCPF.getInstance();
        
        boolean b = v.validacPF("04191079590");
        v.msg("88888888888");
       
        //if(b)
            //System.out.println("CPF válido");
        //else
            //System.out.println("CPF inválido");
            
        
        ValidadorCPF v2 = ValidadorCPF.getInstance();
        v2.msg("04191079590");
        
        
        ValidadorCPF v3 = ValidadorCPF.getInstance();
        ValidadorCPF v4 = ValidadorCPF.getInstance();
        ValidadorCPF v5 = ValidadorCPF.getInstance();
        
         System.out.println(v);
         System.out.println(v2);
         System.out.println(v3);
         System.out.println(v4);
         System.out.println(v5);
         
        
    }
    
}
