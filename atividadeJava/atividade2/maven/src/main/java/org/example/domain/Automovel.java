package org.example.domain;

import org.example.domain.enums.TipoAuto;

public class Automovel {
    private Double valorFipe;
    private TipoAuto tipoAuto;

    public Automovel(Double valorFipe, TipoAuto tipoAuto) {
        this.valorFipe = valorFipe;
        this.tipoAuto = tipoAuto;
    }
}
