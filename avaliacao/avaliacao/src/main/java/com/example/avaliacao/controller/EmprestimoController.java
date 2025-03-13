package com.example.avaliacao.controller;

import com.example.avaliacao.banco.EmprestimosBd;
import com.example.avaliacao.model.Cliente;
import com.example.avaliacao.model.Emprestimo;
import com.example.avaliacao.model.Livro;

import java.util.List;

public class EmprestimoController {

    EmprestimosBd repository = new EmprestimosBd();

    public List<Emprestimo> findAll(){
        return repository.findAll();
    }
    public Emprestimo getById(int id){
        return repository.getById(id);
    }
    public boolean insert(Emprestimo emprestimo){
        return repository.insert(emprestimo);
    }
    public boolean update(int id, Emprestimo emprestimo, Livro livro){
        return repository.update(id, emprestimo, livro);
    }
    public boolean updateClienteAndEmprestimo(int id, Cliente cliente){
        return repository.updateClienteAndEmprestimo(id, cliente);
    }
    public boolean delete(int id){
        return repository.delete(id);
    }
}
