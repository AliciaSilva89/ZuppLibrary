public class IO {
    public static Scanner input(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }

    public static int menu(){
        StringBuilder model = new StringBuilder();
        System.out.println("--------------------------------");
        model.append(" 1- Cadastrar Livro");
        model.append("\n");
        model.append("2-Listar Livros");
        model.append("\n");
        model.append("3-Buscar Livro");
        System.out.println("--------------------------------");

        System.out.println(model);
        return new Scanner(System.in).nextInt();
    }
}
