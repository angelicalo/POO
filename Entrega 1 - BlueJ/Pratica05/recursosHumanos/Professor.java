package recursosHumanos;
import academico.*;

import java.util.Scanner;

public class Professor extends Funcionario 
{
    private String titulacao;
    private String area_pesquisa;
    
    public boolean setTitulacao(String titulacao)
    {
        if (titulacao.length() > 0) {
            this.titulacao = titulacao;
            return true;
        }else{
            System.out.println("Titulacao invalida!");
            return false;
        }
    }
    
    public boolean setArea_pesquisa(String area_pesquisa)
    {
        if (area_pesquisa.length() > 0) {
            this.area_pesquisa = area_pesquisa;
            return true;
        }else{
            System.out.println("Area de pesquisa invalida!");
            return false;
        }
    }
    
    public String getTitulacao(){
        return this.titulacao;
    }
    
    public String getArea_pesquisa(){
        return this.area_pesquisa;
    }
    
    public void lerDados()  /* le os atributos da classe Professor*/
    {   
        super.lerDados();
        Scanner s = new Scanner(System.in);  
        
        System.out.println("Digite a titulacao:");   
        while (!setTitulacao(s.nextLine()));  
        
        System.out.println("Digite a area de pesquisa:");   
        while (!setArea_pesquisa(s.nextLine()));   
    } 
    
    public void mostrarDados() 
    {   
        System.out.println("DADOS DO PROFESSOR:");
        super.mostrarDados(); 
        System.out.println("Titulacao: "+this.titulacao);
        System.out.println("Area de pesquisa: "+this.area_pesquisa);         
    }
}