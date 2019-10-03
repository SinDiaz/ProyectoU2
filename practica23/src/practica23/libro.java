
package practica23;

/**
 *
 * @author 18PROGB0133
 */
public class libro {
  private String Autor;
  private String Titulo;
   private String ISBN;
   private String Paginas;

    public libro() {
    }

    public libro(String Autor, String Titulo, String ISBN, String Paguinas) {
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.ISBN = ISBN;
        this.Paginas = Paguinas;
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPaguinas() {
        return Paginas;
    }

    public void setPaguinas(String Paguinas) {
        this.Paginas = Paguinas;
    }

    @Override
    public String toString() {
        return "libro{" + "Autor=" + Autor + ", Titulo=" + Titulo + ", ISBN=" + ISBN + ", Paguinas=" + Paginas + '}';
    }
   
   
}
