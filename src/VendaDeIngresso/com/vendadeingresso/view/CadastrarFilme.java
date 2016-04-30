
package VendaDeIngresso.com.vendadeingresso.view;

import VendaDeIngresso.com.vendadeingresso.controller.FilmeController;
import VendaDeIngresso.com.vendadeingresso.model.Filme;
import java.util.Scanner;

/**
 *
 * @author 631610051
 */
public class CadastrarFilme {
    
    private FilmeController lista = FilmeController.getInstance();
    private Scanner teclado = new Scanner(System.in);
    
    public void cadastrar(){
        System.out.println("Informe um nome: ");
        String nome = teclado.next();
        
        //Verifica se nome foi preenchido
        if(nome.length() > 0){
            //Verifica se já existe um filme com esse nome
            if(lista.existFilmeSearchByName(nome) == false){
                
                System.out.println("Informe um Gênero: ");
                String genero = teclado.next();
                
                //Verifica se foi preenchido
                if(genero.length() > 0){
                    System.out.println("Informe uma Sinopse: ");                    
                    String sinopse = teclado.next();
                    
                    if(sinopse.length() > 0){
                        if(lista.add(new Filme(nome, genero, sinopse)))
                            System.out.println("Filme Cadastrado com Sucesso!!");
                    }
                }
                else{
                    System.out.println("Gênero não pode ser vazio.");
                }
            }
            else
            {
                System.out.println("Filme já cadastrado.");
            }
        }
        else{
            System.out.println("Nome não pode ser vazio.");
        }
    }
}
