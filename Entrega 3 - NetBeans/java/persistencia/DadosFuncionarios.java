//package dados;
package persistencia; 
import recursosHumanos.*;

import java.util.ArrayList;

public abstract class DadosFuncionarios
{
    private static ArrayList<Funcionario> funcionarios;
    
    static{
        funcionarios = (ArrayList<Funcionario>)Persistencia.recuperar("funcionarios.dat");
        if (funcionarios == null)
            funcionarios = new ArrayList<Funcionario>();
    }  
    
    public static void cadastrar(Funcionario f) {
        funcionarios.add(f);
        Persistencia.gravar(funcionarios, "funcionarios.dat"); 
        System.out.println("Total de funcionarios inseridos: " + funcionarios.size());
    }
    
    public static void listar(){
        for (Funcionario funcionario: funcionarios) {
            funcionario.mostrarDados();
        }
    }
    
    public static Funcionario buscar(String cpf) {
        Funcionario f = null; 
        for ( Funcionario funcionario: funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                f = funcionario;
                break;
            }
        }
        return f;
    }
    
    public static boolean excluir(String cpf){
        Funcionario f = buscar(cpf);
        if (f != null) {
            funcionarios.remove(f);
            Persistencia.gravar(funcionarios, "funcionarios.dat"); 
            return true;
        }else{
            return false;
        }
    }
}
