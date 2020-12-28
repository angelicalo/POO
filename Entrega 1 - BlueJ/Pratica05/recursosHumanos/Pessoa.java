package recursosHumanos;
import academico.*;

import static java.lang.Integer.*;
import java.util.Scanner;

public class Pessoa
{
    private String nome; 
    private String endereco;
    private String telefone;
    private String cpf;
    
    public boolean setNome(String nome)
    {
        if(nome.length() > 0){
            this.nome = nome;
            return true;
        }else{
            System.out.println("Nome invalido!");
            return false;
        }
    }
    
    public boolean setEndereco(String endereco)
    {
        if(endereco.length() > 0){
            this.endereco = endereco;
            return true;
        }else{
            System.out.println("Endereco invalido!");
            return false;
        }
    }
    
    public boolean setTelefone(String telefone)
    {
        if(telefone.length() > 0){
            this.telefone = telefone;
            return true;
        }else{
            System.out.println("Telefone invalido!");
            return false;
        }
    }
    
    public boolean setCpf(String cpf)
    {        
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
                
        if (cpf.length() != 11 || 
            cpf.charAt(0)==cpf.charAt(1) && cpf.charAt(1)==cpf.charAt(2) && 
            cpf.charAt(2)==cpf.charAt(3) && cpf.charAt(3)==cpf.charAt(4) && 
            cpf.charAt(4)==cpf.charAt(5) && cpf.charAt(5)==cpf.charAt(6) && 
            cpf.charAt(6)==cpf.charAt(7) && cpf.charAt(7)==cpf.charAt(8) && 
            cpf.charAt(8)==cpf.charAt(9) && cpf.charAt(9)==cpf.charAt(10)){ 
            System.out.println("CPF invalido!");
            return false;
        }
         
        var soma = 0;
        var resto = 0;
        for (int i = 0; i < 9; i++) {
            soma = soma + Integer.parseInt(cpf.substring(i, i + 1)) * (11 - i - 1);
        }
                
        resto = (soma * 10) % 11;
        
        if ((resto == 10) || (resto == 11)) {
            resto = 0;
        }
        
        if (resto != Integer.parseInt(cpf.substring(9,10))){            
            System.out.println("CPF invalido!");
            return false;
        }
                
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma = soma + Integer.parseInt(cpf.substring(i, i + 1)) * (12 - i - 1);
        }
                
        resto = (soma * 10) % 11;
                
        if ((resto == 10) || (resto == 11))  {
            resto = 0;
        }
        
        if (resto != Integer.parseInt(cpf.substring(10,11))) {            
            System.out.println("CPF invalido!");
            return false;
        }
        
        this.cpf = cpf;
        return true;    
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEndereco(){
        return this.nome;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void lerDados() 
    {    
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o nome:");   
        while (!setNome(s.nextLine()));           /* this.ATRIBUTO indica que o ATRIBUTO que esta utilizando eh local */
        
        System.out.println("Digite o endereço:");   
        while (!setEndereco(s.nextLine()));
        
        System.out.println("Digite o telefone:");   
        while (!setTelefone(s.nextLine())); 
        
        System.out.println("Digite o CPF:");   
        while (!setCpf(s.nextLine()));  
    }
    
    public void mostrarDados() 
    {  
        System.out.println("Nome: "+this.nome);  
        System.out.println("Endereco: "+this.endereco);        
        System.out.println("Telefone: "+this.telefone);       
        System.out.println("CPF: "+this.cpf);   
    }
}