package filadepessoas;

import java.util.InputMismatchException;
import java.util.Scanner;


public class FilaDePessoas {

    public static void main(String[] args) {
        
        Fila filaPessoas = new Fila();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        System.out.println("Fila de pessoas");
        
        do {
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - Ver todas as pessoas na fila");
            System.out.println("0 - Sair\n");
            System.out.println("Digite uma opção: ");
            
            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Comando inválido, digite números ao invéz de letras ou caracteres especiais!");
            }
            
            switch(opcao){
             
                case 1:
                    System.out.println("Digite o nome da pessoa: ");
                    String nome = scanner.next();
                    filaPessoas.addPessoa(new Pessoa(nome));
                    System.out.println("Pessoa adicionada!\n");
                    break;
                    
                case 2:
                    try {
                        System.out.println(filaPessoas.getPessoa().getNome() +  " removido(a)!");
                        filaPessoas.removerPessoa();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                    
                case 0:
                    System.out.println("Fim do programa!");
                    break;
                    
                case 3:
                    System.out.println("Pessoas na fila: ");
                    for(Pessoa pessoa : filaPessoas.getPessoas()) {
                        System.out.println("Ninguém na fila!");
                        System.out.println(pessoa.getNome());
                    }
                    System.out.println("");
                    break;
                    
                default:
                    System.out.println("Comando inválido!");
                    break;
            }
        } while (opcao != 0);
        
    }
    
}
