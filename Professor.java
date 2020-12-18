import java.util.Scanner;
public class Professor
{
    String nome; 
    String endereco;
    String telefone;
    String cpf;
    String ctps;
    Double salario;
    String titulacao;
    String area_pesquisa;
        
    public void lerDados()  /* le os atributos da classe Professor*/
     {   
         Scanner s = new Scanner(System.in);  
         System.out.println("Digite o nome do professor:"); 
         nome = s.nextLine();           /* this.ATRIBUTO indica que o ATRIBUTO que esta utilizando eh local */
        
         System.out.println("Digite o endereço do professor:");   
         this.endereco = s.nextLine();
        
         System.out.println("Digite o telefone do professor:");   
         this.telefone = s.nextLine(); 
        
         System.out.println("Digite o CPF do professor:");   
         this.cpf = s.nextLine();   
        
         System.out.println("Digite a CTPS do professor:");   
         this.ctps = s.nextLine(); 
        
         System.out.println("Digite o salário do professor:");   
         this.salario = s.nextDouble();  
           
         System.out.println("Digite a titulacao do professor:");   
         this.titulacao = s.nextLine();  
           
         System.out.println("Digite a area de pesquisa do professor:");   
         this.area_pesquisa = s.nextLine();   
     } 
    
    public void mostrarDados() 
     {  
         System.out.println("Nome: "+this.nome);  
         System.out.println("Endereco: "+this.endereco);        
         System.out.println("Telefone: "+this.telefone);       
         System.out.println("CPF: "+this.cpf);      
         System.out.println("CTPS: "+this.ctps);       
         System.out.println("Salario: "+this.salario);  
         System.out.println("Titulacao: "+this.titulacao);
         System.out.println("Area de pesquisa: "+this.area_pesquisa); 
     }
}
