package academico; 
import recursosHumanos.*;
 
import java.util.ArrayList; 

public abstract class ProjetoDePesquisa
{    
    static String codigo;
    static String titulo;
    static String dataInicio;
    static String dataFim;
    static Pesquisador profResponsavel;

    /**
     * @return the equipe
     */
    public static ArrayList<Pesquisador> getEquipe() {
        return equipe;
    }

    /**
     * @param aEquipe the equipe to set
     */
    public static void setEquipe(ArrayList<Pesquisador> aEquipe) {
        equipe = aEquipe;
    }
    private static ArrayList<Pesquisador> equipe = new ArrayList<Pesquisador>();
    
    public static void cadastrar(Pesquisador membro) {
        getEquipe().add(membro); 
        System.out.println("Total de pesquisadores inseridos: " + getEquipe().size());
    }
    
    public static void listar(){        
        for (Pesquisador membro: getEquipe()) {
            membro.mostrarDados(); 
        }
    }    
    
    public static void listarNomes(){
        System.out.println("Membros: ");
        getEquipe().forEach(membro -> {
            if (!membro.getCpf().equals(profResponsavel.getCpf()))
                System.out.println(membro.getNome());
        });
    }   
      
    public static void getMembros(){
        System.out.println("Membros: ");
        for (Pesquisador membro: getEquipe()) {
            System.out.println(membro.getNome()); 
        }
    } 
    
    public static Pesquisador buscar(String cpf) {
        Pesquisador p = null; 
        for ( Pesquisador membro: getEquipe()) {
            if (membro.getCpf().equals(cpf)) { 
                p = membro; 
                break;
            }
        }
        return p;
    }
    
    public static boolean excluir(String cpf){
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
    
    public String getTituloEquipe(){
        return titulo;
    }
    
    public String getDataInicio(){
        return dataInicio;
    }
    
    public String getDataFim(){
        return dataFim;
    }
    
    public Professor getProfResponsavel(){
        return profResponsavel;
    }    
    
    public void setCodigo(String cod){
        codigo = cod;
    }
    
    public void setTituloEquipe(String str){
        titulo = str;
    }
    
    public void setDataInicio(String str){
        dataInicio = str;
    }
    
    public void setDataFim(String str){
        dataFim = str;
    }
    
    public void setProfResponsavel(Professor prof){
        profResponsavel = prof;
    }    
    
    public void mostrarDados(){  
        System.out.println("Codigo: " + codigo); 
        System.out.println("Titulo: " + titulo); 
        System.out.println("Inicio: " + dataInicio); 
        System.out.println("Termino: " + dataFim); 
        System.out.println("Professor Responsável: " + profResponsavel.getNome());  
        System.out.println("Membros: ");  
        listarNomes();    
    }
    
}
