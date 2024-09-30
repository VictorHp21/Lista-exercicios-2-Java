import java.util.ArrayList;
import java.util.List;

public class Curso {
    protected String nomeCurso;
      private List<Estudante> estudantes;
      private List<Professor> professores;

      public Curso (String nomeCurso)
      {
        this.nomeCurso = nomeCurso;
        this.estudantes = new ArrayList<>();
        this.professores = new ArrayList<>();
      }

      public String getNome(){
        return nomeCurso;
      }

      public void Setnome(String nomeCurso)
      {
        this.nomeCurso = nomeCurso;
      }

      
     public void AdcEstudante(Estudante estudante){
        estudantes.add(estudante);
    }

    public void AdcProfessor(Professor professor){
        professores.add(professor);
    }

    public void exibirCurso()
    {
        System.out.println("Curso: " + nomeCurso);
        
    }

    public void ListarEstudantes()
    {
         for(Estudante objEstudante: estudantes)
       {
         objEstudante.exibirInformacoesEstudante();
       }
    }

    public void ListarProfessores()
    {
         for(Professor objProfessor: professores)
       {
         objProfessor.exibirInformacoesProfessores();
       }
    }

}
