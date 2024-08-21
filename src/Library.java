import java.util.*;

public class Library {
    Scanner sc = new Scanner(System.in);
    private List<BibliographicItem> item;

    public Library(String item) {
        item = new ArrayList<>();
    }

    //Item
    public String getItem() {//get
        return item;
    }
    public void setItem(String item) {//set
        this.item = item;
    }

    //Adicionar item
    public void AddBook(Books book) {
        if (book!=null) {
        }try{
            book.add(book);
        }catch (RuntimeException e) {
            System.out.println("Não foi inserido nenhum livro! tente novamente" );
        }
    }

    //Listar item
    public void ListBooks() {
        for (Books book : book) {
            System.out.println(book);
        }
    }
    //Buscar item
    public void SearchBook(String item, BibliographicItem code, BibliographicItem title) {
        String SearchCode;
        System.out.println("Digite o codigo do livro:"+ sc.next);
        if( SearchCode == code){
            System.out.print("Livro encontrado:" + title);
        }else{
            System.out.print("Livro não encontrado");
        }
    }

}