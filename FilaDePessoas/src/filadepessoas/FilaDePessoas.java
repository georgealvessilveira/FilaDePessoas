package filadepessoas;

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
            System.out.println("0 - Sair\n");
            
            System.out.println("Quantidade: " + filaPessoas.quantidade);
            System.out.println("Digite uma opção: ");
            opcao = scanner.nextInt();
            
            switch(opcao){
             
                case 1:
                    System.out.println("Digite o nome da pessoa: ");
                    String nome = scanner.next();
                    filaPessoas.addPessoa(new Pessoa(nome));
                    System.out.println("Pessoa adicionada!\n");
                    break;
                    
                case 2:
                        System.out.println(filaPessoas.getPessoa().getNome() +  " removida!");
                        filaPessoas.removerPessoa();
                    break;
                    
                case 0:
                    System.out.println("Fim do programa!");
                    break;
                    
                default:
                    System.out.println("Comando inválido!");
                    break;
            }
        } while (opcao != 0);
        
    }
    
}
