package br.edu.unicesumar.crud.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "ES_EDITORA")
public class Editora {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;

    @Column(name = "ano_fundacao", length = 4)
    private Integer ano;

    public Editora(long id, String nome, int ano) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
    }

    public Editora() {
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
