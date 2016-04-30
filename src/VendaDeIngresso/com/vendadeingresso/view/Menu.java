
package VendaDeIngresso.com.vendadeingresso.view;

import java.util.Scanner;

/**
 *
 * @author 631610051
 */
public class Menu {
    private static Scanner teclado = new Scanner(System.in);
    public static void inicia(){
        int op = 6;
        do{
            
            System.out.println("1 - Filmes");
            System.out.println("2 - Salas");
            System.out.println("3 - Seção");
            System.out.println("4 - Comprar Ingresso");
            System.out.println("5 - Relatórios");
            System.out.println("0 - Sair");
            op = teclado.nextInt();
            
            switch(op){
            	case 1: 
            			MenuFilme menuFilme = new MenuFilme();
            			menuFilme.incio();
            }
            
        }while(op != 0);
    }    
}
