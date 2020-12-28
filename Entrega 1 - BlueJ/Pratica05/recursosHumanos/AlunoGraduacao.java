package recursosHumanos;
import academico.*;

import java.util.Scanner;

public class AlunoGraduacao extends Aluno
{
    private String graduacao;
    private String universidade;    
    private int ano_inicio;
    private int ano_fim;
    
    public boolean setGraduacao(String graduacao)
    {
        if(graduacao.length() > 0){
            this.graduacao=graduacao;
            return true;
        }else{
            System.out.println("Graduacao invalida!");
            return false;
        }
    }
    
    public boolean setUniversidade(String universidade)
    {
        if(universidade.length() > 0){
            this.universidade = universidade;
            return true;
        }else{
            System.out.println("Universidade invalida!");
            return false;
        }
    }
    
    public boolean setAno_inicio(int ano_inicio)
    {
         if (ano_inicio > 0) {
             this.ano_inicio = ano_inicio;
             return true;
        }else{
            System.out.println("Ano de inicio invalido!");
            return false;
        }
    }
    
    public boolean setAno_fim(int ano_fim)
    {
        if (ano_fim > 0) {
            this.ano_fim = ano_fim;
            return true;
        }else{
            System.out.println("Ano de conclusao invalido!");
            return false;
        }
    }
    
    public String getGraduacao(){
        return this.graduacao;
    }
    
    public String getUniversidade(){
        return this.universidade;
    }
    
    public int getAno_inicio(){
        return this.ano_inicio;
    }
    
    public int getAno_fim(){
        return this.ano_fim;
    }   
    
    public void lerDados()  /* le os atributos da classe Aluno*/
     {
         System.out.println("Digite os dados do aluno de pos-graduacao:");  
         super.lerDados();
         Scanner s = new Scanner(System.in);    
                        
         System.out.println("Digite a graduacao:");   
         while (!setGraduacao(s.nextLine()));   
         
         System.out.println("Digite a universidade que graduou:");   
         while (!setUniversidade(s.nextLine())); 
         
         System.out.println("Digite o ano de ingresso:");   
         while (!setAno_inicio(s.nextInt()));  
         
         System.out.println("Digite o ano de conclusao:");   
         while (!setAno_fim(s.nextInt()));       
            
        } 
        
    public void mostrarDados() 
     {      
         super.mostrarDados();      
         System.out.println("Graduacao: "+this.graduacao); 
         System.out.println("Universidade (Graduacao): "+this.universidade); 
         System.out.println("Ano ingresso (Graduacao): "+this.ano_inicio); 
         System.out.println("Ano conclusao (Graduacao): "+this.ano_fim);   
        }
}