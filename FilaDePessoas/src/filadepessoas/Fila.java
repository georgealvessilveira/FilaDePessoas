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
    
    public Fila() {
        pessoas = new ArrayList<>();
    }
    
    public void addPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }
    
    public void removerPessoa() throws IndexOutOfBoundsException {
        
        if (pessoas.isEmpty() == true) {
            throw new IndexOutOfBoundsException("Não há pessoas na fila!");
        } else {
            pessoas.remove(0);
        }
    }
    
    public Pessoa getPessoa() throws IndexOutOfBoundsException {
        
        if (pessoas.isEmpty() == true) {
            throw new IndexOutOfBoundsException("Não há pessoas fila!");
        }
        return pessoas.get(0);
    }
    
    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}
