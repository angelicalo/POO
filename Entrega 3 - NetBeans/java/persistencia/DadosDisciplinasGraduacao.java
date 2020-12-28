//package dados;
package persistencia; 
import academico.*;

import java.util.ArrayList;

public abstract class DadosDisciplinasGraduacao
{
    private static ArrayList<DisciplinaGraduacao> disciplinas;
    
    static{
        disciplinas = (ArrayList<DisciplinaGraduacao>)Persistencia.recuperar("disciplinasGraduacao.dat");
        if (disciplinas == null)
            disciplinas = new ArrayList<DisciplinaGraduacao>();
    }  
    
    public static void cadastrar(DisciplinaGraduacao d) {
        disciplinas.add(d); 
        Persistencia.gravar(disciplinas, "disciplinasGraduacao.dat"); 
        System.out.println("Total de disciplinas inseridas: " + disciplinas.size());
    }
    
    public static void listar(){
        System.out.println("LISTA DAS DISCIPLINAS DE GRADUACAO");
        for (DisciplinaGraduacao d: disciplinas) {
            System.out.println("");
            d.mostrarDados();//método mostrarDados() já implementado na prática anterior
        }
    }
    
    public static DisciplinaGraduacao buscar(String codigo) {
        for ( DisciplinaGraduacao d: disciplinas) {
            if (d.getCodigo().equals(codigo)) {
                return d;
            }
        }
        return null;
    }
    //este método usa o método buscar já implementado
    public static boolean excluir(String codigo){
        DisciplinaGraduacao d = buscar(codigo);
        if (d != null) {
            disciplinas.remove(d);
            Persistencia.gravar(disciplinas, "disciplinasGraduacao.dat");
            return true;
        }else{
            return false;
        }
    }
}
