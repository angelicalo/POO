package academico; 
import java.io.Serializable;
import recursosHumanos.*;
 
import java.util.ArrayList; 

public class ProjetoDePesquisa implements Serializable
{    
    private String codigo;
    private String nome;
    private Double dataInicio;
    private Double dataFim;
    static Professor profResponsavel;

    /**
     * @return the equipe
     */
    public ArrayList<Pesquisador> getEquipe() {
        return equipe;
    }

    /**
     * @param aEquipe the equipe to set
     */
    public void setEquipe(ArrayList<Pesquisador> aEquipe) {
        equipe = aEquipe;
    }
    private ArrayList<Pesquisador> equipe = new ArrayList<Pesquisador>();
    
    public void cadastrar(Pesquisador membro) {
        getEquipe().add(membro); 
        System.out.println("Total de pesquisadores inseridos: " + getEquipe().size());
    }
    
    public void listar(){
        for (Pesquisador membro: getEquipe()) {
            membro.mostrarDados(); 
        }
    }    
    
    public void listarNomes(){
        System.out.println("Membros: ");
        for (Pesquisador membro: getEquipe()) {
            System.out.println(membro.getNome()); 
        }
    }   
      
    public void getMembros(){
        System.out.println("Membros: ");
        for (Pesquisador membro: getEquipe()) {
            System.out.println(membro.getNome()); 
        }
    } 
    
    public Pesquisador buscar(String cpf) {
        Pesquisador p = null; 
        for ( Pesquisador membro: getEquipe()) {
            if (membro.getCpf().equals(cpf)) { 
                p = membro; 
                break;
            }
        }
        return p;
    }
    
    public boolean excluir(String cpf){
        Pesquisador membro = buscar(cpf);
        if (membro != null) {
            getEquipe().remove(membro);
            return true;
        }else{
            return false;
        }
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getNomeEquipe(){
        return nome;
    }
    
    public Double getDataInicio(){
        return dataInicio;
    }
    
    public Double getDataFim(){
        return dataFim;
    }
    
    public Professor getProfResponsavel(){
        return profResponsavel;
    }    

    public void setCodigo(String cod){
        codigo = cod;
    }
    
    public void setNomeEquipe(String nom){
        nome = nom;
    }
    
    public void setTituloEquipe(String str){
        nome = str;
    }
    
    public void setDataInicio(Double str){
        dataInicio = str;
    }
    
    public void setDataFim(Double str){
        dataFim = str;
    }
    
    public void setProfResponsavel(Professor prof){
        profResponsavel = prof;
    }    
    
    public void mostrarDados(){  
        System.out.println("Codigo: " + getCodigo()); 
        System.out.println("Professor responsavel: " + profResponsavel);
        System.out.println("Titulo: " + nome);
        System.out.println("Data Inicio: " + dataInicio);
        System.out.println("Data Fim: " + dataFim);
        System.out.println("Membros: ");  
        listarNomes();    
    }
    
}
