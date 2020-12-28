    package academico;
     
    import java.util.*;
    import java.io.Serializable;
    
    public abstract class Curso implements Serializable
    {
        private String nome;
        private String duracao;
        private String codigo;
        
        private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
        
        public void cadastrar(Disciplina d) {
            this.disciplinas.add(d); //ADICIONA O ALUNO NO ARRAY
            System.out.println("Total de disciplinas inseridas no curso: " + this.disciplinas.size());
        }
        
        public Disciplina buscar(String codigo) {
            Disciplina d = null; 
            for ( Disciplina objeto: this.disciplinas) {
                if (objeto.getCodigo().equals(codigo)) {
                    d = objeto;
                    break;
                }
            }
            return d;
        }
        
        public void mostrarDisciplinas(){
            for (Disciplina d: disciplinas)
            d.mostrarDados();
        }
    
        public boolean excluir(String codigo){
            Disciplina d = this.buscar(codigo);
            if (d != null) {
                this.disciplinas.remove(d);
                return true;
            }else{
                return false;
            }
        }
        
        public boolean setNome(String nome)
        {
            if(nome.length() > 0) {
                this.nome=nome;
                return true;
            }else{
                System.out.println("Nome do curso invalido!");
                return false;
            }
        }
        
        public boolean setDuracao(String duracao)
        {
            if (duracao.length() > 0) {
                this.duracao = duracao;
                return true;
            }else{
                System.out.println("Duracao do curso invalida!");
                return false;
            }
        }
        
        public boolean setCodigo(String codigo)
        {
            if (codigo.length() > 0) {
                this.codigo = codigo;
                return true;
            }else{
                System.out.println("Codigo do curso invalido!");
                return false;
            }
        }  
        
        public String getNome(){
            return this.nome;
        }
        
        public String getDuracao(){
            return this.duracao;
        }
            
        public String getCodigo(){
            return this.codigo;
        }
        
        public void lerDados()  /* le os atributos da classe Curso*/
        {       
            Scanner s = new Scanner(System.in); 
            
            System.out.println("Digite o nome do curso:");   
            while (!setNome(s.nextLine())){
            }  
            
            System.out.println("Digite a duracao do curso:");    
            while (!setDuracao(s.nextLine())){
            }     
            
            System.out.println("Digite o codigo do curso:");              
            while (!setCodigo(s.nextLine())){
            }        
        }        
        
        public void mostrarDados() 
        {                  
            System.out.println("Nome curso: "+this.nome);       
            System.out.println("Duracao curso: "+this.duracao);  
            System.out.println("Codigo curso: "+this.codigo);                
        }
}