import java.util.Scanner;
public class Aluno
{
        String nome;
        String matricula;
        int cpf;
        
        Curso curso;
        
       public void lerDados()  /* le os atributos da classe Aluno*/
        {       
            Scanner s = new Scanner(System.in);    
            
            System.out.println("Digite o nome do aluno:");   
            this.nome = s.nextLine();  
            
            System.out.println("Digite a matricula do aluno:");   
            this.matricula = s.nextLine();  
            
            System.out.println("CPF do aluno:");               
            this.cpf = s.nextInt();       
            
            System.out.println("Digite o curso do aluno:");  
            this.curso = new Curso();  
            this.curso.lerDados();
        } 
        
       public void mostrarDados() 
        {           
            System.out.println("Nome: "+this.nome);        
            System.out.println("Matricula: "+this.matricula);       
            System.out.println("CPF: "+this.cpf);    
            this.curso.mostrarDados();       
        }
}
