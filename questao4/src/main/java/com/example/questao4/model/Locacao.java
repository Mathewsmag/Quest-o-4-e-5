package com.example.questao4.model;

import java.math.BigDecimal;
import java.util.Date;

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
public class Locacao {
  private Long id;
  private Date data;
  private int quatindadeDiarias;
  private BigDecimal valorDiaria;
}
