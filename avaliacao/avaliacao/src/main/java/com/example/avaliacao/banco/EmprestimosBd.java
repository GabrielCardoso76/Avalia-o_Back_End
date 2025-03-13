package com.example.avaliacao.banco;


import com.example.avaliacao.model.Cliente;
import com.example.avaliacao.model.Emprestimo;
import com.example.avaliacao.model.Livro;

import java.util.ArrayList;
import java.util.List;

public class EmprestimosBd {

    private List<Emprestimo> emprestimos;
    public EmprestimosBd(){
        this.emprestimos = new ArrayList<>();
    }

    //consulta de todos os empréstimos registrados
    public List<Emprestimo> findAll(){
        return new ArrayList<>(emprestimos);
    }
    public Emprestimo getById(int id){
        return emprestimos.stream()
                .filter(d -> d.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public boolean insert(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
        return true;
    }
    //adicionar novos livros a um empréstimo existente, bem como atualizar a data final do empréstimo
    public boolean update(int id, Emprestimo emprestimo, Livro livro){
        Emprestimo emprestimoBd = emprestimos.stream()
                .filter(emprestimo1 -> emprestimo1.getId() == id)
                .findFirst()
                .orElse(null);

        if (emprestimoBd == null){
            return false;
        }
        emprestimoBd.getLivro().add(livro);
        emprestimoBd.setData_fim(emprestimo.getData_fim());


        return true;
    }

    //atualizar os dados do cliente que realizou o empréstimo
    public boolean updateClienteAndEmprestimo(int id, Cliente cliente){
        Emprestimo emprestimoBd = emprestimos.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);

        if (emprestimoBd != null){
            return false;
        }
        //emprestimoBd.setCliente(cliente.getNome());
        //emprestimoBd.setCliente(cliente.getCpf());
        //emprestimoBd.setCliente(cliente.getEmail());
        //rever telefone depois
        //emprestimoBd.setCliente(String.valueOf(cliente.getTelefone()));

        return true;
    }
    public boolean delete(int id){
        Emprestimo emprestimoBd = emprestimos.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);

        if (emprestimoBd == null){
            return false;
        }

        emprestimos.remove(emprestimoBd);

        return true;
    }
}
