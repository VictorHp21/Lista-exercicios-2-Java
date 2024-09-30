public class Funcionario {
    protected String nome;
    protected float salario;
    protected String Cargo;
    

    public Funcionario (String nome, float salario, String Cargo)
    {
        this.nome = nome;
        this.salario = salario;
        this.Cargo = Cargo;
    }

    public String getNome()
    {
        return nome;
    }

    public void SetNome(String nome)
    {
        this.nome = nome;
    }

     public float getSalario()
    {
        return salario;
    }

    public void SetSalario(float salario)
    {
        this.salario = salario;
    }

     public String getCargo()
    {
        return Cargo;
    }

    public void SetCargo(String Cargo)
    {
        this.Cargo = Cargo;
    }

    public void exibirInformacoes()
    {
        System.out.println("Nome do funcionário: " + nome);
         System.out.println("Salario: " + salario);
          System.out.println("Cargo: " + Cargo);

    }


}