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
    public int quantidade = 0;
    
    public Fila() {
        pessoas = new ArrayList<>();
    }
    
    public void addPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
        quantidade++;
    }
    
    public void removerPessoa() throws Exception {
        pessoas.remove(0);
        quantidade--;
    }
    
    public Pessoa getPessoa() {
        return pessoas.get(0);
    }
}
