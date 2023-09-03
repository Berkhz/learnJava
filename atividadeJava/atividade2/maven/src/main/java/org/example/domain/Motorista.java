package org.example.domain;

import org.example.domain.enums.EstadoCivil;
import org.example.domain.enums.TipoAuto;

public class Motorista extends Pessoa {
    private Automovel automovel;
    private Estacionamento estacionamento;

    public Motorista(String nome, EstadoCivil estadoCivil, Automovel automovel) {
        super(nome, estadoCivil);
        this.automovel = automovel;
    }
}
