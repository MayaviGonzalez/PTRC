package practica23;

/**
 *
 * @author 18PROGB0128
 */
public class Libro {
    //creamos los atributos
    private String titulo;
    private String autor;
    private int numeroejemplaresexistentes;
    private int numeroejemplaresprestados;
    
    //creamos los constructores
    public Libro() {
    }

    public Libro(String titulo, String autor, int numeroejemplaresexistentes, int numeroejemplaresprestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroejemplaresexistentes = numeroejemplaresexistentes;
        this.numeroejemplaresprestados = numeroejemplaresprestados;
    }

    //creamos los get y set
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

    public int getNumeroejemplaresexistentes() {
        return numeroejemplaresexistentes;
    }

    public void setNumeroejemplaresexistentes(int numeroejemplaresexistentes) {
        this.numeroejemplaresexistentes = numeroejemplaresexistentes;
    }

    public int getNumeroejemplaresprestados() {
        return numeroejemplaresprestados;
    }

    public void setNumeroejemplaresprestados(int numeroejemplaresprestados) {
        this.numeroejemplaresprestados = numeroejemplaresprestados;
    }

    
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", numeroejemplaresexistentes=" + numeroejemplaresexistentes + ", numeroejemplaresprestados=" + numeroejemplaresprestados + '}';
    }
    
    
}
