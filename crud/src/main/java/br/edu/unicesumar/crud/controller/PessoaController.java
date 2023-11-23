package br.edu.unicesumar.crud.controller;

import br.edu.unicesumar.crud.model.domain.Pessoa;
import br.edu.unicesumar.crud.model.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping
    public List<Pessoa> all() {
        return pessoaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Pessoa getById(@PathVariable Long id) {
        return pessoaRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Pessoa create(@RequestBody Pessoa nova) {
        return pessoaRepository.save(nova);
    }

    @PutMapping("/{id}")
    public Pessoa update(@PathVariable Long id, @RequestBody Pessoa pessoaAtualizada) {
        return pessoaRepository.findById(id)
                .map(pessoa -> {
                    pessoa.setNome(pessoaAtualizada.getNome());
                    pessoa.setDocumento(pessoaAtualizada.getDocumento());
                    return pessoaRepository.save(pessoa);
                })
                .orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        pessoaRepository.deleteById(id);
    }

}
