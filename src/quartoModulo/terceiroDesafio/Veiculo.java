package quartoModulo.terceiroDesafio;

public class Veiculo {
    private String marca;
    private String nome;
    private int anoDoCarro;
    private double quilometragem;

    public Veiculo(String marca, String nome, int anoDoCarro, double quilometragem) {
        this.marca = marca;
        this.nome = nome;
        this.anoDoCarro = anoDoCarro;
        this.quilometragem = quilometragem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDoCarro() {
        return anoDoCarro;
    }

    public void setAnoDoCarro(int anoDoCarro) {
        this.anoDoCarro = anoDoCarro;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
}
