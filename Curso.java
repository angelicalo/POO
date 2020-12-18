import java.util.Scanner;
public class Curso
{
  String nome;
  int codigo;
  int duracao;
        
       public void lerDados()  /* le os atributos da classe Curso*/
        {       
            Scanner s = new Scanner(System.in); 
            
            System.out.println("Digite o nome do curso:");   
            this.nome = s.nextLine();     
            
            System.out.println("Digite o codigo do curso:");   
            this.codigo = s.nextInt();
            
            System.out.println("Digite a duracao do curso:");               
            this.duracao = s.nextInt();      
        }        
        
       public void mostrarDados() 
        {           
            System.out.println("Codigo: "+this.codigo);        
            System.out.println("Nome: "+this.nome);       
            System.out.println("Duracao: "+this.duracao);                 
        }
}
