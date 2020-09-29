package com.example.questao4.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EntityScan
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Categoria {
  private Long id;
  private String nome;
}
