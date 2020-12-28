//package dados;
package persistencia; 
import academico.*;

import java.util.ArrayList;

public abstract class DadosEquipes
{
    private static ArrayList<ProjetoDePesquisa> equipes;
    
    static{
        equipes = (ArrayList<ProjetoDePesquisa>)Persistencia.recuperar("equipesProjetoDePesquisa.dat");
        if (equipes == null)
            equipes = new ArrayList<ProjetoDePesquisa>();
    }  
    
    public static void listar(){
        for (ProjetoDePesquisa equipe: equipes) {
            String codigo = equipe.getCodigo();
            
        }
    }
    
    public static ProjetoDePesquisa buscar(String cod) {
        ProjetoDePesquisa p = null; 
        for ( ProjetoDePesquisa equipe: equipes) {
            if (equipe.getCodigo().equals(cod)) {
                p = equipe;
                break;
            }
        }
        return p;
    }
    
    public static boolean excluir(String cod){
        ProjetoDePesquisa p = buscar(cod);
        if (p != null) {
            equipes.remove(p);
            Persistencia.gravar(equipes, "equipesProjetoDePesquisa.dat");
            return true;
        }else{
            return false;
        }
    }
}
