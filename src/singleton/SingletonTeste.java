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
public class SingletonTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ValidadorCPF.setQtdInstanciasPermitidas(3);
        ValidadorCPF v = ValidadorCPF.getInstance();
        
        boolean b = v.validacPF("04191079590");
        v.msg("88888888888");
       
        ValidadorCPF v2 = ValidadorCPF.getInstance();
        v2.msg("04191079590");
        
        
        ValidadorCPF v3 = ValidadorCPF.getInstance();
        ValidadorCPF v4 = ValidadorCPF.getInstance();
        ValidadorCPF v5 = ValidadorCPF.getInstance();
        ValidadorCPF v6 = ValidadorCPF.getInstance();
        ValidadorCPF v7 = ValidadorCPF.getInstance();
        ValidadorCPF v8 = ValidadorCPF.getInstance();
        
         System.out.println(v);
         System.out.println(v2);
         System.out.println(v3);
         System.out.println(v4);
         System.out.println(v5);
         System.out.println(v6);
         System.out.println(v7);
         System.out.println(v8);
         
        
    }
    
}
