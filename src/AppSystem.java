import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppSystem {
    private List<Books> books;
    private Library library;
    private Scanner sc;

    public AppSystem() {
        this.books = new ArrayList<>();
        this.library = new Library();
        this.sc = new Scanner(System.in);
    }

    public void run() {
        int control = 0;
        while (control == 0) {
            int option = IO.menu();
            if (option == 1) {
                addBooks(); // Adiciona livros
            } else if (option == 2) {
                listBooks(); // Lista livros
            } else if (option == 3) {
                searchBooks(); // Busca livros
            } else if (option == 0) {
                control = 1;
                System.out.println("Fim do programa");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
        sc.close();
    }

    // Adiciona livros
    private void addBooks() {
        System.out.println("Digite os detalhes do livro:");
        System.out.print("Título: ");
        String title = sc.nextLine();
        System.out.print("Código: ");
        String code = sc.nextLine();
        System.out.print("Ano de Publicação: ");
        int year;
        while (true) {
            try {
                year = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ano inválido. Por favor, insira um número.");
                System.out.print("Ano de Publicação: ");
            }
        }
        System.out.print("Autor: ");
        String author = sc.nextLine();
        System.out.print("ISBN: ");
        String isbn = sc.nextLine();

        Books newBook = new Books(author, isbn, title, code, year);
        if (newBook.validateItemBooks()) {
            library.addBook(newBook);
        } else {
            System.out.println("Livro inválido. Verifique os detalhes e tente novamente.");
        }
    }

    // Lista todos os livros
    private void listBooks() {
        library.listBooks();
    }

    // Busca um livro
    private void searchBooks() {
        System.out.print("Digite o código do livro para buscar: ");
        String code = sc.nextLine();
        library.searchBook(code);
    }
}
