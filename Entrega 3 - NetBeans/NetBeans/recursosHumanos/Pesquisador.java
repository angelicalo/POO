package recursosHumanos;

import java.io.Serializable;

public interface Pesquisador
{    
    String getNome();
    String getTipo();
    String getCpf();
    
    //String setCpf();
    
    void mostrarDados();
    void lerDados();
}