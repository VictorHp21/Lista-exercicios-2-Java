import java.util.ArrayList;
import java.util.List;

public class Empresa {
    protected String nomeEmpresa;
     private List<Departamento> departamentos;


     public Empresa (String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
        this.departamentos = new ArrayList<>();
     }

      public String GetNomeEmpresa()
    {
        return nomeEmpresa;
    }

    public void SetNomeEmpresa(String nomeEmpresa)
    {
        this.nomeEmpresa = nomeEmpresa;
    }




     public void AdcDepartamento(Departamento departamento){
        departamentos.add(departamento);
    }

    
    public void ListarDepartamentos()
    {
         for(Departamento objDepartamento: departamentos)
       {
         objDepartamento.exibirDepartamento();
       }
    }

}
