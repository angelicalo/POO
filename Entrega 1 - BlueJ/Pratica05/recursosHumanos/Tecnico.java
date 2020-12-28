package recursosHumanos;
import academico.*;

import java.util.Scanner;

public class Tecnico extends Funcionario 
{
    private String cargo;
    private String departamento;
    
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
    
    public String getCargo(){
        return this.cargo;
    }
    
    public String getDepartamento(){
        return this.departamento;
    }
    
    public void lerDados()  /* le os atributos da classe Tecnico*/
     {  
         super.lerDados();
         Scanner s = new Scanner(System.in); 
        
         System.out.println("Digite o cargo:");   
         while (!setCargo(s.nextLine()));  
            
         System.out.println("Digite o departamento:");   
         while (!setDepartamento(s.nextLine()));  
     } 
     
    public void mostrarDados() 
     {  
         System.out.println("DADOS DO TECNICO ADMINISTRATIVO");
         super.mostrarDados();
         System.out.println("Cargo: "+this.cargo);
         System.out.println("Departamento: "+this.departamento); 
     }
}