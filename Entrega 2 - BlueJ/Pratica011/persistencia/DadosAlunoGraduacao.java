//package dados;
package persistencia;
import recursosHumanos.*;

import java.util.ArrayList;

public abstract class DadosAlunoGraduacao
{
    private static ArrayList<AlunoGraduacao> alunosGraduacao;
    
    static{        
        alunosGraduacao = (ArrayList<AlunoGraduacao>)Persistencia.recuperar("alunosGraduacao.dat"); 
        if (alunosGraduacao == null)            
            alunosGraduacao = new ArrayList<AlunoGraduacao>();    
    }
    
    public static void cadastrar(AlunoGraduacao ag) {
        alunosGraduacao.add(ag);
        Persistencia.gravar(alunosGraduacao, "alunosGraduacao.dat");
        System.out.println("Total de alunos de Graduacao inseridos: " + alunosGraduacao.size());
    }
    
    public static void listar(){
        System.out.println("LISTA DOS ALUNOS DE GRADUACAO");
        for (AlunoGraduacao ag: alunosGraduacao) {
            System.out.println("");
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
