package entradas; 
import java.util.*;

public class EntradaDeDados
{        
    /**
     * Construtor para objetos da classe EntradaDeDados
     */
    public static int lerInt()
    {
        int leitura;
        Scanner s = new Scanner(System.in);
        while (true) {
            try{
                leitura = s.nextInt();
                break;
            }catch(InputMismatchException e){    
                System.out.println("Erro: "+e.toString());
                System.out.println("Digite novamente.");
                s.nextLine();
            }
        } 
        return leitura;
    } 
    
    public static double lerDouble()
    {
        double leitura;
        Scanner s = new Scanner(System.in);
        while (true) {
            try{
                leitura = s.nextDouble();
                break;
            }catch(InputMismatchException e){    
                System.out.println("Erro: "+e.toString());
                System.out.println("Digite novamente.");
                s.nextLine();
            }
        } 
        return leitura;
    } 
    
    
    public static float lerFloat()
    {
        float leitura;
        Scanner s = new Scanner(System.in);
        while (true) {
            try{
                leitura = s.nextFloat();
                break;
            }catch(InputMismatchException e){    
                System.out.println("Erro: "+e.toString());
                System.out.println("Digite novamente.");
                s.nextLine();
            }
        } 
        return leitura;
    }     
    
    String cpf; 
    
    public static boolean isCpf(String cpf)
    {        
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
                
        if (cpf.length() != 11 || 
            cpf.charAt(0)==cpf.charAt(1) && cpf.charAt(1)==cpf.charAt(2) && 
            cpf.charAt(2)==cpf.charAt(3) && cpf.charAt(3)==cpf.charAt(4) && 
            cpf.charAt(4)==cpf.charAt(5) && cpf.charAt(5)==cpf.charAt(6) && 
            cpf.charAt(6)==cpf.charAt(7) && cpf.charAt(7)==cpf.charAt(8) && 
            cpf.charAt(8)==cpf.charAt(9) && cpf.charAt(9)==cpf.charAt(10)){ 
            System.out.println("CPF invalido!" + cpf);
            return false;
        }
         
        var soma = 0;
        var resto = 0;
        for (int i = 0; i < 9; i++) {
            soma = soma + Integer.parseInt(cpf.substring(i, i + 1)) * (11 - i - 1);
        }
                
        resto = (soma * 10) % 11;
        
        if ((resto == 10) || (resto == 11)) {
            resto = 0;
        }
        
        if (resto != Integer.parseInt(cpf.substring(9,10))){            
            System.out.println("CPF invalido!" + cpf);
            return false;
        }
                
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma = soma + Integer.parseInt(cpf.substring(i, i + 1)) * (12 - i - 1);
        }
                
        resto = (soma * 10) % 11;
                
        if ((resto == 10) || (resto == 11))  {
            resto = 0;
        }
        
        if (resto != Integer.parseInt(cpf.substring(10,11))) {            
            System.out.println("CPF invalido!" + cpf);
            return false;
        }
        return true;    
    }
}
