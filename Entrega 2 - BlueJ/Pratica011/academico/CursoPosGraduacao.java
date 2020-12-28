package academico;
import recursosHumanos.*;

import java.util.Scanner;
import java.io.Serializable;

public class CursoPosGraduacao extends Curso implements Serializable
{    
    public void lerDados(){
        System.out.println("ENTRE COM OS DADOS DO CURSO DE POS GRADUACAO");
        super.lerDados();
    }
    
    public void mostrarDados(){
        System.out.println("DADOS DO CURSO DE POS GRADUACAO");
        super.mostrarDados();
    }
    
    public void cadastrar(Disciplina d) {        
        System.out.println("Cadastrar disciplina: ");
        super.cadastrar(d); 
    }
    
    public Disciplina buscar(String codigo) {
        System.out.println("Buscar disciplina: ");
        Disciplina d = super.buscar(codigo);
        return d;
    }
    
    public boolean excluir(String codigo) {
        System.out.println("Excluir disciplina: ");
        boolean ex = super.excluir(codigo);
        System.out.println("Disciplina excluida? -> " + ex);
        return ex;
    }
    
}