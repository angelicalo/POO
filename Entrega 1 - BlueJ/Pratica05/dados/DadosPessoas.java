package dados;
import academico.*;
import recursosHumanos.*;

import java.util.ArrayList;

class DadosPessoas{
    private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    
    public void cadastrar(Pessoa p) {
        this.pessoas.add(p); //ADICIONA O ALUNO NO ARRAY
        System.out.println("Total de pessoas inseridos...: ");
        System.out.println(this.pessoas.size());
    }
    
    public void listar(){
        for (Pessoa objeto: this.pessoas) {
            objeto.mostrarDados();//método mostrarDados() já implementado na prática anterior
        }
    }
    //este método retorna o objeto Aluno caso encontrado, ou null, caso não encotrado
    public Pessoa buscar(String cpf) {
        Pessoa p = null; 
        for ( Pessoa objeto: this.pessoas) {
            if (objeto.getCpf().equals(cpf)) {
                p = objeto;
                break;
            }
        }
        return p;
    }
    //este método usa o método buscar já implementado
    public boolean excluir(String cpf){
        Pessoa p = this.buscar(cpf);
        if (p != null) {
            this.pessoas.remove(p);
            return true;
        }else{
            return false;
        }
    }
}
