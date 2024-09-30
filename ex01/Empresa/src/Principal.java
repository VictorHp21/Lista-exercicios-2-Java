import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);

        

            int opcao = 0;
            int opcao2 = 0;

            String nome, nomeDepartamento, nomeEmpresa, Cargo;
            float salario;
            
            System.out.println("* Sistema de Gerenciamento de Funcionarios *");

            System.out.println("* Inserir Empresa *");

            System.out.println("\nDigite o nome da empresa que deseja cadastrar");
                nomeEmpresa = teclado.nextLine();

            Empresa objEmpresa = new Empresa(nomeEmpresa);





        while(opcao != 3)
        {

        System.out.println("Escolha uma opção: \n1-Cadastrar um Departamento \n2- Listar departamentos e funcionários \n3- Sair");
            opcao = teclado.nextInt();
            teclado.nextLine();  
           
            if (opcao == 1)
            {
                System.out.println("* Inserir Departamento *");

                System.out.println("\nDigite o nome da departamento que deseja cadastrar");
                nomeDepartamento = teclado.nextLine();

                Departamento objDepartamento = new Departamento(nomeDepartamento);
                objEmpresa.AdcDepartamento(objDepartamento);
                           opcao2 = 0;
                            while (opcao2 != 2) {
                            System.out.println("** Inserir Funcionario no Departamento:  " + nomeDepartamento);

                            System.out.println("\nDigite o nome do Funcionario que deseja cadastrar");
                            nome = teclado.next();

                            System.out.println("\nDigite o salario do Funcionario que deseja cadastrar");
                            salario = teclado.nextFloat();

                            System.out.println("\nDigite o Cargo do Funcionario que deseja cadastrar");
                            Cargo = teclado.next();

                            Funcionario objFuncionario = new Funcionario(nome, salario, Cargo);

                            objDepartamento.AdcFuncionario(objFuncionario);

                            System.out.println("Deseja cadastrar outro funcionário em: " + nomeDepartamento);
                            System.out.println("* 1- sim  2-Não *");
                            opcao2 = teclado.nextInt();
                            }

            

            } 
            if (opcao == 2)
            {
                System.out.println("Os depastamentos e funcionarios cadastrados na empresa: " + nomeEmpresa + "são: ");
                
                objEmpresa.ListarDepartamentos();

            }
       
           

        }
    }
}