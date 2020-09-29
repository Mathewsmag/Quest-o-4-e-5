package com.example.questao5.services;

import com.example.questao5.repositories.EstudanteRepository;

import org.springframework.beans.factory.annotation.Autowired;

@service
public class EstudanteService {
      
  @Autowired
  EstudanteRepository repo_estudante;
  
  public List<Estudante> lista() {
      return repo_estudante.findAll();
  }

  public Estudante busca(Long id) {
      Optional<Estudante> Estudante = repo_estudante.findById(id);
      return Estudante.orElse(null);
  }

  public void adiciona(Estudante Estudante) {
      Estudante.setId(null);
      repo_estudante.save(Estudante);
  }

  public void atualiza(Estudante Estudante) {
      repo_estudante.save(Estudante);
  }

  public void remove(Long id) {
      repo_estudante.deleteById(id);
  }
}
