package Transporte;

public class TransporteNautico extends Transportadora {
    public TransporteNautico() {
    }
    @Override
    public Double calculaFrete(Double altura, Double largura) {
        return (altura + largura) * 0.1;
    }
}
