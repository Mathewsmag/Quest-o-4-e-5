package com.example.questao4;

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
public class Cliente {
  
  private Long id;
  private String nome;
  private String cpf;
  private String email;
}
