import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);

        ArrayList<Escola> escolas = new ArrayList<>();

        int opcao = 0;
        String nome, nomeEstudante, nomeCurso, nomeProfessor;
        int matricula;
        String disciplina;

        while (opcao != 2)
        {
            System.out.println("*** Bem vindo ***\n");

            System.out.println("Digite 1- Cadastrar escola\n2-Sair: ");
            opcao = teclado.nextInt();

            if(opcao == 1)
            {
                System.out.println("Deseja o nome da escola que deseja cadastrar ");
                nome = teclado.next();

                Escola objEscola = new Escola(nome);

                escolas.add(objEscola);

                int nCursos = 0;
                System.out.println("Digite quantos cursos deseja cadastrar nesta escola: ");
                nCursos = teclado.nextInt();

                    for (int i = 0; i < nCursos; i++)
                    {
                        System.out.println("Digite o nome do curso: ");
                        nomeCurso = teclado.next();

                        Curso objCurso = new Curso(nomeCurso);

                        objEscola.adcCurso(objCurso);

                        int nEstudantes = 0;
                        System.out.println("Digite o número de estudantes que deseja cadastrar: ");
                        nEstudantes = teclado.nextInt();


                        for(int j = 0; j < nEstudantes; j++)
                        {
                            System.out.println("Digite o nome do estudante: ");
                            nomeEstudante = teclado.next();
                            System.out.println("Digite o número da matricula: ");
                            matricula = teclado.nextInt();

                            Estudante objEstudante = new Estudante(nomeEstudante, matricula);

                            objCurso.AdcEstudante(objEstudante);

                            int nNotas = 0;
                            System.out.println("Digite quantas notas deseja cadastrar: ");
                            nNotas = teclado.nextInt();

                            for (int k = 0; k < nNotas; k++)
                            {
                                System.out.println("Digite a nota" + (k +1));
                                float novasNotas = teclado.nextFloat();

                                objEstudante.adicionarNota(novasNotas);
                            }


                    }
                
                    int nProfessores = 0;
                    System.out.println("Digite o número de Professores que deseja cadastrar: ");
                    nProfessores = teclado.nextInt();

                    for(int l = 0; l < nProfessores; l++)
                    {
                        System.out.println("Digite o nome do Professor: ");
                        nomeProfessor = teclado.next();
                        System.out.println("Digite a disciplina: ");
                        disciplina = teclado.next();

                        Professor objProfessor = new Professor(nomeProfessor, disciplina);

                        objCurso.AdcProfessor(objProfessor);
                    }




                }

            }

           
        }

      



        System.out.println("As informações cadastradas foram: ");

        for(Escola objEscola: escolas)
        {
          objEscola.ListarCursos();
        }
    }
}
