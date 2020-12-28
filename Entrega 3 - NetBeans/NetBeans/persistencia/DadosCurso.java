//package dados;
package persistencia; 
import academico.*;

import java.util.ArrayList;

public abstract class DadosCurso
{
    private static ArrayList<Curso> cursos;
    
    static{
        cursos = (ArrayList<Curso>)Persistencia.recuperar("cursos.dat");
        if (cursos == null)
            cursos = new ArrayList<Curso>();
    }      
    
    public void cadastrar(Curso c) {
        cursos.add(c); 
        Persistencia.gravar(cursos, "cursos.dat"); 
        System.out.println("Total de cursos inseridos: " + cursos.size());
    }
    
    public void listar(){
        System.out.println("LISTA DOS CURSOS");
        for (Curso c: cursos) {
            System.out.println("");
            c.mostrarDados();
        }
    }
    
    public Curso buscar(String codigo) {
        for (Curso c: cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }            
        }
        return null;
    }
    //este método usa o método buscar já implementado
    public boolean excluir(String codigo){
        Curso c = buscar(codigo);
        if (c != null) {
            cursos.remove(c);
            Persistencia.gravar(cursos, "cursos.dat"); 
            return true;
        }else{
            return false;
        }
    }
}
