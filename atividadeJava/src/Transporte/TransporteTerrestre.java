package Transporte;

public class TransporteTerrestre extends Transportadora {
    public TransporteTerrestre() {
    }
    @Override
    public Double calculaFrete(Double altura, Double largura) {
        return (altura / largura) * 0.2;
    }
}
