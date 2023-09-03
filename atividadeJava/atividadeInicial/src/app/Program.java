package app;

public class Program {

    public static void main(String[] args) {
        String nome = "Kauan";
        String dataNascimento = "01/07/2004";
        int idade = 19;
        Double peso = 50.0;
        Double altura = 1.70;

        Pessoa kauan = new Pessoa(nome, dataNascimento, idade);
        Pessoa pessoa = new Pessoa(peso, altura);

        System.out.println("Nome: " + kauan.getNome());
        System.out.println("Data de Nascimento: " + kauan.getDataNascimento());
        System.out.println("Idade: " + kauan.getIdade());

        pessoa.getPeso();
        pessoa.getAltura();

        double imc = CalcularIMC(peso, altura);
        System.out.println("IMC: " + imc);
    }
    public static Double CalcularIMC(Double peso, Double altura) {
        double resultado = (peso / altura);
        return resultado;
    }
}
