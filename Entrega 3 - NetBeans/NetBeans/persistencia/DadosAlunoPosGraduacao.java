//package dados;
package persistencia; 
import recursosHumanos.*;
//import persistencia.*; 

import java.util.ArrayList;

public abstract class DadosAlunoPosGraduacao 
{
    private static ArrayList<AlunoPosGraduacao> alunosPosGraduacao;
    
    static{        
        alunosPosGraduacao = (ArrayList<AlunoPosGraduacao>)Persistencia.recuperar("alunosPosGraduacao.dat"); 
        if (alunosPosGraduacao == null)            
            alunosPosGraduacao = new ArrayList<AlunoPosGraduacao>();    
    }
    
    public static void cadastrar(AlunoPosGraduacao pg) {        
        DadosAluno.cadastrar(pg);
        alunosPosGraduacao.add(pg); //ADICIONA O ALUNO NO ARRAY
        Persistencia.gravar(alunosPosGraduacao, "alunosPosGraduacao.dat"); 
        System.out.println("Total de alunos de PosGraduacao inseridos: " + alunosPosGraduacao.size());
    }
    
    public static void listar(){
        for (AlunoPosGraduacao ap: alunosPosGraduacao) {
            ap.mostrarDados();
        }
    }
    
    public static AlunoPosGraduacao buscar(String matricula) {
        for (AlunoPosGraduacao ap: alunosPosGraduacao) {
            if (ap.getMatricula().equals(matricula)) {
                return ap;
            }
        }
        return null;
    }
    
    public static boolean excluir(String matricula){
        AlunoPosGraduacao ap = buscar(matricula);
        if (matricula != null){
            alunosPosGraduacao.remove(ap);
            Persistencia.gravar(alunosPosGraduacao, "alunosPosGraduacao.dat");
            return true;
        }else{
            return false;
        }
    }
}
