//package dados;
package persistencia; 
import recursosHumanos.*;

import java.util.ArrayList;

public abstract class DadosAlunoGraduacao
{
    private static ArrayList<AlunoGraduacao> alunosGraduacao;
    private static ArrayList<Aluno> alunos;
    
    static{        
        alunosGraduacao = (ArrayList<AlunoGraduacao>)Persistencia.recuperar("alunosGraduacao.dat"); 
        if (alunosGraduacao == null)            
            alunosGraduacao = new ArrayList<AlunoGraduacao>();  
    }
    
    public static void cadastrar(AlunoGraduacao ag) {
        DadosAluno.cadastrar(ag);
        alunosGraduacao.add(ag);
        Persistencia.gravar(alunosGraduacao, "alunosGraduacao.dat");
        System.out.println("Total de alunos de Graduacao inseridos: " + alunosGraduacao.size());
    }
    
    public static void listar(){
        for (AlunoGraduacao ag: alunosGraduacao) {
            ag.mostrarDados();
        }
    }
    
    public static AlunoGraduacao buscar(String matricula) {
        for (AlunoGraduacao ag: alunosGraduacao) {
            if (ag.getMatricula().equals(matricula)) {
                return ag;
            }
        }
        return null;
    }
    
    public static boolean excluir(String matricula){
        AlunoGraduacao ag = buscar(matricula);
        if (matricula != null){
            alunosGraduacao.remove(ag);
            Persistencia.gravar(alunosGraduacao, "alunosGraduacao.dat");
            return true;
        }else{
            return false;
        }
    }
}
