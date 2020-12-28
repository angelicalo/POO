package academico;
import recursosHumanos.*;

import java.util.Scanner;

public class Disciplina
{
    private String nome;
    private String codigo;
    private int carga_horaria;
    
    Curso curso;
    Professor professor;
    
    public void setCurso(Curso curso){
        this.curso = curso;
    }
    
    public void setProfessor(Professor professor){
        this.professor= professor;
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
    
    public boolean setCarga_horaria(int carga_horaria)
    {
        if (carga_horaria > 0) {
            this.carga_horaria = carga_horaria;
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
    
    public int getCarga_horaria(){
        return this.carga_horaria;
    }
    
    public void lerDados()  /* le os atributos da classe Disciplina*/
    {     
        Scanner s = new Scanner(System.in);   
        
        System.out.println("Digite o nome da disciplina:");
        while (!setNome(s.nextLine())); 
        
        System.out.println("Digite o codigo da disciplina:");
        while (!setCodigo(s.nextLine())); 
        
        System.out.println("Digite a carga horaria da disciplina:");  
        while (!setCarga_horaria(s.nextInt()));       
        
        System.out.println("Digite os dados do curso da disciplina:");  
        this.curso = new Curso();  
        this.curso.lerDados();
        
        System.out.println("Digite os dados do professor da disciplina:");  
        this.professor = new Professor(); 
        this.professor.lerDados(); 
    } 
        
    public void mostrarDados() 
    {      
        System.out.println("DADOS DA DISCIPLINA:");
        System.out.println("Codigo: "+this.codigo); 
        System.out.println("Nome disciplia: "+this.nome);       
        System.out.println("Carga horaria: "+this.carga_horaria);
        this.curso.mostrarDados();
        this.professor.mostrarDados();
    }
}