package ao.universidade.poo.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        Biblioteca Biblioteca = new Biblioteca();

        Livro l1 = new Livro(
                "Sebenta de Linguagem Java",
                "Pedro Nvulu",
                "975265877"
        );

        Livro l2 = new Livro(
                "POO Avançada",
                "Adelina Manuel",
                "975543333"
        );

        Livro l3 = new Livro(
                "Estruturas de Dados Avançados",
                "Mbunga David",
                "97811111"
        );

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);
        biblioteca.adicionarLivro(l3);

        Aluno aluno = new Aluno(
                "Emanuel Marcos",
                "2025001",
                "Engenharia Informática"
        );

        biblioteca.listarLivros();

        System.out.println("\n=== EMPRÉSTIMOS ===");

        aluno.matricularLivro(l1);
        aluno.matricularLivro(l2);

        aluno.mostrarEmprestimos();

        System.out.println("\n=== DEVOLUÇÃO ===");

        aluno.devolverLivro(l1);

        aluno.mostrarEmprestimos();

        biblioteca.listarDisponiveis();

        System.out.println("\n=== PESQUISA ===");

        Livro encontrado =
                biblioteca.buscarPorTitulo("POO Avançada");

        if (encontrado != null) {
            System.out.println("Livro encontrado:");
            System.out.println(encontrado.info());
        }
    }
}