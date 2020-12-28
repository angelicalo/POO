package recursosHumanos;
import academico.*;

import java.util.Scanner;

public class Aluno extends Pessoa
{
    private String matricula;
    private String situacao;
    private byte cod_situacao;
    
    Curso curso;
    public void setCurso(Curso curso){
        this.curso = curso;
    }
    
    public boolean setMatricula(String matricula)
    {
        if (matricula.length() > 0) {
            this.matricula = matricula;
            return true;
        }else{
            System.out.println("Matricula invalida!");
            return false;
        }
    }
            
    public boolean setSituacao(String situacao)
    {
        this.situacao = situacao;
        
        if(this.situacao.equals("M") || this.situacao.equals("T") || this.situacao.equals("D")){
            if (this.situacao.equals("M")) {
                this.cod_situacao = 1;
            }
            if (this.situacao.equals("T")) {
                this.cod_situacao = 2;
            }
            if (this.situacao.equals("D")) {
                this.cod_situacao = 3;
            }
            return true;
        }else{
           System.out.println("Situacao de matricula invalida!");
           return false;
        }
    } 
    
    public Curso getCurso(){
        return this.curso;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public String getSituacao(){
        return this.situacao;
    }
            
    public void lerDados()
    {
        super.lerDados();
        Scanner s = new Scanner(System.in);
        
        System.out.println("Matricula do aluno:");
        while (!setMatricula(s.nextLine()));
        
        System.out.println("Qual a situacao da matricula: (M)atriculado | (T)trancado | (D)esligado");
        while (!setSituacao(s.nextLine()));
        
        System.out.println("Digite dados do curso do aluno:");
        this.curso = new Curso();
        this.curso.lerDados();  
    }
    
    public void mostrarDados()
    {        
        System.out.println("DADOS DO ALUNO");
        super.mostrarDados();
        System.out.println("Matricula: "+this.matricula);
        
        if (this.cod_situacao == (1)) {
            System.out.println("Aluno Matriculado");
        }
        if (this.cod_situacao == (2)) {
            System.out.println("Aluno com matricula Trancada");
        }
        if (this.cod_situacao == (3)) {
            System.out.println("Aluno foi Desligado");
        }    
        this.curso.mostrarDados();
    }  
}