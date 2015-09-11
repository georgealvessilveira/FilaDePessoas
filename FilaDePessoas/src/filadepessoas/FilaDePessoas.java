/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filadepessoas;

/**
 *
 * @author kurosaki-x
 */
public class FilaDePessoas {

    public static void main(String[] args) {
        
        Fila filaPessoas = new Fila();
        
        for (int i = 0; i < 3; i++) {
            filaPessoas.addPessoa(new Pessoa());
            System.out.println("Pessoa adicionadas");
        }
        
        try {
            for (int i = 0; i < 3; i++) {
                filaPessoas.removerPessoa();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
