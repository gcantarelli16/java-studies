
package cursoinf;

public class CursoInf {

    public static void main(String[] args) {

        try {
            Turma turma = new Turma("Informática", 40);

            Aluno aluno1 = new Aluno(1, "Joao");
            Aluno aluno2 = new Aluno(2, "Maria");
            Aluno aluno3 = new Aluno(3, "Pedro");

            turma.matricularAluno(aluno1);
            turma.matricularAluno(aluno2);
            turma.matricularAluno(aluno3);

            turma.atribuirMedia(1, 8.5);
            turma.atribuirMedia(2, 5.0);
            turma.atribuirMedia(3, 7.0);

            turma.registrarFalta(1);
            turma.registrarFalta(2);
            turma.registrarFalta(2);
            turma.registrarFalta(3);
            turma.registrarFalta(3);
            turma.registrarFalta(3);

            System.out.println("TODOS OS ALUNOS:");
            turma.listarTodos();

            System.out.println("\nALUNOS APROVADOS:");
            turma.listarAprovados();

            System.out.println("\nÍndice do aluno 2: " + turma.buscarAluno(2));
            System.out.println("Índice do aluno 10: " + turma.buscarAluno(10));

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

