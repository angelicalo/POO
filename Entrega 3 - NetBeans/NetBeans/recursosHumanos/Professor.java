package recursosHumanos; 
import entradas.*;

import java.util.Scanner; 

import java.io.Serializable;

public class Professor extends Funcionario implements Pesquisador, Serializable
{ 
    private String titulacao;
    private String areaPesquisa;
    private double salario;    
    private double numeroHorasAula;
    private static double valorHoraAula = 18;
    
    @Override
    public boolean setNome(String nome){
        return super.setNome(nome);
    } 
    
    @Override
    public boolean setEndereco(String endereco){
        return super.setEndereco(endereco);
    } 
    
    @Override
    public boolean setTelefone(String telefone){
        return super.setTelefone(telefone);
    } 
    
    @Override
    public boolean setCpf(String cpf){
        return super.setCpf(cpf);
    } 
     
    @Override
    public String getNome(){ 
        return super.getNome();
    }
       
    @Override
    public String getEndereco(){
        return super.getEndereco();
    }
       
    @Override
    public String getTelefone(){
        return super.getTelefone();
    }    
       
    @Override
    public String getCpf(){
        return super.getCpf();
    }
    
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
    
    public boolean setAreaPesquisa(String areaPesquisa)
    {
        if (areaPesquisa.length() > 0) {
            this.areaPesquisa = areaPesquisa;
            return true;
        }else{
            System.out.println("Area de pesquisa invalida!");
            return false;
        }
    }
    
    @Override
    public boolean setSalario(double salario)
    {   
        if (salario >= 0) {
            this.salario = salario;
            return true;
        }else{
            System.out.println("Valores invalidos!");
            return false;
        }
    }
    
    public boolean setNumeroHorasAula(double numeroHorasAula)
    {
        if (numeroHorasAula >= 0) {
            this.numeroHorasAula = numeroHorasAula;            
            this.setSalario(calcSalario());
            return true;
        }else{
            System.out.println("Valor invalido!");
            return false;
        }
    }    
    
    public static boolean setValorHoraAula(double valor){
        if (valor >= 0) {  
            valorHoraAula = valor;     
            return true;
        }else{
            System.out.println("Valor invalido!");
            return false;
        }
    }
    
    public String getTitulacao(){
        return this.titulacao;
    } 
    
    public String getAreaPesquisa(){
        return this.areaPesquisa;
    }
    
    @Override
    public double calcSalario(){
        this.setSalario(this.getNumeroHorasAula() * getValorHoraAula());
        return this.getSalario();
    }
    
    @Override
    public double getSalario(){
        return this.salario;
    }
    
    public double getNumeroHorasAula(){ 
        return this.numeroHorasAula;
    }
    
    public static double getValorHoraAula(){
        return valorHoraAula;
    }
    
    @Override
    @SuppressWarnings("empty-statement")
    public void lerDados()  /* le os atributos da classe Professor*/
    {   
        super.lerDados();
        
        Scanner s = new Scanner(System.in);  
        
        System.out.println("Digite a titulacao:");   
        while (!setTitulacao(s.nextLine()));  
        
        System.out.println("Digite a area de pesquisa:");   
        while (!setAreaPesquisa(s.nextLine())); 
                
        System.out.println("Digite o numero Horas/Aula:"); 
        setNumeroHorasAula(EntradaDeDados.lerDouble());     
        
        this.setSalario(this.calcSalario());
    } 
    
    @Override
    public void mostrarDados() 
    {   
        System.out.println("DADOS DO PROFESSOR:");
        super.mostrarDados(); 
        System.out.println("Titulacao: "+ this.getTitulacao());
        System.out.println("Area de pesquisa: "+ this.getAreaPesquisa());
        System.out.println("Salario bruto: "+ this.getSalario());         
    }
}