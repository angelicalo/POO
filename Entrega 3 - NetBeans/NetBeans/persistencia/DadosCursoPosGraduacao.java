//package dados;
package persistencia;  
import academico.*;
import java.util.ArrayList;

public abstract class DadosCursoPosGraduacao
{
    private static ArrayList<CursoPosGraduacao> cursos;
    
    static{
        cursos = (ArrayList<CursoPosGraduacao>)Persistencia.recuperar("cursosPosGraduacao.dat");
        if (cursos == null)
            cursos = new ArrayList<CursoPosGraduacao>();
    }  
    
    public static void cadastrar(CursoPosGraduacao c){
        cursos.add(c);
        Persistencia.gravar(cursos, "cursosPosGraduacao.dat"); 
        System.out.println("Total de cursos inseridos: " + cursos.size());
    }
    
    public static void listar(){
        System.out.println("LISTA DOS CURSOS DE POS GRADUACAO");
        for (CursoPosGraduacao c: cursos) {
            System.out.println("");
            c.mostrarDados();
        }
    }
    
    public static CursoPosGraduacao buscar(String codigo) {
        for (CursoPosGraduacao c: cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }
    
    public static boolean excluir(String codigo){
        CursoPosGraduacao c = buscar(codigo);
        if (c != null) {
            cursos.remove(c);
            Persistencia.gravar(cursos, "cursosPosGraduacao.dat");
            return true;
        }else{
            return false;
        }
    }
}
