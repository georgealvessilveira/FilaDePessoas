/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filadepessoas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kurosaki-x
 */
public class Fila {
    
    private List<Pessoa> pessoas;
    private int index;
    
    public Fila() {
        pessoas = new ArrayList<>();
        index = 0;
    }
    
    public void addPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }
    
    public void removerPessoa() throws Exception {
        pessoas.remove(index);
        
        if (pessoas.isEmpty() == true) {
            throw new Exception("Não há mais pessoas na fila para serem removidas!");
        }
    }
}
