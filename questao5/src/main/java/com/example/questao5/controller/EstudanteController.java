package com.example.questao5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudanteController {

  @Autowired
  private EstudanteService service_estudante;

  @GetMapping("/estudantes")
  public List<Estudante> lista() {
    return service_estudante.lista();
  }

  @GetMapping("/estudantes/{id}")
  public Estudante busca(@PathVariable Long id) {
    return service_estudante.busca(id);
  }

  @PostMapping("/estudantes")
  public String adiciona(@RequestBody Estudantes estudantes) {
    service_estudante.adiciona(Estudantes);
    return "Estudante adicionado com sucesso!";
  }

  @PutMapping("/estudantes")
  public String atualiza(@RequestBody Estudantes estudantes) {
    service_estudante.atualiza(Estudantes);
    return "Estudante atualizado com sucesso";
  }

  @DeleteMapping("/estudantes/{id}")
  public String remove(@PathVariable Long id) {
    service_estudante.remove(id);
    return "Estudante removido com sucesso!";
  }
}
