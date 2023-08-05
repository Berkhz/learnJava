import Transporte.TransporteTerrestre;
import Transporte.TransporteNautico;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransporteTerrestre transporteTerrestre = new TransporteTerrestre();
        TransporteNautico transporteNautico = new TransporteNautico();

        System.out.println("Qual tipo de transporte você deseja calcular o frete?");
        System.out.println("1 - Transporte Terrestre");
        System.out.println("2 - Transporte Náutico");
        int expressao = scanner.nextInt();
        switch (expressao) {
            case 1:
                System.out.println("Valor da altura?");
                Double alturaTerrestre = scanner.nextDouble();

                System.out.println("Valor da largura?");
                Double larguraTerrestre = scanner.nextDouble();

                if (alturaTerrestre <= 0 || larguraTerrestre <= 0)
                    System.out.println("Altura/Largura não pode ser menor ou igual a 0!");
                else
                    System.out.println(transporteTerrestre.calculaFrete(alturaTerrestre, larguraTerrestre));
                break;
            case 2:
                System.out.println("Valor da altura?");
                Double alturaNautico = scanner.nextDouble();

                System.out.println("Valor da largura?");
                Double larguraNautico = scanner.nextDouble();

                if (alturaNautico <= 0 || larguraNautico <= 0)
                    System.out.println("Altura/Largura não pode ser menor ou igual a 0!");
                else
                    System.out.println(transporteNautico.calculaFrete(alturaNautico, larguraNautico));
                break;
            default:
                System.out.println("Frete não encontrado, tente novamente!");
                break;
        }
    }
}