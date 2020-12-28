//package dados;
package persistencia; 
import recursosHumanos.*;

import java.util.ArrayList;

public abstract class DadosTecnicos
{
    private static ArrayList<Tecnico> tecnicos;
    
    static{
        tecnicos = (ArrayList<Tecnico>)Persistencia.recuperar("tecnicos.dat");
        if (tecnicos == null)
            tecnicos = new ArrayList<Tecnico>();
    }  
    
    public static void cadastrar(Tecnico t) {
        tecnicos.add(t); 
        Persistencia.gravar(tecnicos, "tecnicos.dat"); 
        System.out.println("Total de tecnicos inseridos: " + tecnicos.size());
    }
    
    public static void listar() {
        System.out.println("LISTA DOS TECNICOS");
        for (Tecnico objeto: tecnicos) {
            objeto.mostrarDados();//método mostrarDados() já implementado na prática anterior
            System.out.println("");
        }
    }
    
    public static Tecnico buscar(String cpf) {
        Tecnico tecnico = null; 
        for ( Tecnico t: tecnicos) {
            if (t.getCpf().equals(cpf)) {
                tecnico = t;
                break;
            }
        }
        return tecnico;
    }
    //este método usa o método buscar já implementado
    public static boolean excluir(String cpf) {
        Tecnico t = buscar(cpf);
        if (t != null) {
            tecnicos.remove(t);
            Persistencia.gravar(tecnicos, "tecnicos.dat"); 
            return true;
        }else{
            return false;
        }
    }
}