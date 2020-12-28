package academico;
import recursosHumanos.*;

import java.util.Scanner;
import java.io.Serializable;
 

public class DisciplinaGraduacao extends Disciplina implements Serializable
{       
    public void setCurso(Curso curso){
        super.setCurso(curso);
    }
    
    public void setProfessor(Professor professor){
        super.setProfessor(professor);
    }
        
    public boolean setNome(String nome){
        return super.setNome(nome);
    }
    
    public boolean setCodigo(String codigo){
        return super.setCodigo(codigo);
    }
    
    public boolean setCargaHoraria(String carga_horaria){
        return super.setCargaHoraria(carga_horaria);
    }
    
    public String getNome(){
        return super.getNome();
    }
    
    public String getCodigo(){
        return super.getCodigo();
    }
    
    public String getCargaHoraria(){
        return super.getCargaHoraria();
    }
    
    @Override
    public Professor getProfessor(){
        return super.getProfessor();
    }
    
    public void lerDados(){
        System.out.println("ENTRE COM OS DADOS DA DISCIPLINA DE GRADUACAO:");
        super.lerDados();
    }    
    
    public void mostrarDados(){  
        System.out.println("DADOS DA DISCIPLINA DE GRADUACAO:");      
        super.mostrarDados();
        //this.curso.mostrarDados();
    }
    
}