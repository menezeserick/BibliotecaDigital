public class Main {
    public static void main(String[] args) {
        ItemBibliotecaDigital ebook1 = new Ebook("Amoras", "Emicida");
        ItemBibliotecaDigital ebook2 = new Ebook("O lapis e a Borracha", "Rosângela Carvalho");
        ItemBibliotecaDigital video1 = new VideoDigital("Bob Esponja: O incrivel resgate", "Bob Esponja");
        ItemBibliotecaDigital video2 = new VideoDigital("Transforme sua vida", "Paulo Marçal");

        System.out.println(ebook1.descricao());
        System.out.println(ebook2.descricao());
        System.out.println(video1.descricao());
        System.out.println(video2.descricao());

        ((Baixavel) ebook1).baixar();
        ((Baixavel) ebook2).baixar();
        ((Baixavel) video1).baixar();
        ((Baixavel) video2).baixar();

        ((Visualizavel) ebook1).visualizar();
        ((Visualizavel) video1).visualizar();
    }
}