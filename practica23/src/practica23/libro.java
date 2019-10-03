package practica23;

/**
 *
 * @author 18PROGB0133
 */
public class libro {

    private String Autor;
    private String Titulo;
    private int ISBN;
    private int Paginas;

    public libro() {
    }

    public libro(String Autor, String Titulo, int ISBN, int Paginas) {
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.ISBN = ISBN;
        this.Paginas = Paginas;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }

    @Override
    public String toString() {
        return "libro{" + "Autor=" + Autor + ", Titulo=" + Titulo + ", ISBN=" + ISBN + ", Paginas=" + Paginas + '}';
    }


}
