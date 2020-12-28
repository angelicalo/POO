package dados;
import academico.*;
import recursosHumanos.*;

import java.util.ArrayList;

public class DadosAlunos
{
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    
    public void cadastrar(Aluno a) {
        this.alunos.add(a); //ADICIONA O ALUNO NO ARRAY
        System.out.println("Total de alunos inseridos...: ");
        System.out.println(this.alunos.size());
    }
    
    public void listar(){
        for (Aluno objeto: this.alunos) {
            System.out.println(" ");
            objeto.mostrarDados();//método mostrarDados() já implementado na prática anterior
        }
    }
    //este método retorna o objeto Aluno caso encontrado, ou null, caso não encotrado
    public Aluno buscar(String matricula) {
        Aluno a = null; 
        for ( Aluno objeto: this.alunos) {
            if (objeto.getMatricula().equals(matricula)) {
                a = objeto;
                break;
            }
        }
        return a;
    }
    //este método usa o método buscar já implementado
    public boolean excluir(String matricula){
        Aluno a = this.buscar(matricula);
        if (a != null) {
            this.alunos.remove(a);
            return true;
        }else{
            return false;
        }
    }
}
