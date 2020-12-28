//package dados;
package persistencia; 
import recursosHumanos.*;

import java.util.ArrayList;

public abstract class DadosAluno
{
    private static ArrayList<Aluno> alunos;
    
    static{        
        alunos = (ArrayList<Aluno>)Persistencia.recuperar("alunos.dat"); 
        if (alunos == null)            
            alunos = new ArrayList<Aluno>();    
    }
    
    public static void cadastrar(Aluno a) {
        alunos.add(a);
        Persistencia.gravar(alunos, "alunos.dat"); 
        System.out.println("Total de alunos de  inseridos: " + alunos.size());
    }
    
    public static void listar(){
        alunos.forEach(aluno -> aluno.mostrarDados());
    }
    //este método retorna o objeto Aluno caso encontrado, ou null, caso não encotrado
    public static Aluno buscar(String matricula) {
        for (Aluno a: alunos) {
            if (a.getMatricula().equals(matricula)) {
                return a;
            }
        }
        return null;
    }
    //este método usa o método buscar já implementado
    public static boolean excluir(String matricula){
        Aluno a = buscar(matricula);
        if (matricula != null){
            alunos.remove(a);
            Persistencia.gravar(alunos, "alunos.dat"); 
            return true;
        }else{
            return false;
        }
    }
}
