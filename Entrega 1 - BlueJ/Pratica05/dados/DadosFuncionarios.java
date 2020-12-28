package dados;
import academico.*;
import recursosHumanos.*;

import java.util.ArrayList;

class DadosFuncionarios{
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
    public void cadastrar(Funcionario f) {
        this.funcionarios.add(f); //ADICIONA O ALUNO NO ARRAY
        System.out.println("Total de funcionarios inseridos...: ");
        System.out.println(this.funcionarios.size());
    }
    
    public void listar(){
        for (Funcionario objeto: this.funcionarios) {
            objeto.mostrarDados();//método mostrarDados() já implementado na prática anterior
        }
    }
    //este método retorna o objeto Aluno caso encontrado, ou null, caso não encotrado
    public Funcionario buscar(String cpf) {
        Funcionario f = null; 
        for ( Funcionario objeto: this.funcionarios) {
            if (objeto.getCpf().equals(cpf)) {
                f = objeto;
                break;
            }
        }
        return f;
    }
    //este método usa o método buscar já implementado
    public boolean excluir(String cpf){
        Funcionario f = this.buscar(cpf);
        if (f != null) {
            this.funcionarios.remove(f);
            return true;
        }else{
            return false;
        }
    }
}
