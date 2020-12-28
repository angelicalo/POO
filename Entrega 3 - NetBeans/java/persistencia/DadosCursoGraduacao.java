//package dados;
package persistencia; 
import academico.*;

import java.util.ArrayList;

public abstract class DadosCursoGraduacao  
{
    private static ArrayList<CursoGraduacao> cursos;
    
    static{
        cursos = (ArrayList<CursoGraduacao>)Persistencia.recuperar("cursosGraduacao.dat");
        if (cursos == null)
            cursos = new ArrayList<CursoGraduacao>();
    }  
    
    public static void cadastrar(CursoGraduacao c) {
        cursos.add(c); 
        Persistencia.gravar(cursos, "cursosGraduacao.dat"); 
        System.out.println("Total de cursos inseridos: " + cursos.size());
    }
    
    public static void listar(){        
        System.out.println("LISTA DOS CURSOS DE POS GRADUACAO");
        for (CursoGraduacao c: cursos) {
            System.out.println("");
            c.mostrarDados();
        }
    }
    
    public static CursoGraduacao buscar(String codigo) {
        for (CursoGraduacao c: cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }            
        }
        return null;
    }
    
    public static boolean excluir(String codigo){
        CursoGraduacao c = buscar(codigo);
        if (c != null) {
            cursos.remove(c);
            Persistencia.gravar(cursos, "cursosGraduacao.dat");
            return true;
        }else{
            return false;
        }
    }
}
