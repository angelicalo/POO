//package dados;
package persistencia; 
import recursosHumanos.*;

import java.util.ArrayList;

public abstract class DadosProfessores
{
    private static ArrayList<Professor> professores;
    
    static{
        professores = (ArrayList<Professor>)Persistencia.recuperar("professores.dat");
        if (professores == null)
            professores = new ArrayList<Professor>();
    }  
    
    public static void cadastrar(Professor p) {
        professores.add(p);
        Persistencia.gravar(professores, "professores.dat"); 
        System.out.println("Total de professores inseridos: " + professores.size());
    }
    
    public static void listar(){
        for (Professor p: professores) {
            p.mostrarDados();            
        }
    }
    
    public static Professor buscar(String cpf) {
        Professor professor = null;
        for ( Professor p: professores) {
            if (p.getCpf().equals(cpf)) {
                professor = p;
                break;
            }
        }
        return professor;
    }
    
    public static boolean excluir(String matricula){
        Professor p = buscar(matricula);
        if (p != null) {
            professores.remove(p);
            Persistencia.gravar(professores, "professores.dat"); 
            return true;
        }else{
            return false;
        }
    }
}