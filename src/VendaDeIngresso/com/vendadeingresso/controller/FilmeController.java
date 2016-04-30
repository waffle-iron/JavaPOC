
package VendaDeIngresso.com.vendadeingresso.controller;

import VendaDeIngresso.com.vendadeingresso.model.Filme;
import java.util.ArrayList;

/**
 *
 * @author 631610051
 */
public class FilmeController {
    
    private static FilmeController instance;
    private ArrayList<Filme> listaFilme;
    
    private FilmeController(){
        listaFilme = new ArrayList();
    }
    
    public static FilmeController getInstance(){
        if(instance == null)
            instance = new FilmeController();
        
        return instance;        
    }
    
    public boolean add(Filme filme){
        if(existFilmeSearchByFilme(filme))
            return false;
        else{
            listaFilme.add(filme);
            return true;
        }
    }
    
    public boolean existFilmeSearchByFilme(Filme filme){
        if(listaFilme.size() == 0){
            return false;
        }
        else{
            for(Filme f : listaFilme){
                if(f.equals(filme))
                    return true;
            }
        }
        return false;
    }
    
    public boolean existFilmeSearchByName(String name){
        if(listaFilme.size() == 0){
            return false;
        }
        else{
            for(Filme f : listaFilme){
                if(f.getNome().equals(name)){
                    return true;
                }
            }
        }
        return false;
    }
    
}
