package recursosHumanos;
import academico.*;

import java.util.Scanner;

public class Funcionario extends Pessoa
{
    private String ctps;
    private double salario;
    
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
    
    public boolean setSalario(double salario)
    {
        if (salario > 0) {
            this.salario = salario;
            return true;
        }else{
            System.out.println("Salario invalido!");
            return false;
        }
    }
    
    public String getCtps(){
        return this.ctps;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void lerDados()
    {
        Scanner s = new Scanner(System.in);
        
        super.lerDados();
        System.out.println("Digite a CTPS:");
        while (!setCtps(s.nextLine()));
        
        System.out.println("Digite o salário:");
        while (!setSalario(s.nextDouble()));
    }
    
    public void mostrarDados()
    {
        super.mostrarDados();
        System.out.println("CTPS: "+this.ctps);
        System.out.println("Salario: "+this.salario);
    }
}