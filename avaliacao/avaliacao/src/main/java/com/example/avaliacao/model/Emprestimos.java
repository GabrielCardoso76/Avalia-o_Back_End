package com.example.avaliacao.model;

public class Emprestimos {

    private String data_inicio;
    private String data_fim;
    private String livros_emprestados;
    private Cliente cliente;

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getData_fim() {
        return data_fim;
    }

    public void setData_fim(String data_fim) {
        this.data_fim = data_fim;
    }

    public String getLivros_emprestados() {
        return livros_emprestados;
    }

    public void setLivros_emprestados(String livros_emprestados) {
        this.livros_emprestados = livros_emprestados;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
