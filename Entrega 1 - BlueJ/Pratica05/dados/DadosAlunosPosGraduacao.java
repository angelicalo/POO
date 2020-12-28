package dados;
import academico.*;
import recursosHumanos.*;

import java.util.ArrayList;

class DadosAlunosPosGraduacao{
    private ArrayList<AlunoPosGraduacao> alunosPosGraduacao = new ArrayList<AlunoPosGraduacao>();
    
    public void cadastrar(AlunoPosGraduacao pg) {
        this.alunosPosGraduacao.add(pg); //ADICIONA O ALUNO NO ARRAY
        System.out.println("Total de alunosPosGraduacao inseridos: ");
        System.out.println(this.alunosPosGraduacao.size());
    }
    
    public void listar(){
        for (AlunoPosGraduacao objeto: this.alunosPosGraduacao) {
            objeto.mostrarDados();//método mostrarDados() já implementado na prática anterior
        }
    }
    //este método retorna o objeto Aluno caso encontrado, ou null, caso não encotrado
    public AlunoPosGraduacao buscar(String cpf) {
        AlunoPosGraduacao pg = null; 
        for ( AlunoPosGraduacao objeto: this.alunosPosGraduacao) {
            if (objeto.getCpf().equals(cpf)) {
                pg = objeto;
                break;
            }
        }
        return pg;
    }
    //este método usa o método buscar já implementado
    public boolean excluir(String cpf){
        AlunoPosGraduacao pg = this.buscar(cpf);
        if (pg != null) {
            this.alunosPosGraduacao.remove(pg);
            return true;
        }else{
            return false;
        }
    }
}
