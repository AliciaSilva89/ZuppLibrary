import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppSystem {
    private List<Books> books;

    public AppSystem() {
        this.books = new ArrayList<>();
    }

    public void run() {
        int control = 0;
        while (control == 0) {
            int option = IO.menu();
            if (option == 1) {
                Library addBooks();
            } else if (option == 2) {
                Library listBooks();
            } else if (option == 3) {
                Library searchBooks();
            } else {
                System.out.println("Opção invalida!");
            }
        }
    }
}
