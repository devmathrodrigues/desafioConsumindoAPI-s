package quartoModulo.segundoDesafio;

public class Titulo {
    private String nome;
    private String autor;
    private int anoDeLancamento;

    public Titulo(String nome, String autor, int anoDeLancamento) {
        this.nome = nome;
        this.autor = autor;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
}
