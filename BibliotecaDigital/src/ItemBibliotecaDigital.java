import java.util.Objects;

public abstract class ItemBibliotecaDigital {
    private String titulo;
    private String autor;

    public ItemBibliotecaDigital(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public abstract String descricao();
}

interface Baixavel {
    void baixar();
}

interface Visualizavel {
    void visualizar();
}

