import java.util.ArrayList;
import java.util.List;

public class Escola {
    protected String nome;
      private List<Curso> cursos;

      public Escola (String nome)
      {
        this.nome = nome;
        this.cursos = new ArrayList<>();
      }

      public String getNome()
      {
        return nome;
      }

      public void Setnome(String nome)
      {
        this.nome = nome;
      }

      public void adcCurso(Curso curso)
      {
        cursos.add(curso);
      }

      public void ListarCursos()
      {
        for(Curso objCurso: cursos)
        {
            objCurso.exibirCurso();
            objCurso.ListarProfessores();
            objCurso.ListarEstudantes();
        }
      }
}