package academico;
import recursosHumanos.*;
import entradas.*;

import java.util.Scanner;
import java.io.Serializable;


public abstract class Disciplina implements Serializable
{
    private String nome;
    private String codigo;
    private String cargaHoraria;
    
    Curso curso;
    Professor professor = new Professor();
    
    public void setCurso(Curso curso){
        this.curso = curso;
    }
    
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
        
    public boolean setNome(String nome)
    {
        if(nome.length() >0){
            this.nome=nome;
            return true;
        }else{
            System.out.println("Nome invalido!");
            return false;
        }
    }
    
    public boolean setCodigo(String codigo)
    {
        if (codigo.length() > 0) {
            this.codigo = codigo;
            return true;
        }else {
            System.out.println("Codigo invalido!");
            return false;
        }
    }
    
    public boolean setCargaHoraria(String carga_horaria)
    {
        if (carga_horaria.length() > 0) {
            this.cargaHoraria = carga_horaria;
            return true;
        }else{
            System.out.println("Carga horária inválida!");
            return false;
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    
    public String getCargaHoraria(){
        return this.cargaHoraria;
    }
    
    public Professor getProfessor(){
        return this.professor;
    }
    
    public void lerDados()  /* le os atributos da classe Disciplina*/
    {             
        Scanner s = new Scanner(System.in);   
        System.out.println("Digite a nome da disciplina:");
        while (!setNome(s.nextLine()));  
        
        System.out.println("Digite codigo da disciplina:");
        while (!setCodigo(s.nextLine()));  
        
        System.out.println("Digite a carga horaria da disciplina:");        
        while (!setCargaHoraria((s.nextLine())));
         
        System.out.println("Entre com os dados do professor da disciplina:");
        Professor professor = new Professor();
        professor.lerDados();
        this.professor = professor;
    } 
        
    public void mostrarDados() 
    {      
        System.out.println("Codigo: "+codigo); 
        System.out.println("Nome disciplia: "+ nome);       
        System.out.println("Carga horaria: "+ cargaHoraria);        
        this.professor.mostrarDados();
    }
}