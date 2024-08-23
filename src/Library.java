import java.util.*;

public class Library {
    Scanner sc = new Scanner(System.in);
    private List<BibliographicItem> item;

    public Library() {
        this.item = new ArrayList<>();
    }

    // Métodos get e set
    public List<BibliographicItem> getItem() {
        return item;
    }

    public void setItem(List<BibliographicItem> item) {
        this.item = item;
    }

    // Adicionar item
    public void addBook(Books book) {
        if (book != null) {
            try {
                item.add(book);
                System.out.println("Livro adicionado com sucesso!");
            } catch (RuntimeException e) {
                System.out.println("Erro ao adicionar o livro! Tente novamente.");
            }
        } else {
            System.out.println("O livro é nulo e não pode ser adicionado.");
        }
    }

    // Listar itens
    public void listBooks() {
        if (item.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (BibliographicItem item : item) {
                System.out.println(item);
            }
        }
    }

    // Buscar item
    public BibliographicItem searchBook(String searchCode) {
        for (BibliographicItem item : item) {
            if (item.getCode().equals(searchCode)) {
                System.out.println("Livro encontrado: " + item.getTitle());
                return item;
            }
        }
        throw new RuntimeException("Livro não encontrado: " + searchCode);
    }

}
