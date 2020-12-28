import recursosHumanos.*;
import academico.*;
import dados.*;
import java.util.*;

public class Principal extends Object{
    public static void main(String[] args) { 
        //TESTE COMANDOS
        DadosAlunos alunos = new DadosAlunos();  
        
        Aluno a = new Aluno();
        Aluno a2 = new Aluno();
        
        System.out.println("Entre com os dados");
        a.lerDados();
        
        System.out.println("Entre com os dados");
        a2.lerDados(); 
        System.out.println(" ");
        
        a.mostrarDados();
        System.out.println(" ");
        
        a2.mostrarDados();
        System.out.println(" ");
        
        alunos.cadastrar(a);
        
        alunos.cadastrar(a2);
        
        System.out.println(" ");
        System.out.println("Lista original");
        System.out.println(" ");
        alunos.listar();        
        
        Aluno mat = alunos.buscar(a.getMatricula());
        //alunos.excluir(a.getMatricula());
        alunos.excluir(mat.getMatricula());
        
        System.out.println(" ");
        System.out.println("Nova lista de alunos");
        System.out.println(" ");
                
        alunos.listar();
                
        /*
        DadosProfessores professores = new DadosProfessores();
        
        Professor p = new Professor();
        p.lerDados();
        professores.cadastrar(p);
        
        Professor p1 = new Professor();
        p1.lerDados();
        professores.cadastrar(p1);
        professores.listar();
        //professores.buscar(p);
        //professores.excluir();
        
        /*
        DadosPessoas pessoas = new DadosPessoas();
        Pessoa ps = new Pessoa();
        ps.lerDados();
        
        Pessoa ps1 = new Pessoa();
        ps1.lerDados();        
        
        pessoas.cadastrar(ps);
        pessoas.cadastrar(ps1);
        pessoas.listar();
        //pessoas.buscar();
        //pessoas.excluir();  
        
        //Aluno a = alunos.buscar("mat");
        /*
        String n;
        Pessoa ps = new Pessoa();
        ps.lerDados();
        n = ps.getNome();
        System.out.println(n);
        
        //instanciar as bases de dados
        
        /*DadosAlunos alunos = new DadosAlunos();
        Aluno a = new Aluno();
        alunos.cadastrar(a);
        alunos.listar();
//      a.lerDados();



        /*
        DadosProfessores professores = new DadosProfessores();
        Professor p = new Professor();
        p.lerDados();
        professores.cadastrar(p);
        professores.listar();
        professores.buscar();
        professores.excluir();
        
        DadosCursos cursos = new DadosCursos();
        Curso c = new Curso();
        c.lerDados();
        a.setCurso(c);
        alunos.buscar();
        alunos.excluir();
        
        DadosFuncionarios funcionarios = new DadosFuncionarios();
        Funcionario f = new Funcionario();
        f.lerDados();
        f.mostrarDados(); 
        funcionarios.cadastrar(f);
        funcionarios.listar();
        funcionarios.buscar();
        funcionarios.excluir(); 
        
        DadosTecnicos tecnicos = new DadosTecnicos();
        Tecnico t = new Tecnico();
        t.lerDados();
        t.mostrarDados(); 
        tecnicos.cadastrar(t);
        tecnicos.listar();
        tecnicos.buscar();
        tecnicos.excluir();
        
        DadosCursos cursos = new DadosCursos();
        Curso c = new Curso();
        c.lerDados();
        c.mostrarDados(); 
        cursos.cadastrar(c);
        cursos.listar();
        cursos.buscar();
        cursos.excluir();
        
        DadosDisciplinas disciplinas = new DadosDisciplinas();
        Disciplina d = new Disciplina();
        d.lerDados();
        d.mostrarDados();  
        disciplinas.cadastrar(d);
        disciplinas.listar();
        disciplinas.buscar();
        disciplinas.excluir();
        
        DadosAlunoPosGraduacao alunos_pos = new DadosAlunoPosGraduacao();
        AlunoPosGraduacao pg = new AlunoPosGraduacao();
        pg.lerDados();
        pg.mostrarDados();
        alunos_pos.cadastrar(pg);
        alunos_pos.listar();
        alunos_pos.buscar();
        alunos_pos.excluir();
        
        DadosPessoas pessoas = new DadosPessoas();
        Pessoa ps = new Pessoa();
        ps.lerDados();
        ps.mostrarDados();
        pessoas.cadastrar(ps);
        pessoas.listar();
        pessoas.buscar();
        pessoas.excluir();     */   
    }
}