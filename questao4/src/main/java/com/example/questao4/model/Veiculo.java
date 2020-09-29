package com.example.questao4.model;

import java.math.BigDecimal;
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
public class Veiculo {
  private Long id;
  private String modelo;
  private String marca;
  private BigDecimal valorDiaria;
  
  @ManyToOne
  private Categoria categoria;
  
  
}
