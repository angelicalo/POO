package persistencia; 
import academico.*;





import java.util.ArrayList;

public abstract class DadosDisciplinasPosGraduacao
{
    private static ArrayList<DisciplinaPosGraduacao> disciplinas;
    
    static{
        disciplinas = (ArrayList<DisciplinaPosGraduacao>)Persistencia.recuperar("disciplinasPosGraduacao.dat");
        if (disciplinas == null)
            disciplinas = new ArrayList<DisciplinaPosGraduacao>();
    }  
    
    public static void cadastrar(DisciplinaPosGraduacao d) {
        disciplinas.add(d);
        Persistencia.gravar(disciplinas, "disciplinasPosGraduacao.dat"); 
        System.out.println("Total de disciplinas inseridas: " + disciplinas.size());
    }
    
    public static void listar(){
        System.out.println("LISTA DAS DISCIPLINAS DE POS GRADUACAO");
        for (DisciplinaPosGraduacao d: disciplinas) {
            System.out.println("");
            d.mostrarDados();
        }
    }
    
    public static DisciplinaPosGraduacao buscar(String codigo) {
        for ( DisciplinaPosGraduacao d: disciplinas) {
            if (d.getCodigo().equals(codigo)) {
                return d;
            }
        }
        return null;
    }
    
    public static boolean excluir(String codigo){
        DisciplinaPosGraduacao d = buscar(codigo);
        if (d != null) {
            disciplinas.remove(d);
            Persistencia.gravar(disciplinas, "disciplinasPosGraduacao.dat"); 
            return true;
        }else{
            return false;
        }
    }
}
