package recursosHumanos;

import java.io.Serializable;

import java.util.Scanner;

public abstract class Funcionario extends Pessoa implements Serializable
{
    private static double pisoSalarial = 678;
    private double salario;
    private String ctps;    
    
    @Override
    public String getTipo(){
        return this.getClass().getName();
    }
     
    /**
     *
     * @return
     */
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
    
    public abstract double calcSalario();   
        
    public static boolean setPisoSalarial(double piso){        
        if (piso >= 0) {
            pisoSalarial = piso;
            return true;
        }else{
            System.out.println("Valores invalidos!");
            return false;
        }
    }    
    
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
    
    public boolean setCtps(String ctps)
    {
        if (ctps.length() > 0) {
            this.ctps = ctps;
            return true;
        }else{
            System.out.println("CTPS invalida!");
            return false;
        }
    }    

    public static double getPisoSalarial(){
        return pisoSalarial;
    }   
    
    public double getSalario(){
        return this.salario;
    }
    
    public String getCtps(){
        return this.ctps;
    }
    
    /**
     *
     */
    @Override
    @SuppressWarnings("empty-statement")
    public void lerDados()
    {
        Scanner s = new Scanner(System.in);        
        super.lerDados();
        System.out.println("Digite a CTPS:");
        while (!setCtps(s.nextLine()));
        
        //System.out.println("Digite o salario:");
        //setSalario(EntradaDeDados.lerDouble());
    }
    
    @Override
    public void mostrarDados()
    {
        super.mostrarDados();
        //System.out.println("Salario: "+this.salario);
        System.out.println("CTPS: "+this.getCtps());
    }
}