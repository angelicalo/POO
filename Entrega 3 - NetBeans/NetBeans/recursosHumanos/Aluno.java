package recursosHumanos;
import academico.*;

import java.io.Serializable;

import java.util.Scanner;

public abstract class Aluno extends Pessoa implements Pesquisador, Serializable
{    
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
     * @return the cod_situacao
     */
    public byte getCod_situacao() {
        return cod_situacao;
    }

    /**
     * @param cod_situacao the cod_situacao to set
     */
    public void setCod_situacao(byte cod_situacao) {
        this.cod_situacao = cod_situacao;
    }
    private String matricula;
    private String situacao;
    private byte cod_situacao;
    
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
    
    private Curso curso; 
    
    public void setCurso(Curso curso){
        this.curso = curso;
    }
    
    public Curso getCurso(){
        return this.curso;
    }   
    
    public boolean setMatricula(String matricula)
    {
        if (matricula.length() > 0) {
            this.matricula = matricula;
            return true;
        }else{
            System.out.println("Matricula invalida!");
            return false;
        }
    }
            
    public boolean setSituacao(String situacao)
    {
        this.situacao = situacao;
        
        if(this.situacao.equals("M") || this.situacao.equals("T") || this.situacao.equals("D")){
            if (this.situacao.equals("M")) {
                this.setCod_situacao((byte) 1);
            }
            if (this.situacao.equals("T")) {
                this.setCod_situacao((byte) 2);
            }
            if (this.situacao.equals("D")) {
                this.setCod_situacao((byte) 3);
            }
            return true; 
        }else{
           System.out.println("Situacao de matricula invalida!");
           return false;
        }
    } 
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public String getSituacao(){
        return this.situacao;
    }
            
    @Override
    @SuppressWarnings("empty-statement")
    public void lerDados()
    {
        super.lerDados();
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Matricula do aluno:");
        while (!setMatricula(s.nextLine()));
        
        System.out.println("Qual a situacao da matricula: (M)atriculado | (T)trancado | (D)esligado");
        while (!setSituacao(s.nextLine()));
    }
    
    @Override
    public void mostrarDados()
    {        
        super.mostrarDados();
        System.out.println("Matricula: "+this.getMatricula());
        
        if (this.getCod_situacao() == (1)) {
            System.out.println("Aluno Matriculado");
        }
        if (this.getCod_situacao() == (2)) {
            System.out.println("Aluno com matricula Trancada");
        }
        if (this.getCod_situacao() == (3)) {
            System.out.println("Aluno foi Desligado");
        }    
        //this.curso.mostrarDados();
    }  
}