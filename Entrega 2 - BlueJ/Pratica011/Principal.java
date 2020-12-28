import entradas.*;
import recursosHumanos.*;
import academico.*;
//import dados.*;
import persistencia.*;

import java.util.*;

public class Principal{
    public static void main() { 
        //TESTE COMANDOS
        System.out.println("\u000C"); //limpa os dados da tela        
        // comente onde tem /** e **/ para usar os codigos        
        /** Pratica 7**/
        /** 
        DadosAlunoGraduacao alunosGraduacao;         
        DisciplinaGraduacao disciplinaGraduacao = new DisciplinaGraduacao();
        
        CursoGraduacao curso = new CursoGraduacao ();
        AlunoGraduacao aluno1 = new AlunoGraduacao();
        AlunoGraduacao aluno2 = new AlunoGraduacao();
        
        System.out.println("\nDisciplina\n");
        disciplinaGraduacao.lerDados();  // cadastro de disciplina. precisa cadastrar o professor da disciplina
        disciplinaGraduacao.mostrarDados();
            
        System.out.println("\nCurso\n");
        curso.lerDados();              
        curso.cadastrar(disciplinaGraduacao);      //vincular a disciplna ao curso.         
        curso.mostrarDisciplinas();
        curso.mostrarDados();             //este método deve varrer o arraylist de
        DadosCursoGraduacao.cadastrar(curso);
          
        System.out.println("\nAlunos\n"); //disciplinas do curso, e chamar o mostrarDados() de cada disciplina. 
        System.out.println("\nNovo cadastro de Aluno"); 
        aluno1.lerDados();
        
        System.out.println("Deseja (C)adastrar ou (I)nformar o curso do aluno?");    
        Scanner s = new Scanner(System.in);           
        String tg = s.nextLine();        
        CursoGraduacao cursoIC = new CursoGraduacao();
        if (tg.equals("I")){
            System.out.println("Entre com o codigo do curso:");  
            String codCursoIC = s.nextLine();
            cursoIC = DadosCursoGraduacao.buscar(codCursoIC);
            while (cursoIC == null){
                System.out.println("Curso nao encontrado. Entre com um codigo valido:");
                codCursoIC = s.nextLine();
                cursoIC = DadosCursoGraduacao.buscar(codCursoIC);                
            }        
        }else{
            if (tg.equals("C")){
                System.out.println("Cadastrando curso...");
                cursoIC = new CursoGraduacao();                
                cursoIC.lerDados();
                DadosCursoGraduacao.cadastrar(cursoIC);
            }else{
                System.out.println("Nao foi possivel cadastrar aluno. Curso do aluno precisa estar cadastrado no sistema!");
            }
        }     
        aluno1.setCurso(curso);
        aluno1.mostrarDados();
        aluno1.getCurso().mostrarDados(); //mostrar os dados do curso do aluno
        DadosAlunoGraduacao.cadastrar(aluno1);
        
        System.out.println("\nNovo cadastro de Aluno"); 
        aluno2.lerDados();
        System.out.println("Deseja (C)adastrar ou (I)nformar o curso do aluno?");   
        String tg1 = s.nextLine();          
        if (tg1.equals("I")){
            System.out.println("Entre com o codigo do curso:");  
            String codCursoIC = s.nextLine();
            cursoIC = DadosCursoGraduacao.buscar(codCursoIC);
            while (cursoIC == null){
                System.out.println("Curso nao encontrado. Entre com um codigo valido:");
                codCursoIC = s.nextLine();
                cursoIC = DadosCursoGraduacao.buscar(codCursoIC);                
            }        
        }else{
            if (tg1.equals("C")){
                System.out.println("Cadastrando curso...");
                cursoIC = new CursoGraduacao();                
                cursoIC.lerDados();
                DadosCursoGraduacao.cadastrar(cursoIC);
            }else{
                System.out.println("Nao foi possivel cadastrar aluno. Curso do aluno precisa estar cadastrado no sistema!");
            }
        }        
        aluno2.setCurso(cursoIC);
        aluno2.mostrarDados();
        aluno2.getCurso().mostrarDados(); //mostrar os dados do curso do aluno        
        DadosAlunoGraduacao.cadastrar(aluno2);
        
        DadosAlunoGraduacao.listar();
        
        System.out.println("\nExcluir\n");
        String matricula = aluno2.getMatricula();
        DadosAlunoGraduacao.excluir(matricula);
        
        DadosAlunoGraduacao.listar();         
        **/
        
        /**        
        DadosAlunoPosGraduacao alunosPosGraduacao;         
        DisciplinaPosGraduacao disciplinaPosGraduacao = new DisciplinaPosGraduacao();
        
        CursoPosGraduacao cursoPos = new CursoPosGraduacao ();
        AlunoPosGraduacao alunoPos1 = new AlunoPosGraduacao();
        AlunoPosGraduacao alunoPos2 = new AlunoPosGraduacao();
        
        System.out.println("\nDisciplina\n");
        disciplinaPosGraduacao.lerDados();  // cadastro de disciplina. precisa cadastrar o professor da disciplina
        disciplinaPosGraduacao.mostrarDados();
            
        System.out.println("\nCurso\n");
        cursoPos.lerDados();              
        cursoPos.cadastrar(disciplinaPosGraduacao);      //vincular a disciplna ao curso.         
        cursoPos.mostrarDisciplinas();
        cursoPos.mostrarDados();             //este método deve varrer o arraylist de
        DadosCursoPosGraduacao.cadastrar(cursoPos);
          
        System.out.println("\nAlunos\n"); //disciplinas do curso, e chamar o mostrarDados() de cada disciplina.  
        
        System.out.println("\nNovo cadastro de Aluno");
        alunoPos1.lerDados();
        System.out.println("Deseja (C)adastrar ou (I)nformar o curso do aluno?");   
        Scanner s = new Scanner(System.in); 
        String tp1 = s.nextLine();  
        CursoPosGraduacao cursoIC = new CursoPosGraduacao();        
        if (tp1.equals("I")){
            System.out.println("Entre com o codigo do curso:");  
            String codCursoIC = s.nextLine();
            cursoIC = DadosCursoPosGraduacao.buscar(codCursoIC);
            while (cursoIC == null){
                System.out.println("Curso nao encontrado. Entre com um codigo valido:");
                codCursoIC = s.nextLine();
                cursoIC = DadosCursoPosGraduacao.buscar(codCursoIC);                
            }        
        }else{
            if (tp1.equals("C")){
                System.out.println("Cadastrando curso...");
                cursoIC = new CursoPosGraduacao();                
                cursoIC.lerDados();
                DadosCursoPosGraduacao.cadastrar(cursoIC);
            }else{
                System.out.println("Nao foi possivel cadastrar aluno. Curso do aluno precisa estar cadastrado no sistema!");
            }
        }        
        alunoPos1.setCurso(cursoIC);
        alunoPos1.mostrarDados();
        alunoPos1.getCurso().mostrarDados(); //mostrar os dados do curso do aluno        
        DadosAlunoPosGraduacao.cadastrar(alunoPos1);
        
        System.out.println("\nNovo cadastro de Aluno");
        alunoPos2.lerDados();
        System.out.println("Deseja (C)adastrar ou (I)nformar o curso do aluno?");   
        String tp2 = s.nextLine();          
        if (tp1.equals("I")){
            System.out.println("Entre com o codigo do curso:");  
            String codCursoIC = s.nextLine();
            cursoIC = DadosCursoPosGraduacao.buscar(codCursoIC);
            while (cursoIC == null){
                System.out.println("Curso nao encontrado. Entre com um codigo valido:");
                codCursoIC = s.nextLine();
                cursoIC = DadosCursoPosGraduacao.buscar(codCursoIC);                
            }        
        }else{
            if (tp2.equals("C")){
                System.out.println("Cadastrando curso...");
                cursoIC = new CursoPosGraduacao();                
                cursoIC.lerDados();
                DadosCursoPosGraduacao.cadastrar(cursoIC);
            }else{
                System.out.println("Nao foi possivel cadastrar aluno. Curso do aluno precisa estar cadastrado no sistema!");
            }
        }        
        alunoPos2.setCurso(cursoIC);
        alunoPos2.mostrarDados();
        alunoPos2.getCurso().mostrarDados(); //mostrar os dados do curso do aluno        
        DadosAlunoPosGraduacao.cadastrar(alunoPos2);
        
        DadosAlunoPosGraduacao.listar();
        
        System.out.println("\nExcluir\n");
        String matriculaPos = alunoPos2.getMatricula();
        DadosAlunoPosGraduacao.excluir(matriculaPos);
        
        DadosAlunoPosGraduacao.listar();         
        **/
        
        /**
        System.out.println("\nProfessores\n");
        
        Funcionario.setPisoSalarial(678);
        Professor.setValorHoraAula(18); // muda o valor da hora-aula
        
        DadosProfessores professores; 
         
        Professor professor = new Professor();             
        Professor professor1 = new Professor();        
        
        System.out.println("\nNovo cadastro de Professor");
        professor.lerDados();
        DadosProfessores.cadastrar(professor);
        
        System.out.println("\nNovo cadastro de Professor");
        professor1.lerDados();
        DadosProfessores.cadastrar(professor1);
        
        DadosProfessores.listar();         
        
        System.out.println("\nExcluir\n");
        String cpf = professor1.getCpf();
        DadosProfessores.excluir(cpf);
        
        DadosProfessores.listar();
        **/
        
        /**
        System.out.println("\nTecnicos\n");
        
        Funcionario.setPisoSalarial(678);
        Tecnico.setValorHoraExtra(30);
        Tecnico.setSalarioBase(600);
        
        DadosTecnicos tecnicos;  
         
        Tecnico tecnico = new Tecnico();             
        Tecnico tecnico1 = new Tecnico();
        
        System.out.println("\nNovo cadastro de Tecnico Administrativo");
        tecnico.lerDados();        
        DadosTecnicos.cadastrar(tecnico); 
        
        System.out.println("\nNovo cadastro de Tecnico Administrativo");
        DadosTecnicos.cadastrar(tecnico1);
        tecnico1.lerDados(); 
        
        DadosTecnicos.listar();         
        
        System.out.println("\nExcluir\n");
        String cpft = tecnico1.getCpf();
        DadosTecnicos.excluir(cpft);
        
        DadosTecnicos.listar();
        **/
        
        /** Pratica 8 e 9**/
        /**
        DadosTecnicos tecnicos; 
        DadosProfessores professores;         
        
        Tecnico tecnico = new Tecnico(); 
        System.out.println("\nNovo cadastro de Tecnico Administrativo");
        tecnico.lerDados();        
        DadosTecnicos.cadastrar(tecnico); 
        
        Professor professor = new Professor(); 
        System.out.println("\nNovo cadastro de Professor");
        professor.lerDados();
        DadosProfessores.cadastrar(professor);
        
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        ArrayList<Funcionario> listaF = new ArrayList<Funcionario>();
        
        listaF.add(tecnico);
        listaF.add(professor);
        
        folhaPagamento.relatorioFolha(listaF);
        **/
        
        /** Pratica 10**/  // Cadastramento do aluno, disciplina, curso e professor. 
                           // Incluso de Pesquisadores em equipe (Projeto de Pesquisa).
        /** 
        Scanner s = new Scanner(System.in); //leitura
        
        DadosAlunoGraduacao alunosGraduacao;   
        DisciplinaGraduacao disciplinaGraduacao = new DisciplinaGraduacao(); 
        CursoGraduacao curso = new CursoGraduacao(); 
        AlunoGraduacao aluno = new AlunoGraduacao();
        
        DadosAlunoPosGraduacao alunosPosGraduacao;   
        DisciplinaPosGraduacao disciplinaPosGraduacao = new DisciplinaPosGraduacao();
        CursoPosGraduacao cursoPos = new CursoPosGraduacao();        
        AlunoPosGraduacao alunoPos = new AlunoPosGraduacao();
        
        System.out.println("\nDisciplinas\n");
        System.out.println("\nDisciplina do aluno de graduacao\n");
        disciplinaGraduacao.lerDados();   
        System.out.println("\nDisciplina do aluno de pos graduacao\n");
        disciplinaPosGraduacao.lerDados();  
                        
        System.out.println("\nCursos\n");        
        System.out.println("\nCurso do aluno de graduacao\n");
        curso.lerDados();              
        curso.cadastrar(disciplinaGraduacao);    
        DadosCursoGraduacao.cadastrar(curso);        
        System.out.println("\nCurso do aluno de pos graduacao\n");
        cursoPos.lerDados();              
        cursoPos.cadastrar(disciplinaPosGraduacao);   
        DadosCursoPosGraduacao.cadastrar(cursoPos);
                       
        System.out.println("\nAlunos\n");        
        System.out.println("\nNovo cadastro de Aluno");     
        aluno.lerDados();
        CursoGraduacao cursoIC = new CursoGraduacao();  
        System.out.println("Deseja (C)adastrar ou (I)nformar o curso do aluno?");       
        String tg = s.nextLine();   
        if (tg.equals("I")){
            System.out.println("Entre com o codigo do curso:");  
            String codCursoIC = s.nextLine();
            cursoIC = DadosCursoGraduacao.buscar(codCursoIC);
            while (cursoIC == null){
                System.out.println("Curso nao encontrado. Entre com um codigo valido:");
                codCursoIC = s.nextLine();
                cursoIC = DadosCursoGraduacao.buscar(codCursoIC);                
            }
        }else{
            if (tg.equals("C")){
                System.out.println("Cadastrando curso...");
                cursoIC = new CursoGraduacao();                
                cursoIC.lerDados();
                DadosCursoGraduacao.cadastrar(cursoIC);
            }else{
                System.out.println("Nao foi possivel cadastrar o curso do aluno!");
            }
        }     
        aluno.setCurso(cursoIC);
        DadosAlunoGraduacao.cadastrar(aluno);
        
        System.out.println("\nNovo cadastro de Aluno");
        alunoPos.lerDados();
        System.out.println("Deseja (C)adastrar ou (I)nformar o curso do aluno?"); 
        String tp = s.nextLine();  
        CursoPosGraduacao cursoPosIC = new CursoPosGraduacao(); 
        if (tp.equals("I")){
            System.out.println("Entre com o codigo do curso:");  
            String codCursoPosIC = s.nextLine();
            cursoPosIC = DadosCursoPosGraduacao.buscar(codCursoPosIC);
            while (cursoIC == null){
                System.out.println("Curso nao encontrado. Entre com um codigo valido:");
                codCursoPosIC = s.nextLine();
                cursoPosIC = DadosCursoPosGraduacao.buscar(codCursoPosIC);                
            }        
        }else{
            if (tp.equals("C")){
                System.out.println("Cadastrando curso...");
                cursoPosIC = new CursoPosGraduacao();                
                cursoPosIC.lerDados();
                DadosCursoPosGraduacao.cadastrar(cursoPosIC);
            }else{
                System.out.println("Nao foi possivel cadastrar curso do aluno!");
            }
        }         
        alunoPos.setCurso(cursoPosIC);              
        DadosAlunoPosGraduacao.cadastrar(alunoPos); 
          
        DadosProfessores professores; 
         
        Professor professor = new Professor();             
        Professor professor1 = new Professor();        
        
        System.out.println("\nNovo cadastro de Professor");
        professor.lerDados();
        DadosProfessores.cadastrar(professor);        
        System.out.println("\nNovo cadastro de Professor");
        professor1.lerDados();
        DadosProfessores.cadastrar(professor1);
        
        System.out.println("\nMEMBROS DA EQUIPE\n");
        //ProjetoDePesquisa equipe; 
        ProjetoDePesquisa.cadastrar(aluno); 
        ProjetoDePesquisa.cadastrar(alunoPos);
        ProjetoDePesquisa.cadastrar(professor);
        ProjetoDePesquisa.cadastrar(professor1);
        
        ProjetoDePesquisa.listar();
        
        **/
        /** Pratica 11**/ 
        /**
        Professor professor = new Professor();
        //System.out.println("\nNovo cadastro de Professor");
        //professor.lerDados();
        //DadosProfessores.cadastrar(professor);   
        Scanner s = new Scanner(System.in); //leitura
        System.out.println("\nBuscar professor\nEntre com o CPF do professor:");
        String cpf = s.nextLine();
        if (EntradaDeDados.isCpf(cpf)){
            professor = DadosProfessores.buscar(cpf);   
            if (professor == null){
                System.out.println("\nProfessor nao encontrado!");
            //System.out.println("\nNome:" + professor.getNome());
            }else {
                System.out.println("\nProfessor encontrado!");
                professor.mostrarDados();
            }
        }else
            System.out.println("\nProfessor nao encontrado!");
            
            
        CursoGraduacao cursoGrad = new CursoGraduacao();
        System.out.println("\nBuscar Curso de Graduacao\nEntre com o codigo do Curso:");
        String cod = s.nextLine();
        //String cod = "codCG";
        cursoGrad = DadosCursoGraduacao.buscar(cod);   
        if (cursoGrad == null)
            System.out.println("\nCurso nao encontrado!");
        else{
            System.out.println("\nCurso encontrado: "+ cursoGrad.getNome());
            cursoGrad.mostrarDados();
        }
             
        CursoPosGraduacao cursoPosGrad = new CursoPosGraduacao();
        System.out.println("\nBuscar Curso de Graduacao.");
        //System.out.println("\nEntre com o codigo do Curso:");
        //String codPos = s.nextLine();
        String codPos = "codCP";
        cursoPosGrad = DadosCursoPosGraduacao.buscar(codPos);   
        if (cursoPosGrad == null)
            System.out.println("\nCurso nao encontrado!");
        else{
            System.out.println("\nCurso encontrado: "+ cursoPosGrad.getNome());
            cursoPosGrad.mostrarDados();
        }   
                  
        **/
        ///**
        AlunoPosGraduacao alunoP;
        CursoPosGraduacao cursoP;
        alunoP = DadosAlunoPosGraduacao.buscar("03275151630");
        alunoP.mostrarDados();
        cursoP = DadosCursoPosGraduacao.buscar("codCP1");
        cursoP.mostrarDados();
        //alunoP.setCursoPosGraduacao(cursoP);
        //**/
        
        System.out.println("\nProfessores\n");
        DadosProfessores.listar();
        System.out.println("\nDisciplinas de Graduacao\n");
        DadosDisciplinasGraduacao.listar();
        System.out.println("\nDisciplinas de Pos Graduacao\n");
        DadosDisciplinasPosGraduacao.listar();
        System.out.println("\nCursos de Graduacao\n");
        DadosCursoGraduacao.listar(); 
        System.out.println("\nCursos de Pos Graduacao\n");
        DadosCursoPosGraduacao.listar(); 
        System.out.println("\nAlunos de Graduacao\n");
        DadosAlunoGraduacao.listar(); 
        System.out.println("\nAlunos de Pos Graduacao\n");
        DadosAlunoPosGraduacao.listar();
    }
}

        