package academico;
import recursosHumanos.*;

import java.util.Scanner;

public class Curso
{
    private String nome;
    private String duracao;
    private String codigo;
    
    public boolean setNome(String nome)
    {
        if(nome.length() > 0) {
            this.nome=nome;
            return true;
        }else{
            System.out.println("Nome do curso invalido!");
            return false;
        }
    }
    
    public boolean setDuracao(String duracao)
    {
        if (duracao.length() > 0) {
            this.duracao = duracao;
            return true;
        }else{
            System.out.println("Duracao do curso invalida!");
            return false;
        }
    }
    
    public boolean setCodigo(String codigo)
    {
        if (codigo.length() > 0) {
            this.codigo = codigo;
            return true;
        }else{
            System.out.println("Codigo do curso invalido!");
            return false;
        }
    }  
    
    public String getNome(){
        return this.nome;
    }
    
    public String getDuracao(){
        return this.duracao;
    }
        
    public String getCodigo(){
        return this.codigo;
    }
    
    public void lerDados()  /* le os atributos da classe CursoGraduacao*/
    {       
        Scanner s = new Scanner(System.in); 
        
        System.out.println("Digite o nome do curso:");   
        while (!setNome(s.nextLine()));  
        
        System.out.println("Digite a duracao do curso:");    
        while (!setDuracao(s.nextLine()));   
        
        System.out.println("Digite o codigo do curso:");              
        while (!setCodigo(s.nextLine()));      
    }        
    
    public void mostrarDados() 
    {                  
        System.out.println("DADOS DO CURSO");
        System.out.println("Nome curso: "+this.nome);       
        System.out.println("Duracao curso: "+this.duracao);  
        System.out.println("Codigo curso: "+this.codigo);                
    }
}