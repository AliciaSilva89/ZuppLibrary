public class App {
    public static void main(String[] args) {
        try {
            AppSystem appSystem = new AppSystem();
            appSystem.run();
        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

