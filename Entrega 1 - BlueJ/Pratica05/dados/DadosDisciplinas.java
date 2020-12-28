package dados;
import academico.*;
import recursosHumanos.*;

import java.util.ArrayList;

class DadosDisciplinas
{
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
    
    public void cadastrar(Disciplina d) {
        this.disciplinas.add(d); //ADICIONA O ALUNO NO ARRAY
        System.out.println("Total de disciplinas inseridas...: ");
        System.out.println(this.disciplinas.size());
    }
    
    public void listar(){
        for (Disciplina objeto: this.disciplinas) {
            objeto.mostrarDados();//método mostrarDados() já implementado na prática anterior
        }
    }
    //este método retorna o objeto Aluno caso encontrado, ou null, caso não encotrado
    public Disciplina buscar(String codigo) {
        Disciplina d = null; 
        for ( Disciplina objeto: this.disciplinas) {
            if (objeto.getCodigo().equals(codigo)) {
                d = objeto;
                break;
            }
        }
        return d;
    }
    //este método usa o método buscar já implementado
    public boolean excluir(String codigo){
        Disciplina d = this.buscar(codigo);
        if (d != null) {
            this.disciplinas.remove(d);
            return true;
        }else{
            return false;
        }
    }
}
