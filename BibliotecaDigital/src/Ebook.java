class Ebook extends ItemBibliotecaDigital implements Baixavel, Visualizavel{
    public Ebook(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public String descricao() {
        return "Ebook: " + getTitulo() + ", por " + getAutor();
    }

    @Override
    public void baixar() {
        System.out.println("Baixando ebook...");
    }

    @Override
    public void visualizar() {
        System.out.println("Visualizando ebook...");
    }
}
