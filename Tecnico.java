import java.util.Scanner;
public class Tecnico
{
    String nome; 
    String endereco;
    String telefone;
    String cpf;
    String ctps;
    Double salario;
    String cargo;
    String departamento;
        
    public void lerDados()  /* le os atributos da classe Tecnico*/
     {       
        Scanner s = new Scanner(System.in); 
        System.out.println("Digite o nome do funcionário:");   
        this.nome = s.nextLine();           /* this.ATRIBUTO indica que o ATRIBUTO que esta utilizando eh local */
        
        System.out.println("Digite o endereço do funcionário:");   
        this.endereco = s.nextLine();
        
        System.out.println("Digite o telefone do funcionário:");   
        this.telefone = s.nextLine(); 
        
        System.out.println("Digite o CPF do funcionário:");   
        this.cpf = s.nextLine();   
        
        System.out.println("Digite a CTPS do funcionário:");   
        this.ctps = s.nextLine(); 
        
        System.out.println("Digite o salário do funcionário:");   
        this.salario = s.nextDouble();   
            
        System.out.println("Digite o cago do funcionario:");   
        this.cargo = s.nextLine();  
            
        System.out.println("Digite o departamento do funcionario:");   
        this.departamento = s.nextLine();  
     } 
    public void mostrarDados() 
     {       
        System.out.println("Nome: "+this.nome);  
        System.out.println("Endereco: "+this.endereco);        
        System.out.println("Telefone: "+this.telefone);       
        System.out.println("CPF: "+this.cpf);      
        System.out.println("CTPS: "+this.ctps);       
        System.out.println("Salario: "+this.salario);
       System.out.println("Cargo: "+this.cargo);
       System.out.println("Departamento: "+this.departamento); 
     }
}
