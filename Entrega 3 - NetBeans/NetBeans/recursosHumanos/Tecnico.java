package recursosHumanos;
import entradas.*;

import java.util.Scanner;

import java.io.Serializable;

public class Tecnico extends Funcionario implements Serializable 
{
    private String cargo; 
    private String departamento;
    private static double salarioBase = 600;
    private static double valorHoraExtra = 30;
    private double quantidadeHoraExtra;
    private double salario;
    
    public boolean setCargo(String cargo)
    {
        if (cargo.length() > 0) {
            this.cargo = cargo;
            return true;
        }else{
            System.out.println("Cargo invalido");
            return false;
        }
    }
    
    public boolean setDepartamento(String departamento)
    {
        if (departamento.length() > 0) {
            this.departamento = departamento;
            return true;
        }else{
            System.out.println("Departamento invalido!");
            return false;
        }
    } 
    
    public static boolean setSalarioBase(double valor){
        if (valor >= 0){
            salarioBase = valor;
            return true; 
        }else{
            System.out.println("Valor invalido!");
            return false;
        }
    }    
    
    public static boolean setValorHoraExtra(double valor){
        if (valor >= 0) {  
            valorHoraExtra = valor;     
            return true;
        }else{
            System.out.println("Valor invalido!");
            return false;
        }
    }    
    
    public boolean setQuantidadeHoraExtra(double quantidadeHoraExtra)
    {
        if (quantidadeHoraExtra >= 0) {
            this.quantidadeHoraExtra = quantidadeHoraExtra;          
            this.setSalario(calcSalario());
            return true;
        }else{
            System.out.println("Valor invalido!");
            return false;
        }
    }    
    
    public boolean setSalario(double valor, double quantidade){
        if(valor >= 0 && quantidade >= 0) { 
            valorHoraExtra = valor;
            this.quantidadeHoraExtra = quantidade;
            double sal = calcSalario();
            this.salario = sal;
            return true;
        }else{
            System.out.println("Valores invalidos!");
            return false;
        }
    }
    
    public String getCargo(){
        return this.cargo;
    }
    
    public String getDepartamento(){
        return this.departamento;
    }       
    
    public double getSalarioBase(){
        return this.salarioBase;
    }
    
    public static double getValorHoraExtra(){
        return valorHoraExtra;
    }
    
    public double getQuantidadeHoraExtra(){
        return this.quantidadeHoraExtra;
    }
    
    @Override
    public double calcSalario(){
        return getSalarioBase() + (valorHoraExtra * this.quantidadeHoraExtra);
    }
    
    @Override
    public double getSalario(){
        return this.salario;
    }    
    
    @Override
    @SuppressWarnings("empty-statement")
    public void lerDados()  /* le os atributos da classe Tecnico*/
    {  
        super.lerDados();
        Scanner s = new Scanner(System.in); 
        
        System.out.println("Digite o cargo:");   
        while (!setCargo(s.nextLine()));  
        
        System.out.println("Digite o departamento:");   
        while (!setDepartamento(s.nextLine()));   
        
        System.out.println("Digite a quantidade de Hora Extra:"); 
        setQuantidadeHoraExtra(EntradaDeDados.lerDouble());   
        
        this.setSalario(this.calcSalario());
    } 
     
    public void mostrarDados() 
    {  
        System.out.println("DADOS DO TECNICO ADMINISTRATIVO");
        super.mostrarDados();
        System.out.println("Cargo: "+this.getCargo());
        System.out.println("Departamento: "+this.getDepartamento());
        System.out.println("Salario bruto: "+ this.getSalario());  
    }
}