package recursosHumanos;
import academico.*;

import java.io.Serializable;


public class AlunoGraduacao extends Aluno implements Pesquisador, Serializable
{     
    /**
     * @return the cursoGraduacao
     */
    public CursoGraduacao getCursoGraduacao() {
        return cursoGraduacao;
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
    
    private CursoGraduacao cursoGraduacao = new CursoGraduacao();
    
    public void setCurso(CursoGraduacao cursoGraduacao){        
        this.setCursoGraduacao(cursoGraduacao);
    }        
    public void setCursoGraduacao(CursoGraduacao cursoGraduacao) {
        this.cursoGraduacao = cursoGraduacao;
    }
           
    /**
     *
     * @return
     */
    @Override
    public CursoGraduacao getCurso(){
        return this.getCursoGraduacao();
    }
    
    /**
     *
     */
    @Override
    public void lerDados()
    {
        System.out.println("Digite os dados do aluno de graduacao:"); 
        super.lerDados();
    }
    
    /**
     *
     */
    @Override
    public void mostrarDados()
    {        
        System.out.println("DADOS DO ALUNO DE GRADUACAO");
        super.mostrarDados();
        this.getCursoGraduacao().mostrarDados();   
    }  
}