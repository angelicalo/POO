package dados;
import academico.*;
import recursosHumanos.*;

import java.util.ArrayList;

class DadosTecnicos{
    private ArrayList<Tecnico> tecnicos = new ArrayList<Tecnico>();
    
    public void cadastrar(Tecnico t) {
        this.tecnicos.add(t); //ADICIONA O ALUNO NO ARRAY
        System.out.println("Total de tecnicos inseridos...: ");
        System.out.println(this.tecnicos.size());
    }
    
    public void listar(){
        for (Tecnico objeto: this.tecnicos) {
            objeto.mostrarDados();//método mostrarDados() já implementado na prática anterior
        }
    }
    //este método retorna o objeto Aluno caso encontrado, ou null, caso não encotrado
    public Tecnico buscar(String cpf) {
        Tecnico t = null; 
        for ( Tecnico objeto: this.tecnicos) {
            if (objeto.getCpf().equals(cpf)) {
                t = objeto;
                break;
            }
        }
        return t;
    }
    //este método usa o método buscar já implementado
    public boolean excluir(String cpf){
        Tecnico t = this.buscar(cpf);
        if (t != null) {
            this.tecnicos.remove(t);
            return true;
        }else{
            return false;
        }
    }
}
