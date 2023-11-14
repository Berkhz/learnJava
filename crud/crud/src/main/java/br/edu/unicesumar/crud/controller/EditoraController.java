package br.edu.unicesumar.crud.controller;

import br.edu.unicesumar.crud.model.domain.Editora;
import br.edu.unicesumar.crud.model.repository.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editora")
public class EditoraController {

    @Autowired
    private EditoraRepository editoraRepository;

    @GetMapping
    public List<Editora> all(){
        return editoraRepository.findAll();
    }

    @GetMapping("/{id}")
    public Editora getById(@PathVariable Long id) {
        return editoraRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Editora create(@RequestBody Editora editoraNova){
        return editoraRepository.save(editoraNova);
    }

    @DeleteMapping("/{id}")
    public Editora delete(@PathVariable Long id){
        editoraRepository.deleteById(id);
    }
}
