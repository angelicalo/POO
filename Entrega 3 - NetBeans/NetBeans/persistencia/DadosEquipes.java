package persistencia; 
import academico.*;

/**
 *
 * @author unicamp
 */
import java.util.ArrayList;

public abstract class DadosEquipes
{
    private static ArrayList<ProjetoDePesquisa> equipes;
    
    static{
        equipes = (ArrayList<ProjetoDePesquisa>)Persistencia.recuperar("equipesProjetoDePesquisa.dat");
        if (equipes == null)
            equipes = new ArrayList<ProjetoDePesquisa>();
    }  
    
    public static void cadastrar(ProjetoDePesquisa p){
            equipes.add(p);
            Persistencia.gravar(equipes, "projetosPesquisa.dat");
            System.out.println("Total de projetos inseridos: " + equipes.size());            
        } 

    public static ArrayList<ProjetoDePesquisa> getProjetoDePesquisa(){
        return equipes;
    }
    
    public static void setProjetoDePesquisa(ArrayList<ProjetoDePesquisa> projetoDePesquisa){
        equipes = projetoDePesquisa;
        Persistencia.gravar(equipes, "projetosPesquisa.dat");
        }
    
    public static void listar(){
        System.out.println("LISTA DAS EQUIPES");
        for (ProjetoDePesquisa equipe: equipes) {
            equipe.mostrarDados();
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
