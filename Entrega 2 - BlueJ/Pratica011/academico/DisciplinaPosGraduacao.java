package academico;
import recursosHumanos.*;

import java.util.Scanner;
import java.io.Serializable;


public class DisciplinaPosGraduacao extends Disciplina implements Serializable
{
       
    @Override
    public void setCurso(Curso curso){
        super.setCurso(curso);
    }
    
    @Override
    public void setProfessor(Professor professor){
        super.setProfessor(professor);
    }
        
    @Override
    public boolean setNome(String nome){
        return super.setNome(nome);
    }
    
    @Override
    public boolean setCodigo(String codigo){
        return super.setCodigo(codigo);
    }
    
    @Override
    public boolean setCargaHoraria(String carga_horaria){
        return super.setCargaHoraria(carga_horaria);
    }
    
    @Override
    public String getNome(){
        return super.getNome();
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getCodigo(){
        return super.getCodigo();
    }
    
    @Override
    public String getCargaHoraria(){
        return super.getCargaHoraria();
    }
    
    @Override
    public Professor getProfessor(){
        return super.getProfessor();
    }
    
    @Override
    public void lerDados(){
        System.out.println("ENTRE COM OS DADOS DA DISCIPLINA DE POS GRADUACAO:");
        super.lerDados();
    }    
    
    @Override
    public void mostrarDados(){        
        System.out.println("DADOS DA DISCIPLINA DE POS GRADUACAO:");
        super.mostrarDados();
    }
    
}