package recursosHumanos;

import java.io.Serializable;
import java.util.ArrayList;

public class FolhaPagamento implements Serializable
{

    /**
     * @param totalFolha the totalFolha to set
     */
    public void setTotalFolha(double totalFolha) {
        this.totalFolha = totalFolha;
    }
    
    private double totalFolha = 0;     
    public void somaFolha(ArrayList<? extends Funcionario > funcionarios) {
        for ( Funcionario f : funcionarios){
            this.setTotalFolha(0);
            this.setTotalFolha(this.getTotalFolha() + f.calcSalario());
            System.out.printf("\n Nome: %s \n Salario: %1.2f \n Categoria: %s \n", f.getNome(), f.getSalario(), f.getClass().getName());
        }
        System.out.printf("Valor total das folhas de pagamento inseridas:" + this.getTotalFolha());
    }
    
    public double getTotalFolha(){
        return this.totalFolha;
    }
    
    public double getTotalEncargos(){
        return (this.getTotalFolha() * 0.3378);
    }
    
    public double getCalcINSS(Funcionario f){
        return (f.getSalario() * 0.11);
    }
    
    public double calcIRRF(Funcionario f){
        double calc = 0;
        
        if (f.calcSalario() > 3000)
            calc = f.calcSalario()*0.275;            
        else if (f.calcSalario() > 1500) 
            calc = f.calcSalario()*0.15;
            
        return calc;
    }
    
    public double salarioBruto(Funcionario f){
        return f.getSalario();
    }
    
    public double salarioLiquido(Funcionario f){
        double impostos = getCalcINSS(f) + calcIRRF(f);
        return (f.calcSalario() - impostos);
    }
    
    public void relatorioFolha(ArrayList<? extends Funcionario > funcionarios){
        for ( Funcionario f : funcionarios){
            f.mostrarDados();
            System.out.printf("\nIRRF: %s \nINSS: %s \nSalario liquido: %1.2f\n", calcIRRF(f), getCalcINSS(f), salarioLiquido(f));
        }
    }
}