package com.example.questao5.repositories;

import org.springframework.stereotype.Repository;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, Long>  {
  
}
