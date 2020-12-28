package dados;
import academico.*;
import recursosHumanos.*;

import java.util.ArrayList;

class DadosProfessores
{
    private ArrayList<Professor> professores = new ArrayList<Professor>();
    
    public void cadastrar(Professor p) {
        this.professores.add(p); 
        //ADICIONA O PROFESSOR NO ARRAY
        System.out.println("Total de professores inseridos: ");
        System.out.println(this.professores.size());
    }
    public void listar(){
        for (Professor objeto: this.professores) {
            objeto.mostrarDados();
            //método mostrarDados() já implementado na prática anterior
        }
    }
    //este método retorna o objeto Aluno caso encontrado, ou null, caso não encotrado
    public Professor buscar(String cpf) {
        Professor p = null;
        for ( Professor objeto: this.professores) {
            if (objeto.getCpf().equals(cpf)) {
                p = objeto;
                break;
            }
        }
        return p;
    }
    //este método usa o método buscar já implementado
    public boolean excluir(String matricula){
        Professor p = this.buscar(matricula);
        if (p != null) {
            this.professores.remove(p);
            return true;
        }else{
            return false;
        }
    }
}