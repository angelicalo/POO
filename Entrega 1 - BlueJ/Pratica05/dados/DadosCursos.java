package dados;
import academico.*;
import recursosHumanos.*;

import java.util.ArrayList;

class DadosCursos
{
    private ArrayList<Curso> cursos = new ArrayList<Curso>();
    
    public void cadastrar(Curso c) {
        this.cursos.add(c); //ADICIONA O ALUNO NO ARRAY
        System.out.println("Total de cursos inseridos...: ");
        System.out.println(this.cursos.size());
    }
    
    public void listar(){
        for (Curso objeto: this.cursos) {
            objeto.mostrarDados();//método mostrarDados() já implementado na prática anterior
        }
    }
    //este método retorna o objeto Aluno caso encontrado, ou null, caso não encotrado
    public Curso buscar(String codigo) {
        Curso c = null; 
        for ( Curso objeto: this.cursos) {
            if (objeto.getCodigo().equals(codigo)) {
                c = objeto;
                break;
            }
        }
        return c;
    }
    //este método usa o método buscar já implementado
    public boolean excluir(String codigo){
        Curso c = this.buscar(codigo);
        if (c != null) {
            this.cursos.remove(c);
            return true;
        }else{
            return false;
        }
    }
}
