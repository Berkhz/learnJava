package app;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private Integer idade;
    private Double peso;
    private Double altura;

    public Pessoa(String nome, String dataNascimento, Integer idade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }
    public Pessoa(Double peso, Double altura) {
        this.peso = peso;
        this.altura = altura;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
