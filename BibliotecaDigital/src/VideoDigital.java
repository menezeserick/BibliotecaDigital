class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {
    public VideoDigital(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public String descricao() {
        return "Vídeo Digital: " + getTitulo() + ", por " + getAutor();
    }

    @Override
    public void baixar() {
        System.out.println("Baixando vídeo digital...");
    }

    @Override
    public void visualizar() {
        System.out.println("Visualizando vídeo digital...");
    }
}