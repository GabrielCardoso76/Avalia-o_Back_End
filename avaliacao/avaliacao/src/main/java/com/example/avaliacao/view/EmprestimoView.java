package com.example.avaliacao.view;

import com.example.avaliacao.controller.EmprestimoController;
import com.example.avaliacao.model.Cliente;
import com.example.avaliacao.model.Emprestimo;
import com.example.avaliacao.model.Livro;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimo")
public class EmprestimoView {
    EmprestimoController emprestimoController = new EmprestimoController();

    @GetMapping
    public List<Emprestimo> findAll(){
        return emprestimoController.findAll();
    }
    @GetMapping("/{id}")
    public Emprestimo getById(@PathVariable int id){
        return emprestimoController.getById(id);
    }
    @PostMapping
    public boolean insert(@RequestBody Emprestimo emprestimo){
        return emprestimoController.insert(emprestimo);
    }
    @PutMapping("/addLivrosEmprExistenteEDataF/{livro}")
    public boolean update(@PathVariable int id,@RequestBody Emprestimo emprestimo,@RequestBody Livro livro){
        return emprestimoController.update(id, emprestimo, livro);
    }
    @PutMapping("/attClienteJaTemUmEmprestimo/{cliente}")
    public Emprestimo updateClienteAndEmprestimo(@PathVariable int id,@RequestBody Cliente cliente){
        return emprestimoController.updateClienteAndEmprestimo(id, cliente);
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id){
        return emprestimoController.delete(id);
    }

}
