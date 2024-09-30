import java.util.ArrayList;
import java.util.List;

public class Departamento {
    protected String nomeDepartamento;
    private List<Funcionario> funcionarios;

      public Departamento (String nomeDepartamento){
        this.nomeDepartamento = nomeDepartamento;
        this.funcionarios = new ArrayList<>();
    }

    public String GetNomeDepartamento()
    {
        return nomeDepartamento;
    }

    public void SetNomeDepartamento(String nomeDepartamento)
    {
        this.nomeDepartamento = nomeDepartamento;
    }

    public void exibirDepartamento()
    {
        System.out.println("Nome departamento: " + nomeDepartamento);
        ListarFuncionarios();
    }
    
        




    public void AdcFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void ListarFuncionarios()
    {
         for(Funcionario objFuncionario: funcionarios)
       {
         objFuncionario.exibirInformacoes();
       }
    }

}
