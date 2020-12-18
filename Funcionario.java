import java.util.Scanner;
public class Funcionario
{
    /* A a; A eh um objeto e a eh atributo do objeto A*/
    String nome; 
    String endereco;
    String telefone;
    String cpf;
    String ctps;
    Double salario;
    
    public void lerDados() 
    {      
        Scanner s = new Scanner(System.in); /* renomeou o comando de criar novo scanner para s (s e uma classe, 
                                               pois Scanner eh). s e um leitor de dados
                                               para cada entrada de dado o dado e salvo em sua respectiva variavel*/
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
    }  
        
    public void mostrarDados() 
     {           
        System.out.println("Nome: "+this.nome);  
        System.out.println("Endereco: "+this.endereco);        
        System.out.println("Telefone: "+this.telefone);       
        System.out.println("CPF: "+this.cpf);      
        System.out.println("CTPS: "+this.ctps);       
        System.out.println("Salario: "+this.salario);
     }
}
