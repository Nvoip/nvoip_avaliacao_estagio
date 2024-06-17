package com.example.nvoip.model;

public class CalculaSalarioRequestDTO {

    String nome;
    int regimeContratacao;
    Double valorTrabalhador;
    int diasTrabalhados;

    public CalculaSalarioRequestDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRegimeContratacao() {
        return regimeContratacao;
    }

    public void setRegimeContratacao(int regimeContratacao) {
        this.regimeContratacao = regimeContratacao;
    }

    public Double getValorTrabalhador() {
        return valorTrabalhador;
    }

    public void setValorTrabalhador(Double valorTrabalhador) {
        this.valorTrabalhador = valorTrabalhador;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

}
