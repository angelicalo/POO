//package dados;
package persistencia; 
import academico.*;

import java.util.ArrayList;

public abstract class DadosDisciplinas
{
    private static ArrayList<Disciplina> disciplinas;
    
    static{
        disciplinas = (ArrayList<Disciplina>)Persistencia.recuperar("disciplinas.dat");
        if (disciplinas == null)
            disciplinas = new ArrayList<Disciplina>();
    }  
    
    public static void cadastrar(Disciplina d) {
        disciplinas.add(d); 
        Persistencia.gravar(disciplinas, "disciplinas.dat"); 
        System.out.println("Total de disciplinas inseridas: " + disciplinas.size());
    }
    
    public static void listar(){
        System.out.println("LISTA DAS DISCIPLINAS");
        for (Disciplina d: disciplinas) {
            System.out.println("");
            d.mostrarDados();
        }
    }
    
    public static Disciplina buscar(String codigo) {
        for ( Disciplina d: disciplinas) {
            if (d.getCodigo().equals(codigo)) {
                return d;
            }
        }
        return null;
    }
    
    public static boolean excluir(String codigo){
        Disciplina d = buscar(codigo);
        if (d != null) {
            disciplinas.remove(d);
            Persistencia.gravar(disciplinas, "disciplinas.dat"); 
            return true;
        }else{
            return false;
        }
    }
}
