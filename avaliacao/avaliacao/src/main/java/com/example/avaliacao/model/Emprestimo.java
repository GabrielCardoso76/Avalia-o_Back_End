package com.example.avaliacao.model;

import java.util.ArrayList;

public class Emprestimo {

    private int id;
    private String data_inicio;
    private String data_fim;
    private ArrayList<Livro> livro;
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

    public ArrayList<Livro> getLivro() {
        return livro;
    }

    public void setLivro(ArrayList<Livro> livro) {
        this.livro = livro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Emprestimo(int id, String data_inicio, String data_fim, ArrayList<Livro> livro, Cliente cliente) {
        this.id = id;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.livro = livro;
        this.cliente = cliente;
    }
}
