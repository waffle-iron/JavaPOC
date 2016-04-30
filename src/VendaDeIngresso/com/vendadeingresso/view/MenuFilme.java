
package VendaDeIngresso.com.vendadeingresso.view;

import java.util.Scanner;

/**
 *
 * @author 631610051
 */
public class MenuFilme {
    private Scanner teclado = new Scanner(System.in);
    public void incio(){
        int op = 0;
        do{
            System.out.println("1 - Cadastrar Filme");
            System.out.println("2 - Listar Filmes");
            System.out.println("3 - Pesquisar Filme");
            System.out.println("0 - Sair");
            op = teclado.nextInt();
            
            switch(op){
                case 1:
                     CadastrarFilme cadastro =  new CadastrarFilme();
                     cadastro.cadastrar();
            }
            
        }while(op != 0);
    }
}
