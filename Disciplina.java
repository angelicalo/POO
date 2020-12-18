import java.util.Scanner;
public class Disciplina
{
    String nome;
    int codigo;
    int carga_horaria;
    
    Curso curso;
    Professor professor;
        
    public void lerDados()  /* le os atributos da classe Disciplina*/
     {     
         Scanner s = new Scanner(System.in);   
            
         System.out.println("Digite o nome da disciplina:");
         this.nome = s.nextLine(); 
         
         System.out.println("Digite o codigo da disciplina:");
         this.codigo = s.nextInt(); 
         
         System.out.println("Digite a carga horaria da disciplina:");  
         this.carga_horaria = s.nextInt();       
            
         System.out.println("Digite o curso da disciplina:");  
         this.curso = new Curso();  
         this.curso.lerDados();
            
         System.out.println("Digite o professor da disciplina:");  
         this.professor = new Professor(); 
         this.professor.lerDados(); 
        } 
        
    public void mostrarDados() 
     {      
         System.out.println("Codigo: "+this.codigo); 
         System.out.println("Nome: "+this.nome);       
         System.out.println("Carga horaria: "+this.carga_horaria);                    
        }
}