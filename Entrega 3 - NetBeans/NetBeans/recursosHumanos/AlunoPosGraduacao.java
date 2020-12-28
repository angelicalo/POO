package recursosHumanos;
import academico.*;
import entradas.*; 
 
import java.io.Serializable;

import java.util.Scanner; 

public class AlunoPosGraduacao extends Aluno implements Pesquisador, Serializable
{
    private String nome; 
    private String endereco;
    private String telefone;
    private String cpf;
    
    @Override
    public boolean setNome(String nome){
        return super.setNome(nome);
    } 
    
    @Override
    public boolean setEndereco(String endereco){
        return super.setEndereco(endereco);
    } 
    
    @Override
    public boolean setTelefone(String telefone){
        return super.setTelefone(telefone);
    } 
    
    @Override
    public boolean setCpf(String cpf){
        return super.setCpf(cpf);
    } 

    /** 
     * @param cursoPosGraduacao the cursoPosGraduacao to set
     */
    
    private String graduacao;
    private String universidade;    
    private int ano_inicio;
    private int ano_fim;    
    
    private CursoPosGraduacao cursoPosGraduacao = new CursoPosGraduacao();
    
    public void setCursoPosGraduacao(CursoPosGraduacao cursoPosGraduacao) {
        this.cursoPosGraduacao = cursoPosGraduacao;
    }  
    
    @Override
    public String getTipo(){
        return this.getClass().getName();
    }
     
    @Override
    public String getNome(){
        return super.getNome();
    }
       
    @Override
    public String getEndereco(){
        return super.getEndereco();
    }
       
    @Override
    public String getTelefone(){
        return super.getTelefone();
    }    
       
    @Override
    public String getCpf(){
        return super.getCpf();
    } 
    
    public boolean setGraduacao(String graduacao)
    {
        if(graduacao.length() > 0){
            this.graduacao=graduacao;
            return true;
        }else{
            System.out.println("Graduacao invalida!");
            return false;
        }
    }
    
    public boolean setUniversidade(String universidade)
    {
        if(universidade.length() > 0){
            this.universidade = universidade;
            return true;
        }else{
            System.out.println("Universidade invalida!");
            return false;
        }
    }
    
    public boolean setAno_inicio(int ano_inicio)
    {
         if (ano_inicio > 0) {
             this.ano_inicio = ano_inicio;
             return true;
        }else{
            System.out.println("Ano de inicio invalido!");
            return false;
        }
    }
    
    public boolean setAno_fim(int ano_fim)
    {
        if (ano_fim > 0) {
            this.ano_fim = ano_fim;
            return true;
        }else{
            System.out.println("Ano de conclusao invalido!");
            return false;
        }
    }       
           
    public String getGraduacao(){
        return this.graduacao;
    }
    
    public String getUniversidade(){
        return this.universidade;
    }
    
    public int getAno_inicio(){
        return this.ano_inicio;
    }
    
    public int getAno_fim(){
        return this.ano_fim;
    }    
    
    @Override
    public CursoPosGraduacao getCurso(){
        return this.getCursoPosGraduacao();
    }
    
    public CursoPosGraduacao getCursoPosGraduacao(){ 
        return this.cursoPosGraduacao;
    }
    
    @Override
    public void lerDados()  /* le os atributos da classe Aluno de pos*/
    {
         System.out.println("Digite os dados do aluno de pos-graduacao:");  
         super.lerDados();
         
         Scanner s = new Scanner(System.in);  
         
         System.out.println("Digite a graduacao:");   
         while (!setGraduacao(s.nextLine()));   
         
         System.out.println("Digite a universidade que graduou:");   
         while (!setUniversidade(s.nextLine())); 
         
         System.out.println("Digite o ano de ingresso:");   
         setAno_inicio(EntradaDeDados.lerInt());   
         
         System.out.println("Digite o ano de conclusao:");   
         setAno_fim(EntradaDeDados.lerInt());    
            
        }     
    
    @Override
    public void mostrarDados() 
     {      
         System.out.println("DADOS DO ALUNO DE POS GRADUACAO");
         super.mostrarDados(); 
         this.getCursoPosGraduacao().mostrarDados();     
         System.out.println("Graduacao: "+this.getGraduacao()); 
         System.out.println("Universidade (Graduacao): "+this.getUniversidade()); 
         System.out.println("Ano ingresso (Graduacao): "+this.getAno_inicio()); 
         System.out.println("Ano conclusao (Graduacao): "+this.getAno_fim());   
        } 
        
    
}