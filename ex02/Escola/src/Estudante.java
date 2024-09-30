import java.util.ArrayList;
import java.util.List;

public class Estudante {
    protected String nomeEstudante;
    protected int matricula;
    private List<Float> notas;

    public Estudante (String nomeEstudante, int matricula)
    {
        this.nomeEstudante = nomeEstudante;
        this.matricula = matricula;
        this.notas = new ArrayList<>();
    }

    public String getNome()
    {
        return nomeEstudante;
    }

    public void SetNome(String nomeEstudante)
    {
        this.nomeEstudante = nomeEstudante;
    }

    public int getMatricula()
    {
        return matricula;
    }

    public void SetMatricula(int matricula)
    {
        this.matricula = matricula;
    }

    public List<Float> getNotas()
    {
        return notas;
    }

    public void setNotas(List<Float> novasNotas) {
        this.notas = novasNotas;
    }

    public void adicionarNota(float nota) {
        this.notas.add(nota);
    }

    public float CalcularMedia(List<Float> notas)
    {
        float soma = 0;
        float media = 0;

        if (notas.isEmpty())
        {
            System.out.println("Esse estudante não tem notas cadastradas");
        }

        for (float nota: notas)
        {
            soma += nota;
        }

        media = soma / notas.size();

        return media;
    }

    public void exibirNotas() {
        System.out.print("Notas: ");
        for (Float nota : this.getNotas()) {
            System.out.print(nota + " ");
        }
        System.out.println();
    }

    public void exibirInformacoesEstudante()
    {
        System.out.println("Nome do Estudante: " + nomeEstudante);
         System.out.println("Número da matricula: " + matricula);
          exibirNotas();
          
          System.out.println("Média: " + CalcularMedia(notas));

    }


}
