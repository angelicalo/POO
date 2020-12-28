//package dados;
package persistencia; 
import recursosHumanos.*;

import java.util.ArrayList;

public abstract class DadosPessoas
{
    private static ArrayList<Pessoa> pessoas;
    
    static{
        pessoas = (ArrayList<Pessoa>)Persistencia.recuperar("pessoas.dat");
        if (pessoas == null)
            pessoas = new ArrayList<Pessoa>();
    }  
    
    public static void cadastrar(Pessoa p) {
        pessoas.add(p); 
        Persistencia.gravar(pessoas, "pessoas.dat"); 
        System.out.println("Total de pessoas inseridos: " + pessoas.size());
    }
    
    public static void listar(){
        for (Pessoa objeto: pessoas) {
            objeto.mostrarDados();//método mostrarDados() já implementado na prática anterior
        }
    }
    //este método retorna o objeto Aluno caso encontrado, ou null, caso não encotrado
    public static Pessoa buscar(String cpf) {
        Pessoa p = null; 
        for ( Pessoa objeto: pessoas) {
            if (objeto.getCpf().equals(cpf)) {
                p = objeto;
                break;
            }
        }
        return p;
    }
    //este método usa o método buscar já implementado
    public static boolean excluir(String cpf){
        Pessoa p = buscar(cpf);
        if (p != null) {
            pessoas.remove(p);
            Persistencia.gravar(pessoas, "pessoas.dat"); 
            return true;
        }else{
            return false;
        }
    }
}
