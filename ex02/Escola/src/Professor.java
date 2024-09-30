public class Professor {
    protected String nomeProfessor;
    protected String disciplina;

    public Professor (String nomeProfessor, String disciplina)
    {
        this.nomeProfessor = nomeProfessor;
        this.disciplina = disciplina;
    }

    public String getNome()
    {
        return nomeProfessor;
    }

    public void Setnome(String nomeProfessor)
    {
        this.nomeProfessor = nomeProfessor;
    }

    public String getDisciplina()
    {
        return disciplina;
    }

    public void SetDisciplina(String disciplina)
    {
        this.disciplina = disciplina;
    }

    public void exibirInformacoesProfessores()
    {
        System.out.println("Nome do Professor: " + nomeProfessor);
        System.out.println("Discíplina: " + disciplina);
        System.out.println("\n");
    }


}
